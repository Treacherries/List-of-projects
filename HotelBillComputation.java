package Final_Project;

import java.util.Scanner;
import java.text.DecimalFormat;

public class HotelBillComputation {
    static Scanner user = new Scanner(System.in);
        static DecimalFormat twodec = new DecimalFormat("0.00");
        static double std = 1800.00, dxl = 2300.00, sui = 3000.00, tax = 0.12;

        public static void main(String[] args) {

            while(true){
                ui();
                System.out.print("Select Room type       : ");
                int input = user.nextInt();
                System.out.println("\n=======================================\n");
    
    
                switch(input){
                    case 1:{
                        standard();
                        break;
                    }
                    case 2:{
                        deluxe();
                        break;
                    }
                    case 3:{
                        suite();
                        break;
                    }
                    case 0:{
                        System.out.println("Thank you for using the Hotel Bill Computation System. Goodbye!\n");
                        return;
                    }
                    
                    default: {
                        System.out.println("\n|| Invalid Room type! ||\n");
                    }
                }
            }
        }
            
        public static void ui(){
            System.out.println("=======================================\n");
            System.out.println("     Hotel Bill Computation\n");   
            System.out.println("    Room type        Rate");
            System.out.println("(1) Standard        " + twodec.format(std)  );
            System.out.println("(2) Deluxe          " + twodec.format(dxl));
            System.out.println("(3) Suite           " + twodec.format(sui));
            System.out.println("\n\n(0) Exit");
            System.out.println("=======================================\n");
        }
        
        public static void standard(){
            System.out.println("Additional guest       : Not Allowed");
            System.out.print("Number of Nights stayed: ");
            int input3 = user.nextInt();

            while(true){
            System.out.print("Number of guest  (1-2) : ");
            int input2 = user.nextInt();

            if(input2>=1 && input2<3){
            while(true){
                    double std_total = std*input3*input2;

                    System.out.println("Room price             : " + twodec.format(std_total));
                    System.out.println("VAT tax                : " + twodec.format(tax*std_total));
                    System.out.println("\nTotal bill             : \n" + twodec.format(std_total + tax));
                    return;
                    }
                    
                }
                else{
                    System.out.println("\n || Only 2 Maximum of guests! || ");
                    System.out.println("\n=======================================\n");
                }
            }
        }    

        public static void deluxe(){
            double extax = 0.10;
            
            System.out.print("Number of nights stayed: ");
            int input4 = user.nextInt();

            while(true){
            System.out.print("Number of guest  (1-2) : ");
            int input2 = user.nextInt();
        
            if(input2>=1 && input2<3){
                while(true){
                System.out.print("Additional guest   (1) : ");
                int input3 = user.nextInt();
                    if(input3>=0 && input3<2){
                        while(true){
                        double dxl_total = dxl * input2 * input4;
                        double extraCharge = extax*(input3*dxl);
                        double vat = tax * (dxl_total + extraCharge);
                        double totalBill = dxl_total + extraCharge + vat;
        
                        System.out.println("Room price             : " + twodec.format(dxl_total));
                        System.out.println("Additional charge      : " + twodec.format(extraCharge));
                        System.out.println("VAT tax                : " + twodec.format(vat));
                        System.out.println("\nTotal bill             : \n" + twodec.format(totalBill));
                        return;
                    }
                }
                    else{
                        System.out.println("\n|| Only Maximum of 1 Additional guest allowed! ||");
                        System.out.println("\n=======================================\n");
                    }
                }
            }
                else {
                    System.out.println("\n|| Only Maximum of 2 guests! ||");
                    System.out.println("\n=======================================\n");
                }
            }
        }

        public static void suite(){
                double extax = 0.10;
                
                System.out.print("Number of night stayed: ");
                int input4 = user.nextInt();

                while(true){
                System.out.print("Number of guest  (1-4) : ");
                int input2 = user.nextInt();
            
                if(input2>=1 && input2<=4){
                    while(true){
                    System.out.print("Additional guest (0-2) : ");
                    int input3 = user.nextInt();
                    if(input3>=0 && input3<=2){
                        while(true){
                        double sui_total = sui * input2 * input4;
                        double extraCharge = extax * (input3 * sui);
                        double vat = tax * (sui_total + extraCharge);
                        double totalBill = sui_total + extraCharge + vat;

                        System.out.println("Room price             : " + twodec.format(sui_total));
                        System.out.println("Additional charge      : " + twodec.format(extraCharge));
                        System.out.println("VAT tax                : " + twodec.format(vat));
                        System.out.println("\nTotal bill             : \n" + twodec.format(totalBill));
                        return;
                    }
                }
                    else{
                    System.out.println("\n|| Only Maximum of 2 Additional guests allowed! ||");
                    System.out.println("\n=======================================\n");
                    }
                }
            }
                else {
                System.out.println("\n|| Only Maximum of 4 guests! ||");
                System.out.println("\n=======================================\n");
            }  
        }
    }
}

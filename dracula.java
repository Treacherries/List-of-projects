import java.util.Scanner;
import java.text.DecimalFormat;

public class dracula{
        static Scanner user = new Scanner(System.in);
        static DecimalFormat twodec = new DecimalFormat("0.00");
        static double std = 1800.00; 
        static double dxl = 2300.00;
        static double sui = 3000.00; 
        static double tax = 0.12;
            
        public static void ui(){
            System.out.println("=======================================\n");
            System.out.println("     Hotel Bill Computation\n");   
            System.out.println("    Room type        Rate");
            System.out.println("(1) Standard        " + twodec.format(std) + "\n(2) Deluxe          " + twodec.format(dxl) + "\n(3) Suite           " + twodec.format(sui) +"\n\n(0) Exit");
            System.out.println("=======================================\n");
        }
    
        public static void standard(){
            System.out.println("Additional guest       : Not Allowed");
            System.out.print("Number of guest        : ");
            int input2 = user.nextInt();
            //checks if user has input approriate amount of guest
            if(input2>=1 && input2<3){
                System.out.println("Room price             : " + twodec.format(std*=input2));
                System.out.println("VAT tax                : " + twodec.format(tax*=std));
                System.out.println("\n=======================================");
                System.out.println("\nTotal bill             : " + twodec.format(std + tax));
                return;
                }
                else{
                    System.out.println("\n || Only 2 Maximum of guests! || ");
                    System.out.println("\n=======================================\n");
                }
        }
    
        public static void deluxe(){
            double extax = 0.10;
    
            System.out.print("Number of guest        : ");
            int input2 = user.nextInt();
        
            if(input2>=1 && input2<3){
                System.out.print("Additional guest       : ");
                int input3 = user.nextInt();
                    if(input3>=0 && input3<2){
                        double totalBasePrice = dxl * input2;
                        double extraCharge = extax * (input3 * dxl);
                        double vat = tax * (totalBasePrice + extraCharge);
                        double totalBill = totalBasePrice + extraCharge + vat;
        
                        System.out.println("Room price             : " + twodec.format(totalBasePrice));
                        System.out.println("Additional charge      : " + twodec.format(extraCharge));
                        System.out.println("VAT tax                : " + twodec.format(vat));
                        System.out.println("\n=======================================");
                        System.out.println("\nTotal bill             : " + twodec.format(totalBill));
                    }
                    else{
                        System.out.println("\n|| Only Maximum of 1 Additional guest allowed! ||");
                        System.out.println("\n=======================================\n");
                    }
                }
                else {
                    System.out.println("\n|| Only Maximum of 2 guests! ||");
                    System.out.println("\n=======================================\n");
                }
        }
    
        public static void suite(){
                double extax = 0.10;
    
                System.out.print("Number of guest        : ");
                int input2 = user.nextInt();
            
                if(input2>=1 && input2<=4){
                    System.out.print("Additional guest       : ");
                    int input3 = user.nextInt();
                    if(input3>=0 && input3<=2){
                        double totalBasePrice = sui * input2;
                        double extraCharge = extax * (input3 * sui);
                        double vat = tax * (totalBasePrice + extraCharge);
                        double totalBill = totalBasePrice + extraCharge + vat;

                        System.out.println("Room price             : " + twodec.format(totalBasePrice));
                        System.out.println("Additional charge      : " + twodec.format(extraCharge));
                        System.out.println("VAT tax                : " + twodec.format(vat));
                        System.out.println("\n=======================================");
                        System.out.println("\nTotal bill             : " + twodec.format(totalBill));
                    }
                    else{
                    System.out.println("\n|| Only Maximum of 2 Additional guests allowed! ||");
                    System.out.println("\n=======================================\n");
                    }
                }
                else {
                System.out.println("\n|| Only Maximum of 4 guests! ||");
                System.out.println("\n=======================================\n");
                }

        }

    public static void main(String[] args) {

        while(true){
            ui();
            System.out.print("Select Room type       : ");
            int input = user.nextInt();
            System.out.println("\n=======================================\n");

            if (input == 0) {
                System.out.println("Thank you for using the Hotel Bill Computation System. Goodbye!");
                break;
            }

            switch(input){
                case 1:{
                    standard();
                }
                break;
                case 2:{
                    deluxe();
                }
                break;
                case 3:{
                    suite();
                }
                break;
                default: {
                    System.out.println("\n|| Invalid Room type! ||\n");
                }
            }
        }
    }
}

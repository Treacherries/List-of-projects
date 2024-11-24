import java.util.Scanner;

public class dracula {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

    // room names and prices
        double std = 1800.00; 
        double dxl = 2300.00;
        double sui = 3000.00; 
// ui of room type
        System.out.println("=======================================\n");
        System.out.println("    Room type       Rate");
        System.out.println("(1) Standard        1800.00 \n(2) Deluxe          2300.00 \n(3) Suite           3000.00\n");
        System.out.println("=======================================\n");
        
// while makes the code run until user enters a valid room type; if it's not allowed then just remove the while along with the braces and put a "return;" in the else statement!
        while(true){
        System.out.print("Select Room type: ");
        int input = user.nextInt();

            if (input == 1){
                System.out.println("Test 1");
                return;
            }
            
                else if (input == 2){
                    System.out.println("Test 2");
                    return;
                }
                    else if (input == 3){
                        System.out.println("Test 3");
                        return;
                    }
                    else {
                        System.out.println("\n|| Invalid Room type! ||\n");
                    }           
        }
    }   
}

import java.util.InputMismatchException;
import java.util.Scanner;

public class battleship {
    public static void main(String[] args) {
        
    
        System.out.println("Multiplication table");

        Scanner var = new Scanner (System.in);
        try {  
            int i;
            
            System.out.print("Input a number: ");
            int j = var.nextInt();


            System.out.println("Multiples of " + j);

        for (i= 1; i <= 10; i++ ){
            
            System.out.print( j + " x " + i + " = ");
            System.out.println( i * j);

        }
    }  catch (InputMismatchException e) {
        System.out.println("Input Invalid! Please enter a real number.");
    } finally {
        var.close();
       }
      
    }
}

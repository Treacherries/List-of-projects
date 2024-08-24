import java.util.Scanner;
public class Hello {
    public static void main(String[] args) 
    {
        
        try (Scanner love = new Scanner (System.in)) {
            System.out.println("Hello! What is your name?");

            String name = love.nextLine();
            System.out.println("Hello " + name + "!");

            try (Scanner gender = new Scanner(System.in)) {
                System.out.println("What is your gender? (Male or Female)");
      
      String choice = gender.nextLine();

                switch (choice) {
                    case "Male":
                        System.out.println(name + "You are a Male!");
                        
                        break;
                    
                    case "Female":
                        System.out.println(name + "You are a Female!");
                  
                }
            }
    }
    
}
}
// Really proud of this one since I didn't use a video tutorial! 
// I hope I'll stay like this :)
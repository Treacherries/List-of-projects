import java.util.ArrayList;
import java.util.Scanner;

public class draft {

    static Scanner input = new Scanner(System.in);
    static ArrayList<String> students = new ArrayList<>();

    static String name;
    static String sn;
    static String course;

    public static void Main_menu(){
        /*Create an if statement here where if theres no students inside make edit and delete option unavailable and available if there is (done) */

        System.out.println("========================================================");
        System.out.println();
        System.out.println("Welcome to the Student Information System!");
        System.out.println();
        System.out.println("========================================================");

        System.out.println("1. Create New Student");
        System.out.println("2. View Student Information");
        System.out.println("3. Edit Student Information");
        System.out.println("4. Delete Student Information");
        System.out.println("5. Exit");
        System.out.println();
    }

    public static void Redirect(){
        System.out.println("Please press Enter to return to the main menu.");
        input.nextLine();
    }

    public static void Create_User(){
        /*figure a way to store it (done)*/
        System.out.print("Name: ");
        name = input.nextLine();

        System.out.print("Student Number: ");
        sn = input.nextLine();

        System.out.print("Course: ");
        course = input.nextLine();

        String studentInfo = (name + "\t\t" + sn + "\t\t" + course );
        students.add(new String(studentInfo));

        System.out.println("\nStudent added Successfully!\n");
    }

    public static void View_Student(){

        System.out.println();
        System.out.println("No.\tName\t\tStudent Number\tCourse" );
        for(int i = 0; i < students.size(); i++){
            System.out.println( i + "\t" + students.get(i) );
        }
        Redirect();
    }

    public static void Edit_Students(){
        System.out.println("Enter the No. to edit: ");
        String ado = input.nextLine();  
        System.out.println();

        for(int i = 0; i<students.size(); i++){
            if(ado.equals(i)){
                String choice = "";
                System.out.println("Which would you like to edit: ");
                System.out.println("1. Name\t 2. Student Number \t3. Course\t4. Exit");

                switch(choice){
                    case "1":
                    System.out.println("Input: ");
                    name = input.nextLine();
                    System.out.println("Name has successfully edited!");
                    break;

                    case "2":
                    System.out.println("Input: ");
                    sn = input.nextLine();
                    System.out.println("Student Number has successfully edited!");
                    break;

                    case "3":
                    System.out.println("Input: ");
                    course = input.nextLine();
                    System.out.println("Course has successfully edited!");
                    break;

                    case "4":
                    System.out.println("Exitting...");
                    break;
                }
            }
        }
    }

    public static void Remove_Students(){
        System.out.println();
        System.out.println("Enter the No. to remove: ");
        String oda = input.nextLine();
    }

    
    public static void main (String [] args){
        
        String choice = "";
        

        while(true){
        Main_menu();

        choice = input.nextLine();
        System.out.println();

        switch(choice) {
            case "1":
                Create_User();
            break;

            case "2":
            if(!students.isEmpty()){
                View_Student();
            } 
            else {
                System.out.println("There is no Student available!\n");}
                Redirect();
            break;

            case "3":
            if(!students.isEmpty()){
                Edit_Students();
            }
            else{
                System.out.println("There is no Student avaliable!\n");
                Redirect();
            }
            break;

            case "4":
            if(!students.isEmpty()){

            }
            else{
                System.out.println("There is no Student avaliable!\n");
                Redirect();
            }
            break;

            case "5":
            System.out.println("Goodbye! :]");
            System.out.println();
            return;
            
            default:
            System.out.println("Invalid input.");
            Redirect();
        }
    
        }
    }
}

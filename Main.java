import java.util.Scanner;
import java.util.ArrayList;


public class main {
    public static void main(String[] args) {
        //UserManager manager = new UserManager();
        //Scanner input = new Scanner(System.in);
        int choice;

        Scanner input = new Scanner(System.in);
        LibrarySystem lib = new LibrarySystem(); // Create an instance

         // MENU
         System.out.println("Menu:");         
         //System.out.println("1 - Account Management"); 
         System.out.println("2 - Available Literary Works");
         //System.out.println("3 - Borrow a Literary Work");
         //System.out.println("4 - Return a Literary Work");
         //System.out.println("5 - Borrowing History"); 
         //System.out.println("6 - Literary Work History");
         //System.out.println("0 - Exit"); 
         //System.out.print("Enter your choice: ");
         choice = input.nextInt();

         switch (choice) {
            //case 1: // add/view/edit/delete user account
            //manager.startMenu();
                //break;

            case 2: //Available Literary Works
                System.out.println("Available Literary Works:");
                lib.assetManagement(); 
                break;
            /*case 3: //Borrow a Literary Work
                System.out.println("Borrow a Literary Work:");
                // Code to borrow a literary work goes here
                break;
            case 4: //Return a Literary Work
                System.out.println("Return a Literary Work:");
                // Code to return a literary work goes here
                break;
            case 5: //Borrowing History
                System.out.println("Borrowing History:");
                // Code to display borrowing history goes here
                break;
            case 6: //Literary Work History
                System.out.println("Literary Work History:");
                // Code to display literary work history goes here
                break;*/
            case 0: //Exit
                System.out.println("Thank you for using the program. Goodbye!");
                System.out.println("Group RamGPT: Palomo, Calonge, Manasis, Abit");
                System.exit(0);
                break;

            default:
                System.out.println("Invalid choice. Please try again."); 
                break;   
         }


    }
}

import java.util.Scanner;

public class Menu_System {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the menu system : ");
        System.out.println("1. Display a message :");
        System.out.println("2. perform a calculation :");
        System.out.println("3. Exit :");

        System.out.println("Enter your choice (1-3)");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You selected : Display a message");
                System.out.println("Hello User");
                break;

            case 2:
                System.out.println("You selected : Perform a Calculation");
                System.out.print("Enter first value :");
                int n1 = sc.nextInt();
                System.out.print("Enter second value :");
                int n2 = sc.nextInt();
                System.out.print("Addition of two value is :"+(n1+n2));
                 break;


            case 3:

                System.out.print("Exit  the Program");
                  break;

            default:
                System.out.println("Invalid Choice");

        }

    }
}

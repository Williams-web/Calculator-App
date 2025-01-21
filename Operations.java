import java.util.Scanner;

public class Operations {
    Scanner input = new Scanner(System.in);

    public void add() {
        System.out.println("Enter two numbers to add: ");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("The sum is: " + (a + b));
    }

    public void subtract() {
        System.out.println("Enter two numbers to subtract: ");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("The difference is: " + (a - b));
    }

    public void multiply() {
        System.out.println("Enter two numbers to multiply: ");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("The product is: " + (a * b));
    }

    public void divide(){
        System.out.println("Enter two numbers");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("The result is " + (a / b));
    }

    public void modulus(){
        System.out.println("Enter two numbers");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("The result is " + (a % b));
    }

    public void menu(){
        System.out.println("Welcome to the calculator App");
        System.out.println("Choose an operation: ");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Modulus");
        System.out.println("6. Exit");
        System.out.println("Enter your choice: ");

        int choice = input.nextInt();
        switch (choice){
            case 1 :
                add();
                break;
            case 2:
                subtract();
                break;
            case 3:
                multiply();
                break;
            case 4:
                divide();
                break;
            case 5:
                modulus();
                break;
            case 6:
                System.out.println("Goodbye!");
                return;
            default:
                System.out.println("Invalid choice! Please enter a valid choice.");
        }
        // We will keep upgrading our calculator app each day to make it perfect!!
    }
}

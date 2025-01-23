import java.util.Scanner;

public class Operations {
    Scanner input = new Scanner(System.in);

    public void add() {
        System.out.println("choose an option \n" +
                            "1. Integer values \n" +
                            "2. Double values \n");

        int addType = input.nextInt();
        if(addType == 1) {
            System.out.println("Enter two integer numbers to add: ");
            int a = input.nextInt();
            int b = input.nextInt();
            System.out.println("The sum is: " + (a + b));
        }else {
            System.out.println("Enter two decimal values to add: ");
            double a = input.nextDouble();
            double b = input.nextDouble();
            System.out.println("The sum is: " + (a + b));
        }
    }


    public void subtract() {
        System.out.println("choose an option \n" +
                "1. Integer values \n" +
                "2. Decimal values");
        int subType = input.nextInt();
        if (subType == 1) {
            System.out.println("Enter two numbers to subtract: ");
            int a = input.nextInt();
            int b = input.nextInt();
            System.out.println("The difference is: " + (a - b));
        }else{
            System.out.println("Enter two decimal values to subtract: ");
            double a = input.nextDouble();
            double b = input.nextDouble();
            System.out.println("The difference is: " + (a - b));
        }
    }

    public void multiply() {
        System.out.println("choose an option \n" +
                "1. Integer values \n" +
                "2. Decimal values");
        int mulType = input.nextInt();
        if (mulType == 1) {
            System.out.println("Enter two numbers to multiply: ");
            int a = input.nextInt();
            int b = input.nextInt();
            System.out.println("The product is: " + (a * b));
        }else {
            System.out.println("Enter two decimal values to multiply: ");
            double a = input.nextDouble();
            double b = input.nextDouble();
            System.out.println("The product is: " + (a * b));
        }
    }

    public void divide(){
        System.out.println("choose an option \n" +
                "1. Integer values \n" +
                "2. Decimal values");
        int divType = input.nextInt();
        if (divType == 1) {
            System.out.println("Enter two numbers");
            int a = input.nextInt();
            int b = input.nextInt();
            System.out.println("The result is " + (a / b));
        }else {
            System.out.println("Enter two decimal values to divide: ");
            double a = input.nextDouble();
            double b = input.nextDouble();
            System.out.println("The result is " + (a/b));
        }
    }

    public void modulus(){
        System.out.println("choose an option \n" +
                "1. Integer values \n" +
                "2. Decimal values");
        int modType = input.nextInt();
        if (modType == 1) {
            System.out.println("Enter two numbers");
            int a = input.nextInt();
            int b = input.nextInt();
            System.out.println("The result is " + (a % b));
        }else {
            System.out.println("Enter two decimal values to find the modulus: ");
            double a = input.nextDouble();
            double b = input.nextDouble();
            System.out.println("The result is " + (a %b));
        }
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
                System.out.println("Invalid choice! Please enter a valid choice (1 - 6)");
        }
        // We will keep upgrading our calculator app each day to make it perfect!!


    }
}

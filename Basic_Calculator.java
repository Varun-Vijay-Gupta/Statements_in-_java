import java.util.Scanner;

public class Basic_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any two numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.println("Choose any operation number that you have to perform.");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        int num = sc.nextInt();

        switch(num){
            case 1: System.out.println("Addition of two numbers is: "+(a+b));
            break;
            case 2: System.out.println("Subtarction of two numbers is: "+(a-b)); 
            break;
            case 3: System.out.println("Multiplication of two numbers is: "+(a*b));
            break;
            case 4: System.out.println("Division of two numbers is: "+(a/b));
            break;
            default: System.out.println("Invalid operation number.");
        }
    }
}

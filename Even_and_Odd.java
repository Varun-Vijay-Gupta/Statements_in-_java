import java.util.Scanner;

public class Even_and_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("The number you entered is an even number.");
        
        }
        else{
            System.out.println("The number you entered is a odd number.");
        }
    }
}

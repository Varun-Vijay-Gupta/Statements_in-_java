import java.util.Scanner;

public class Largest_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two number that you want to compare: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a == b){
            System.out.println("The numbers that you have entered are equal. ");
        }
        else if(a > b){
            System.out.println("First number is largest number.");
        }
        else{
            System.out.println("Second number is largest number.");
        }
    }
}

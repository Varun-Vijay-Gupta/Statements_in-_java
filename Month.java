import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any month number: ");
        int num = sc.nextInt();

        switch(num){
            case 1: System.out.println("This number represent the month january.");
            break;
            case 2: System.out.println("This number represent the month februray.");
            break;
            case 3: System.out.println("This number represent the month march.");
            break;
            case 4: System.out.println("This number represent the month april.");
            break;
            case 5: System.out.println("This number represent the month may.");
            break;
            case 6: System.out.println("This number represent the month june.");
            break;
            case 7: System.out.println("This number represent the month july.");
            break;
            case 8: System.out.println("This number represent the month august.");
            break;
            case 9: System.out.println("This number represent the month september.");
            break;
            case 10: System.out.println("This number represent the month october.");
            break;
            case 11: System.out.println("This number represent the month november.");
            break;
            case 12: System.out.println("This number represent the month december.");
            break;
            default: System.out.println("Invalid month number.");
        }
    }
}

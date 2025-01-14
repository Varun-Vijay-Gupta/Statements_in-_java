import java.util.Scanner;

public class Vowel_and_Consonent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any character: ");
        String c = sc.nextLine();

        if(c == "A" || c == "a" || c == "E" || c == "e" || c == "i" || c == "I" || c == "O" || c == "o" || c =="U" || c == "u"){
            System.out.println("The character you entered is a vowel");
        }
        else{
            System.out.println("The character you entered is a consonent");
        }

    }
}

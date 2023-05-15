import java.util.Scanner;

public class Palindrome {

    public void digitCheck(String number) {

        if (number.matches("\\d+")) {
            palindromeCheck(number);
        } else {
            System.out.println("Input should only contain digits and should be positive.");
        }
    }

    static void palindromeCheck(String numberCheck) {

        StringBuilder str = new StringBuilder(numberCheck);
        String reverseNumber = str.reverse().toString();

        if (numberCheck.equals(reverseNumber)) {
            System.out.println("This number is Palindrome");
        } else {
            System.out.println("This number is not Palindrome");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Palindrome pal = new Palindrome();

//        System.out.print("Do you want to test the code automatically? (y/n) : ");
//        char test = input.next().charAt(0);
//        if (test == 'y') {
//            pal.digitCheck("A");
//            pal.digitCheck("0");
//            pal.digitCheck("-165");
//            pal.digitCheck("-");
//            pal.digitCheck("&");
//            pal.digitCheck("nbsp");
//            pal.digitCheck("1.02");
//            pal.digitCheck("1758");
//        }
        System.out.print("Please enter the number : ");
        String number = input.nextLine();
        pal.digitCheck(number);
    }
}
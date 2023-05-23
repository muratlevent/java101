import java.util.Scanner;

public class Palindrome {

    public int digitCheck(String number) {

        if (number.matches("\\d+")) {
            return Integer.parseInt(number);
        } else {
            System.out.println("Input should only contain digits and should be positive.");
            System.exit(0);
        }
        return 0;
    }

    public static boolean isPalindrome(int number) {
        int reversedNumber = 0;
        int originalNumber = number;

        while (number != 0) {
            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Palindrome pali = new Palindrome();

        System.out.print("Please enter the number : ");
        String number = scanner.nextLine();

        if (isPalindrome(pali.digitCheck(number))) {
            System.out.println(number + " is a palindrome number.");
        } else {
            System.out.println(number + " is not a palindrome number.");
        }
    }
}

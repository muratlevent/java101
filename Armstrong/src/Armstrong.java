import java.util.Scanner;

public class Armstrong {

    static void digitCheck(String number){

        if (number.matches("\\d+")) {
            int numberToCheck = Integer.parseInt(number);
            isArmstrongNumber(numberToCheck);
        } else {
            System.out.println("Input should only contain digits.");
        }
    }

    static void isArmstrongNumber(int numberToCheck) {

        int number = numberToCheck;
        double sum = 0;
        int length = (int) (Math.log10(numberToCheck) + 1);
        while (number > 0) {
            sum = sum + Math.pow(number % 10, length);
            number = number / 10;
        }
        if (numberToCheck == sum) {
            System.out.println("Your number is Armstrong number!");
        } else {
            System.out.println("Your number is not an Armstrong number!");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number :");
        String number = input.nextLine();
        digitCheck(number);
    }
}
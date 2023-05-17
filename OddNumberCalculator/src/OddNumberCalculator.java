import java.util.Scanner;

public class OddNumberCalculator {

    static double result = 0;

    public void digitCheck(String number) {

        if (number.matches("\\d+")) {
            int numberToCheck = Integer.parseInt(number);
            oddCalculator(numberToCheck);
        } else {
            System.out.println("Input should only contain digits and should be positive.");
            System.exit(0);
        }
    }

    static void oddCalculator(int number) {

            if (number % 2 == 0 & number % 4 == 0) {
                result = result + number;
            }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        OddNumberCalculator test = new OddNumberCalculator();
        String number;

        do {
            System.out.print("Please enter the number : ");
            number = scanner.nextLine();
            test.digitCheck(number);
        } while (Integer.parseInt(number) % 2 == 0);
        System.out.print("Total of the numbers is : " + result);
    }
}
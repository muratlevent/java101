import java.util.Scanner;

public class ExponentialNumber {

    public void digitCheck(String number, String power) {

        if (number.matches("\\d+") && power.matches("\\d+")) {
            int numberToCheck = Integer.parseInt(number);
            int powerToCheck = Integer.parseInt(power);
            exponentialCalculator(numberToCheck, powerToCheck);
        } else {
            System.out.println("Input should only contain digits and should be positive.");
            System.exit(0);
        }
    }

    static void exponentialCalculator(int numberToCheck, int powerToCheck) {

        int result = 1;
        for (int i = 1; i <= powerToCheck; i++) {
            result = result * numberToCheck;
        }
        System.out.println(numberToCheck + " power of " + powerToCheck + " is " + result);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ExponentialNumber calc = new ExponentialNumber();

        System.out.print("Please enter the base number : ");
        String number = scanner.nextLine();
        System.out.print("Please enter the power : ");
        String power = scanner.nextLine();
        calc.digitCheck(number, power);
    }
}
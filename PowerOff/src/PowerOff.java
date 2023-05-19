import java.util.Scanner;

public class PowerOff {

    public void digitCheck(String number) {

        if (number.matches("\\d+")) {
            int numberToCheck = Integer.parseInt(number);
            powerCalculator(numberToCheck);
        } else {
            System.out.println("Input should only contain digits and should be positive.");
            System.exit(0);
        }
    }

    static void powerCalculator(int numberToCheck) {

        System.out.println("Power of Four");
        for (int i = 1; i <= numberToCheck; i *= 4) {
            System.out.println(i);
        }
        System.out.println("Power of Five");
        for (int i = 1; i <= numberToCheck; i *= 5) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PowerOff calc = new PowerOff();

        System.out.print("Please enter the number : ");
        String number = scanner.nextLine();
        calc.digitCheck(number);
    }
}
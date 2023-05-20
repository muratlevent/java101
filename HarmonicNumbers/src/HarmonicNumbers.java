import java.util.Scanner;

public class HarmonicNumbers {

    public void digitCheck(String number) {

        if (number.matches("\\d+")) {
            int numberToCheck = Integer.parseInt(number);
            harmonicCalculator(numberToCheck);
        } else {
            System.out.println("Input should only contain digits and should be positive.");
            System.exit(0);
        }
    }

    static void harmonicCalculator(int numberToCheck) {

        double result = 0;

        for (double i = 1; i <= numberToCheck; i++) {
            result += (1 / i);
        }
        System.out.println("Harmonic series of " + numberToCheck + " is " + result);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        HarmonicNumbers calc = new HarmonicNumbers();

        System.out.print("Please enter the number : ");
        String number = scanner.nextLine();
        calc.digitCheck(number);
    }
}
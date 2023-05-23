import java.util.Scanner;

public class PowerOffRecursive {

    public void digitCheck(String base, String exponent) {

        if (base.matches("\\d+") && exponent.matches("\\d+")) {
            int baseToCheck = Integer.parseInt(base);
            int exponentToCheck = Integer.parseInt(exponent);
            System.out.print("Result is : " + powerCalculator(baseToCheck, exponentToCheck));
        } else {
            System.out.println("Input should only contain digits and should be positive.");
            System.exit(0);
        }
    }

    static int powerCalculator(int base, int exponent) {

        if (exponent == 0) {
            return 1;
        } else {
            return base * powerCalculator(base, exponent - 1);
        }
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PowerOffRecursive calc = new PowerOffRecursive();

        System.out.print("Please enter the base : ");
        String base = scanner.nextLine();
        System.out.print("Please enter the exponent : ");
        String exponent = scanner.nextLine();
        calc.digitCheck(base, exponent);
    }
}
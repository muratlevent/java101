import java.util.Scanner;

public class Combination {

    public void digitCheck(String n, String r) {

        if (n.matches("\\d+") && r.matches("\\d+")) {
            int firstToCheck = Integer.parseInt(n);
            int secondToCheck = Integer.parseInt(r);

            if (firstToCheck < secondToCheck) {
                System.out.println("Please enter n ≥ r ≥ 0");
            } else {
                combinationCalculator(firstToCheck, secondToCheck);
            }
        } else {
            System.out.println("Input should only contain digits and should be positive.");
            System.exit(0);
        }
    }

    static void combinationCalculator(int n, int r) {

        int result;

        result = factorial(n) / (factorial(r) * factorial((n - r)));
        System.out.print("Combination of C(n,r) is : " + result);
    }

    static int factorial(int number) {

        int factNumber = number;
        for (int i = number - 1; i >= 1; i--) {
            factNumber = factNumber * i;
        }
        return factNumber;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Combination calc = new Combination();

        System.out.println("Please enter the combination numbers C(n,r):  ");
        System.out.print("Please enter the n : ");
        String n = scanner.nextLine();
        System.out.print("Please enter the r : ");
        String r = scanner.nextLine();
        calc.digitCheck(n, r);
    }
}
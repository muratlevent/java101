import java.util.Scanner;

public class PerfectNumber {

    public int digitCheck(String number) {

        if (number.matches("\\d+")) {
            return Integer.parseInt(number);
        } else {
            System.out.println("Input should only contain digits and should be positive.");
            System.exit(0);
        }
        return 0;
    }

    public static boolean isPerfectNumber(int number) {
        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String number = scanner.nextLine();
        PerfectNumber calc = new PerfectNumber();

        if (isPerfectNumber(calc.digitCheck(number))) {
            System.out.println("It is a perfect number.");
        } else {
            System.out.println("It is not a perfect number.");
        }
    }
}

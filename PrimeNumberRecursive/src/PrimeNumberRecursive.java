import java.util.Scanner;

public class PrimeNumberRecursive {

    public void digitCheck(String number) {

        if (number.matches("\\d+")) {
            int numberToCheck = Integer.parseInt(number);
            if (isPrime(numberToCheck))
                System.out.println(number + " is a prime number.");
            else
                System.out.println(number + " is not a prime number.");
        } else {
            System.out.println("Input should only contain digits and should be positive.");
            System.exit(0);
        }
    }

    public static boolean isPrime(int number) {
        return isPrime(number, number / 2);
    }

    private static boolean isPrime(int number, int divisor) {
        if (divisor == 1)
            return true;
        else if (number % divisor == 0)
            return false;
        else
            return isPrime(number, divisor - 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PrimeNumberRecursive calc = new PrimeNumberRecursive();

        System.out.print("Please enter the number : ");
        String number = scanner.nextLine();
        calc.digitCheck(number);
    }
}

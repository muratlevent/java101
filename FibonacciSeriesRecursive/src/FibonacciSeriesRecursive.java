import java.util.Scanner;

public class FibonacciSeriesRecursive {

    public void digitCheck(String number) {
        if (number.matches("\\d+")) {
            int numberToCheck = Integer.parseInt(number);
            System.out.println("Fibonacci Series :");
            for (int i = 0; i < numberToCheck; i++) {
                System.out.print(fibonacciRecursive(i) + " ");
            }
        } else {
            System.out.println("Input should only contain digits and should be positive.");
            System.exit(0);
        }
    }

    private int fibonacciRecursive(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        FibonacciSeriesRecursive calc = new FibonacciSeriesRecursive();
        System.out.print("Enter the number of elements for the Fibonacci series : ");
        String elementCount = input.nextLine();
        calc.digitCheck(elementCount);
    }
}

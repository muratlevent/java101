import java.util.Scanner;

public class FibonacciSeries {

    public void digitCheck(String number) {

        if (number.matches("\\d+")) {
            int numberToCheck = Integer.parseInt(number);
            fibonacciCalculator(numberToCheck);
        } else {
            System.out.println("Input should only contain digits and should be positive.");
            System.exit(0);
        }
    }

    private void fibonacciCalculator(int elementCount) {

        int[] fibonacci = new int[elementCount];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < elementCount; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        System.out.println("Fibonacci Series :");
        for (int i = 0; i < elementCount; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        FibonacciSeries calc = new FibonacciSeries();
        System.out.print("Enter the number of elements for the Fibonacci series : ");
        String elementCount = input.nextLine();
        calc.digitCheck(elementCount);
    }
}

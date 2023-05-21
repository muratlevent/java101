import java.util.Scanner;

public class MinMax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = getNumberOfInputs(scanner);

        int[] numbers = getNumbers(scanner, N);

        int min = findMinimumNumber(numbers);
        int max = findMaximumNumber(numbers);

        printMinMax(min, max);

        scanner.close();
    }

    public static int getNumberOfInputs(Scanner scanner) {
        System.out.print("How many numbers will be entered? : ");
        int N;
        if (scanner.hasNextInt()) {
            N = scanner.nextInt();
            if (N <= 0) {
                System.out.print("There must be at least one number!");
                System.exit(0);
            }
        } else {
            System.out.println("Invalid input! Please enter an integer.");
            scanner.close();
            System.exit(0);
            return 0;
        }
        return N;
    }

    public static int[] getNumbers(Scanner scanner, int N) {
        int[] numbers = new int[N];
        System.out.println("Please enter the numbers : ");
        for (int i = 0; i < N; i++) {
            if (scanner.hasNextInt()) {
                numbers[i] = scanner.nextInt();
            } else {
                System.out.println("Invalid input! Please enter an integer.");
                scanner.close();
                System.exit(0);
                return null;
            }
        }
        return numbers;
    }

    public static int findMinimumNumber(int[] numbers) {
        int min = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public static int findMaximumNumber(int[] numbers) {
        int max = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static void printMinMax(int min, int max) {
        System.out.println("Minimum number is : " + min);
        System.out.println("Maximum number is : " + max);
    }
}

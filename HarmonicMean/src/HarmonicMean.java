import java.util.Scanner;

public class HarmonicMean {

    public static int sizeCheck(String size) {

        if (size.matches("\\d+") && !size.equals("0")) {
            return Integer.parseInt(size);
        } else {
            System.out.println("Input should only contain digits and should be positive.");
            System.exit(0);
        }
        return 0;
    }
    public static double calculateHarmonicMean(double[] numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += 1 / number;
        }
        return numbers.length / sum;
    }

    public static boolean isNumeric(String str) {
        try {
            double value = Double.parseDouble(str);
            return value != 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        String tempSize = scanner.nextLine();
        int size = sizeCheck(tempSize);

        double[] numbers = new double[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            String input = scanner.next();
            if (!isNumeric(input)) {
                System.out.println("Invalid input. Please enter a valid non-zero number.");
                i--;
                continue;
            }
            numbers[i] = Double.parseDouble(input);
        }

        double harmonicMean = calculateHarmonicMean(numbers);

        System.out.println("Harmonic Mean: " + harmonicMean);
    }
}
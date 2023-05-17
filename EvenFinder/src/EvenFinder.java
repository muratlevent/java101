import java.util.Scanner;

public class EvenFinder {

    public void digitCheck(String number) {

        if (number.matches("\\d+")) {
            int numberToCheck = Integer.parseInt(number);
            evenCalculator(numberToCheck);
        } else {
            System.out.println("Input should only contain digits and should be positive.");
            System.exit(0);
        }
    }

    static void evenCalculator(int number) {

        double result = 0;
        int counter = 0;

        for (int i = 1; i < number; i++) {
            if (i % 3 == 0 & i % 4 == 0) {
                result = result + i;
                counter++;
                System.out.println("Common numbers is " + i);

            }
        }
        System.out.print("The average of the numbers is " + (result / counter));
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        EvenFinder test = new EvenFinder();

        System.out.print("Please enter the number : ");
        String number = scanner.nextLine();
        test.digitCheck(number);
    }
}
import java.util.Arrays;
import java.util.Scanner;

public class NumberSorting {

    public void numberCheck(String firstNumber, String secondNumber, String thirdNumber) {

        if (firstNumber.matches("^-?[0-9]\\d*(\\.\\d+)?$") && secondNumber.matches("^-?[0-9]\\d*(\\.\\d+)?$") && thirdNumber.matches("^-?[0-9]\\d*(\\.\\d+)?$")) {
            int first = Integer.parseInt(firstNumber);
            int second = Integer.parseInt(secondNumber);
            int third = Integer.parseInt(thirdNumber);
            numberSorter(first, second, third);
        } else {
            System.out.println("Input should only contain digits and should be positive.");
            System.exit(0);
        }
    }

    static void numberSorter(int first, int second, int third) {

        int[] result = {first, second, third};
        Arrays.sort(result);
        System.out.print("Sorted version : ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        NumberSorting sorting = new NumberSorting();

        System.out.print("Please enter the first number : ");
        String firstNumber = input.nextLine();
        System.out.print("Please enter the second number : ");
        String secondNumber = input.nextLine();
        System.out.print("Please enter the third number : ");
        String thirdNumber = input.nextLine();
        sorting.numberCheck(firstNumber, secondNumber, thirdNumber);
    }
}
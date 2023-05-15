import java.util.Scanner;

public class SimpleCalculator {

    static int result;

    public void digitCheck(String firstNumber, String secondNumber, String select) {

        if (firstNumber.matches("\\d+") && secondNumber.matches("\\d+") && select.matches("\\d+")) {

            int firstNumberCheck = Integer.parseInt(firstNumber);
            int secondNumberCheck = Integer.parseInt(secondNumber);
            int selectCheck = Integer.parseInt(select);
            if (selectCheck < 5 && selectCheck > 0) {
                calculate(firstNumberCheck, secondNumberCheck, selectCheck);
            } else {
                System.out.println("Invalid operation input");
            }
        } else {
            System.out.println("Input should only contain digits and should be positive.");
        }
    }

    static void calculate(int firstNumberCheck, int secondNumberCheck, int selectCheck) {

        switch (selectCheck) {
            case 1 -> result = firstNumberCheck + secondNumberCheck;
            case 2 -> result = firstNumberCheck - secondNumberCheck;
            case 3 -> result = firstNumberCheck * secondNumberCheck;
            case 4 -> {
                if (secondNumberCheck != 0) {
                    result = firstNumberCheck / secondNumberCheck;
                } else {
                    System.out.println("Error: Second number can not be zero!");
                    return;
                }
            }
            default -> System.out.println("Invalid input!");
        }
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SimpleCalculator operation = new SimpleCalculator();

        System.out.print("Please enter first number : ");
        String number1 = input.nextLine();
        System.out.print("Please enter second number : ");
        String number2 = input.nextLine();
        System.out.println("Choose operation");
        System.out.println("1-Addition\n2-Subtraction\n3-Multiplication\n4-Division");
        String select = input.nextLine();
        operation.digitCheck(number1, number2, select);
    }
}
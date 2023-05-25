import java.util.Scanner;

public class ShapeMethod {

    public void digitCheck(String number) {

        if (number.matches("\\d+")) {
            int numberToCheck = Integer.parseInt(number);
            shapeLeftCalculator(numberToCheck, numberToCheck);
        } else {
            System.out.println("Input should only contain digits and should be positive.");
            System.exit(0);
        }
    }

    public void shapeLeftCalculator(int number, int original) {
        if (number > 0) {
            System.out.print(number + " ");
            shapeLeftCalculator((number - 5), original);
        } else if (number <= 0) {
            shapeRightCalculator(number, original);
        }
    }

    public void shapeRightCalculator(int number, int original) {
        if (original >= number) {
            System.out.print(number + " ");
            shapeRightCalculator((number + 5), original);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ShapeMethod calc = new ShapeMethod();

        System.out.print("Please enter the number : ");
        String number = scanner.nextLine();
        calc.digitCheck(number);

    }
}
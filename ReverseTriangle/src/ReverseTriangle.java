import java.util.Scanner;

public class ReverseTriangle {

    public void digitCheck(String number) {

        if (number.matches("\\d+")) {
            int numberToCheck = Integer.parseInt(number);
            triangle(numberToCheck);
        } else {
            System.out.println("Input should only contain digits and should be positive.");
            System.exit(0);
        }
    }

    static void triangle(int number) {

        for (int i = number; i >= 1; i--) {

            for (int j = i; j <= number; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ReverseTriangle draw = new ReverseTriangle();

        System.out.print("Please enter the size number :");
        String number = keyboard.nextLine();
        draw.digitCheck(number);
    }
}
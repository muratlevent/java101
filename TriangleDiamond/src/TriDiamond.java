import java.util.Scanner;

public class TriDiamond {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the size number :");
        int number = keyboard.nextInt();

        //top of the diamond
        for (int i = 1; i <= number; i++) {

            for (int j = number; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //bottom of the diamond
        for (int i = number - 1; i >= 1; i--) {

            for (int j = i; j <= number; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
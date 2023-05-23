import java.util.Scanner;

public class AdvancedCalculator {

    static int nextInt(Scanner scan) {
        while (!scan.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            scan.next(); // Clear the invalid input from the scanner
        }
        return scan.nextInt();
    }

    static double nextDouble(Scanner scan) {
        while (!scan.hasNextDouble()) {
            System.out.println("Invalid input. Please enter an integer or double.");
            scan.next(); // Clear the invalid input from the scanner
        }
        return scan.nextDouble();
    }

    static void plus() {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". number: ");
            number = nextInt(scan);
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Result: " + result);
    }

    static void minus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of values: ");
        int counter = nextInt(scan);
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". number: ");
            number = nextInt(scan);
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Result: " + result);
    }

    static void times() {
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". number: ");
            number = nextInt(scan);

            if (number == 1) break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Result: " + result);
    }

    static void divided() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of values: ");
        int counter = nextInt(scan);
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". number: ");
            number = nextDouble(scan);
            if (i != 1 && number == 0) {
                System.out.println("You cannot enter 0 as a divisor.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Result: " + result);
    }

    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the base value: ");
        int base = nextInt(scan);
        System.out.print("Enter the exponent value: ");
        int exponent = nextInt(scan);
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Result: " + result);
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = nextInt(scan);
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Result: " + result);
    }

    static void modulus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the dividend: ");
        int dividend = nextInt(scan);
        System.out.print("Enter the divisor: ");
        int divisor = nextInt(scan);
        int result = dividend % divisor;
        System.out.println("Result: " + result);
    }

    static void calculateRectangle() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        int length = nextInt(scan);
        System.out.print("Enter the width of the rectangle: ");
        int width = nextInt(scan);
        int area = length * width;
        int perimeter = 2 * (length + width);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = """
                1- Addition
                2- Subtraction
                3- Multiplication
                4- Division
                5- Power Calculation
                6- Factorial Calculation
                7- Modulus
                8- Calculate Rectangle
                0- Exit""";

        do {
            System.out.println(menu);
            System.out.print("Please select an operation: ");
            select = nextInt(scan);
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    modulus();
                    break;
                case 8:
                    calculateRectangle();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("You entered an incorrect value, please try again.");
            }
        } while (select != 0);
    }
}

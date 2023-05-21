import java.util.Scanner;

public class EbobEkok {

    public void digitCheck(String number1, String number2) {

        if (number1.matches("\\d+") && number2.matches("\\d+")) {
            int numberToCheck1 = Integer.parseInt(number1);
            int numberToCheck2 = Integer.parseInt(number2);
            calculator(numberToCheck1, numberToCheck2);
        } else {
            System.out.println("Input should only contain digits and should be positive.");
            System.exit(0);
        }
    }

    private void calculator(int numberToCheck1, int numberToCheck2) {

        int ebob = 1;
        int ekok = Math.max(numberToCheck1, numberToCheck2);

        int i = 1;
        while (i <= numberToCheck1 && i <= numberToCheck2) {
            if (numberToCheck1 % i == 0 && numberToCheck2 % i == 0) {
                ebob = i;
            }
            i++;
        }

        ekok = (numberToCheck1 * numberToCheck2) / ebob;

        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        EbobEkok calc = new EbobEkok();

        System.out.print("Please enter the first number : ");
        String number1 = scanner.nextLine();
        System.out.print("Please enter the second number : ");
        String number2 = scanner.nextLine();
        calc.digitCheck(number1, number2);
    }
}
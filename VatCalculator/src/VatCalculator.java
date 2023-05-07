import java.util.Scanner;

public class VatCalculator {

    static double result;
    static double productVat;
    static String price;

    public void digitCheck(String number) {

        if (number.matches("\\d+")) {
            int numberToCheck = Integer.parseInt(number);
            vatCalculator(numberToCheck);
        } else {
            System.out.println("Input should only contain digits and should be positive.");
            System.exit(0);
        }
    }

    static void vatCalculator(int numberToCheck) {

        if (numberToCheck <= 1000) {
            productVat = numberToCheck * 0.18;
            result = numberToCheck * 1.18;
        } else {
            productVat = numberToCheck * 0.08;
            result = numberToCheck * 1.08;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        VatCalculator product = new VatCalculator();

        System.out.println("Please enter the product price :");
        price = input.nextLine();
        product.digitCheck(price);

        System.out.println("Main price is : " + price);
        System.out.println("Price VAT is : " + productVat);
        System.out.println("Price with VAT is : " + result);

    }
}
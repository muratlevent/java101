import java.util.Scanner;

public class TaxiMeter {

    static int minPrice = 20;
    static int startingPrice = 10;
    static double pricePerKm = 2.20;
    static double result;

    public void digitCheck(String number) {

        if (number.matches("\\d+")) {
            int numberToCheck = Integer.parseInt(number);
            kmCalculator(numberToCheck);
        } else {
            System.out.println("Input should only contain digits and should be positive.");
            System.exit(0);
        }
    }

    static void kmCalculator(int totalKm) {

        double totalKmPrice = startingPrice + (totalKm * pricePerKm);
        if (totalKmPrice < minPrice) {
            result = minPrice;
        } else {
            result = totalKmPrice;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        TaxiMeter trip = new TaxiMeter();

        System.out.println("Please enter the total km :");
        String totalKm = input.nextLine();
        trip.digitCheck(totalKm);

        System.out.println("Your total km is :" + totalKm);
        System.out.println("You have to pay :" + result);
    }
}
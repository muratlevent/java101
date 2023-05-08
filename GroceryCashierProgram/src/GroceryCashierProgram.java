import java.util.Scanner;

public class GroceryCashierProgram {

    static double result;

    public void digitCheck(String pear, String apple, String banana, String melon, String tomato) {

        if (isNumeric(pear) && isNumeric(apple) && isNumeric(banana) && isNumeric(melon) && isNumeric(tomato)) {
            double pearWeight = Double.parseDouble(pear);
            double appleWeight = Double.parseDouble(apple);
            double bananaWeight = Double.parseDouble(banana);
            double melonWeight = Double.parseDouble(melon);
            double tomatoWeight = Double.parseDouble(tomato);
            chartCalculator(pearWeight, appleWeight, bananaWeight, melonWeight, tomatoWeight);
            System.out.println("Total chart price is : " + result);
        } else {
            System.out.println("Input should only contain digits and should be positive.");
        }
    }

    public static boolean isNumeric(String product) {

        return product.matches("\\d+(\\.\\d+)?");

    }

    static void chartCalculator(double pearWeight, double appleWeight, double bananaWeight, double melonWeight, double tomatoWeight) {

        double pearPrice = pearWeight * 2.14;
        double applePrice = appleWeight * 3.67;
        double bananaPrice = bananaWeight * 1.11;
        double melonPrice = melonWeight * 0.95;
        double tomatoPrice = tomatoWeight * 5.00;

        result = pearPrice + applePrice + bananaPrice + melonPrice + tomatoPrice;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        GroceryCashierProgram item = new GroceryCashierProgram();

        System.out.print("Please enter the weight of the pear: ");
        String pear = input.nextLine();
        System.out.print("Please enter the weight of the apple: ");
        String apple = input.nextLine();
        System.out.print("Please enter the weight of the banana: ");
        String banana = input.nextLine();
        System.out.print("Please enter the weight of the melon: ");
        String melon = input.nextLine();
        System.out.print("Please enter the weight of the tomato: ");
        String tomato = input.nextLine();
        item.digitCheck(pear, apple, banana, melon, tomato);
    }
}
import java.util.Scanner;

public class FlightTicket {
    static String age, range;
    static String roundTrip;
    static double ticketPrice;

    public void digitCheck(String age, String range, String roundTrip) {

        if (age.matches("\\d+") && range.matches("\\d+")) {
            if (roundTrip.matches("1") || roundTrip.matches("2")) {
                int ageCheck = Integer.parseInt(age);
                int rangeCheck = Integer.parseInt(range);
                int roundTripCheck = Integer.parseInt(roundTrip);
                flightTicketCalculator(ageCheck, rangeCheck, roundTripCheck);
            } else {
                System.out.println("Round trip should be 1 or 2.");
            }
        } else {
            System.out.println("Input should only contain digits and should be positive.");
        }
    }

    static void flightTicketCalculator(Integer ageCheck, Integer rangeCheck, Integer roundTripCheck) {
        double discount = 0;
        double roundTripMultiplier = 1;
        double roundTripDiscount = 1;
        double mainTicketPrice = rangeCheck * 0.1;

        if (roundTripCheck == 2) {
            roundTripMultiplier = 2;
            roundTripDiscount = 0.8;
        }
        if (ageCheck < 12) {
            discount = 0.5;
        } else if (ageCheck > 11 && ageCheck < 24) {
            discount = 0.9;
        } else if (ageCheck > 65) {
            discount = 0.7;
        } else {
            discount = 1;
        }
        ticketPrice = mainTicketPrice * discount * roundTripDiscount * roundTripMultiplier;
        System.out.print("Your ticket price is : " + ticketPrice);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        FlightTicket trip = new FlightTicket();

        System.out.print("Please enter the age of the passenger : ");
        age = input.nextLine();
        System.out.print("Enter the total length of the trip : ");
        range = input.nextLine();
        System.out.print("Is this round trip? Please enter 1 for Yes, 0 for No.: ");
        roundTrip = input.nextLine();
        trip.digitCheck(age, range, roundTrip);
    }
}
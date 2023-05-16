import java.util.Scanner;

public class ZodiacSign {

    public void digitCheck(String dayDigitCheck, String monthDigitCheck) {

        if (dayDigitCheck.matches("\\d+") && monthDigitCheck.matches("\\d+")) {
            int day = Integer.parseInt(dayDigitCheck);
            int month = Integer.parseInt(monthDigitCheck);
            dateCheck(day, month);
        } else {
            System.out.println("Input should only contain digits and should be positive.");
            System.exit(0);
        }
    }

    public void dateCheck(int dayCheck, int monthCheck) {

        int maxDaysInMonth = 0;

        switch (monthCheck) {
            case 1, 3, 5, 7, 8, 10, 12 -> maxDaysInMonth = 31;
            case 2 -> maxDaysInMonth = 28;
            case 4, 6, 9, 11 -> maxDaysInMonth = 30;
            default -> {
                System.out.println("Invalid month entered.");
                return;
            }
        }

        if (dayCheck < 1 || dayCheck > maxDaysInMonth) {
            System.out.println("Invalid day entered for the given month.");
            return;
        } else {
            zodiacFinder(dayCheck, monthCheck);
        }
    }

    static void zodiacFinder(int birthDay, int birthMonth) {

        String zodiacSign = "";

        if ((birthMonth == 1 && birthDay >= 22) || (birthMonth == 2 && birthDay <= 19)) {
            zodiacSign = "Aquarius";
        } else if ((birthMonth == 2 && birthDay >= 20) || (birthMonth == 3 && birthDay <= 20)) {
            zodiacSign = "Pisces";
        } else if ((birthMonth == 3 && birthDay >= 21) || (birthMonth == 4 && birthDay <= 20)) {
            zodiacSign = "Aries";
        } else if ((birthMonth == 4 && birthDay >= 21) || (birthMonth == 5 && birthDay <= 21)) {
            zodiacSign = "Taurus";
        } else if ((birthMonth == 5 && birthDay >= 22) || (birthMonth == 6 && birthDay <= 22)) {
            zodiacSign = "Gemini";
        } else if ((birthMonth == 6 && birthDay >= 23) || (birthMonth == 7 && birthDay <= 22)) {
            zodiacSign = "Cancer";
        } else if ((birthMonth == 7 && birthDay >= 23) || (birthMonth == 8 && birthDay <= 22)) {
            zodiacSign = "Leo";
        } else if ((birthMonth == 8 && birthDay >= 23) || (birthMonth == 9 && birthDay <= 22)) {
            zodiacSign = "Virgo";
        } else if ((birthMonth == 9 && birthDay >= 23) || (birthMonth == 10 && birthDay <= 22)) {
            zodiacSign = "Libra";
        } else if ((birthMonth == 10 && birthDay >= 23) || (birthMonth == 11 && birthDay <= 21)) {
            zodiacSign = "Scorpio";
        } else if ((birthMonth == 11 && birthDay >= 22) || (birthMonth == 12 && birthDay <= 21)) {
            zodiacSign = "Sagittarius";
        } else if ((birthMonth == 12 && birthDay >= 22) || (birthMonth == 1 && birthDay <= 21)) {
            zodiacSign = "Capricorn";
        }

        System.out.println("Your zodiac sign is: " + zodiacSign);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ZodiacSign zodiac = new ZodiacSign();

        System.out.print("Enter your birth day: ");
        String dayCheck = input.nextLine();
        System.out.print("Enter your birth month (as a number): ");
        String monthCheck = input.nextLine();
        zodiac.digitCheck(dayCheck, monthCheck);
    }
}
import java.util.Scanner;

public class ChineseZodiac {

    public void digitCheck(String number) {

        if (number.matches("\\d+")) {
            int numberCheck = Integer.parseInt(number);
            zodiacCheck(numberCheck);
        } else {
            System.out.println("Input should only contain digits and should be positive.");
        }
    }

    static void zodiacCheck(Integer numberCheck) {

        int zodSign = (numberCheck % 12) + 1;

        switch (zodSign) {
            case 1 -> System.out.print("Your Chinese zodiac sign is Monkey");
            case 2 -> System.out.print("Your Chinese zodiac sign is Rooster");
            case 3 -> System.out.print("Your Chinese zodiac sign is Dog");
            case 4 -> System.out.print("Your Chinese zodiac sign is Pig");
            case 5 -> System.out.print("Your Chinese zodiac sign is Rat");
            case 6 -> System.out.print("Your Chinese zodiac sign is Ox");
            case 7 -> System.out.print("Your Chinese zodiac sign is Tiger");
            case 8 -> System.out.print("Your Chinese zodiac sign is Rabbit");
            case 9 -> System.out.print("Your Chinese zodiac sign is Dragon");
            case 10 -> System.out.print("Your Chinese zodiac sign is Snake");
            case 11 -> System.out.print("Your Chinese zodiac sign is Horse");
            case 12 -> System.out.print("Your Chinese zodiac sign is Sheep");
        }
//        String[] sign = {"Monkey", "Rooster", "Dog", "Pig", "Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Sheep"};
//        System.out.print("Your Chinese zodiac sign is " + sign[zodSign]);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ChineseZodiac zodiac = new ChineseZodiac();

        System.out.print("Please enter your birth year : ");
        String year = input.nextLine();
        zodiac.digitCheck(year);
    }
}
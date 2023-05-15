import java.util.Scanner;

public class LeapYear {

    public void digitCheck(String number) {

        if (number.matches("0")) {
            System.out.println("Year can not be 0.");
        } else if (number.matches("\\d+")) {
            int yearCheck = Integer.parseInt(number);
            leapYearCheck(yearCheck);
        } else {
            System.out.println("Input should only contain digits and should be positive.");
        }
    }

    static void leapYearCheck(Integer yearCheck) {

        if (yearCheck % 100 == 0 && yearCheck % 400 == 0) {
            System.out.println("This year is leap year");
        } else if (yearCheck % 4 == 0 && yearCheck % 100 != 0) {
            System.out.println("This year is leap year");
        } else {
            System.out.println("This year is not leap year");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LeapYear leap = new LeapYear();

        System.out.print("Please enter the year : ");
        String year = input.nextLine();
        leap.digitCheck(year);
    }
}
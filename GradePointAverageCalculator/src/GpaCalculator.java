import java.util.Scanner;

public class GpaCalculator {

    static double result;

    public void digitCheck(String number){

        if (number.matches("\\d+")) {
            int numberToCheck = Integer.parseInt(number);
            gradeCalculator(numberToCheck);
        } else {
            System.out.println("Input should only contain digits.");
            System.exit(0);
        }
    }

    static void gradeCalculator(int numberToCheck) {
        result = result + numberToCheck;
    }



    public static void main(String[] args) {
//        String math, physics, history, music, chemistry, turkish;
        Scanner input = new Scanner(System.in);

        GpaCalculator math = new GpaCalculator();
        GpaCalculator physics = new GpaCalculator();
        GpaCalculator history = new GpaCalculator();
        GpaCalculator music = new GpaCalculator();
        GpaCalculator chemistry = new GpaCalculator();
        GpaCalculator turkish = new GpaCalculator();

        System.out.println("Please enter the math grade :");

        math.digitCheck(input.nextLine());

        System.out.println("Please enter the physics grade :");
        physics.digitCheck(input.nextLine());

        System.out.println("Please enter the history grade :");
        history.digitCheck(input.nextLine());

        System.out.println("Please enter the music grade :");
        music.digitCheck(input.nextLine());

        System.out.println("Please enter the chemistry grade :");
        chemistry.digitCheck(input.nextLine());

        System.out.println("Please enter the turkish grade :");
        turkish.digitCheck(input.nextLine());

        System.out.println("Your GPA is : " + result / 6);

        System.out.println(result >= 60 ? "You passed!" : "You failed!");
    }
}
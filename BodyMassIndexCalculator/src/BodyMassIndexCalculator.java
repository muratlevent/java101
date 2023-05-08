import java.util.Scanner;

public class BodyMassIndexCalculator {

    static double result;

    public void digitCheck(String height, String weight) {

        if (height.matches("\\d+(\\.\\d+)?") && weight.matches("\\d+(\\.\\d+)?")) {
            double heightToCheck = Double.parseDouble(height);
            double weightToCheck = Double.parseDouble(weight);
            bmiCalculator(heightToCheck, weightToCheck);
        } else {
            System.out.println("Input should only contain digits and should be positive.");
            System.exit(0);
        }
    }

    static void bmiCalculator(double heightToCheck, double weightToCheck) {

        result = (weightToCheck / (heightToCheck * heightToCheck));
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        BodyMassIndexCalculator bmi = new BodyMassIndexCalculator();

        System.out.print("Please enter the height : ");
        String height = input.nextLine();
        System.out.print("Please enter the weight : ");
        String weight = input.nextLine();
        bmi.digitCheck(height, weight);
        System.out.println("Your BMI is : " + result);
    }
}
import java.util.Scanner;

public class Circle {

    static String r, alpha;
    static double pi = 3.14;
    static double result;

    public void digitCheck(String r, String alpha) {

        if (r.matches("\\d+") && alpha.matches("\\d+")) {
            int radiusToCheck = Integer.parseInt(r);
            int angleToCheck = Integer.parseInt(alpha);
            if (angleToCheck > 360) {
                System.out.println("The angle cannot be more than 360 degrees.");
                System.exit(0);
            } else {
                sliceCalculator(radiusToCheck, angleToCheck);
            }
        } else {
            System.out.println("Input should only contain digits and should be positive.");
            System.exit(0);
        }
    }

    static void sliceCalculator(int radius, int angle) {

        result = (pi * (radius * radius) * angle) / 360;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Circle area = new Circle();

        System.out.print("Please enter the radius : ");
        String rad = input.nextLine();
        System.out.print("Please enter center angle : ");
        String ang = input.nextLine();
        area.digitCheck(rad, ang);
        System.out.println("Total area is : " + result);
    }
}
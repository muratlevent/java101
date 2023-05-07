import java.util.Scanner;

public class HypotenuseCalculator {

    static String a, b;
    static double c;

    public void digitCheck(String a, String b) {

        if (a.matches("\\d+") && b.matches("\\d+")) {
            int cornerToCheckA = Integer.parseInt(a);
            int cornerToCheckB = Integer.parseInt(b);
            if (cornerToCheckA != 0 && cornerToCheckB != 0) {
                hypotenuse(cornerToCheckA, cornerToCheckB);
            } else {
                System.out.println("Corner length can not be 0.");
                System.exit(0);
            }
        } else {
            System.out.println("Input should only contain digits and should be positive.");
            System.exit(0);
        }
    }

    static void hypotenuse(int sideA, int sideB) {

        c = Math.sqrt((sideA * sideA) + (sideB * sideB));

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        HypotenuseCalculator triangle = new HypotenuseCalculator();

        System.out.println("Please enter the sides of the triangle");
        System.out.println("Side A :");
        a = input.nextLine();
        System.out.println("Side B :");
        b = input.nextLine();
        triangle.digitCheck(a, b);
        System.out.println("Side A is : " + a);
        System.out.println("Side B is : " + b);
        System.out.println("Hypotenuse is: " + c);
    }
}
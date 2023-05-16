import java.util.Scanner;

public class WeatherActivity {

    public void temperatureCheck(String temperature) {

        int temp = Integer.parseInt(temperature);
        if (temp <= 5) {
            System.out.print("Recommended activity is Skiing ");
        } else if (temp > 5 && temp <= 15) {
            System.out.print("Recommended activity is Cinema ");
        } else if (temp > 15 && temp <= 25) {
            System.out.print("Recommended activity is Picnic ");
        } else {
            System.out.print("Recommended activity is Swimming ");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        WeatherActivity weather = new WeatherActivity();

        System.out.print("Please enter the temperature : ");
        String temperature = input.nextLine();
        weather.temperatureCheck(temperature);
    }
}
import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double degrees = Double.parseDouble(scanner.nextLine());

        double fahrenheit = (degrees * 1.8) + 32;

        System.out.println(Math.round(fahrenheit * 100.0) / 100.0);
    }
}

// Write a program that reads degrees on the Celsius scale (°C)
// and converts them to degrees on the Fahrenheit scale (°F). Look on the Internet for a proper formula, to do the calculations.
// Round the result to 2 digits after the decimal point.
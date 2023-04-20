import java.util.Scanner;

public class InchesToCentimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inches = Double.parseDouble(scanner.nextLine());

        System.out.println(inches * 2.54);
    }
}

// Write a program that reads a floating-point number (representing inches) as an input from the console,
// converts it to centimeters, and print the result as output

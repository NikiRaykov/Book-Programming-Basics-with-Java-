import java.util.Scanner;

public class CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double r = Double.parseDouble(scanner.nextLine());

        System.out.println("Area: " + Math.PI * r * r);
        System.out.println("Perimeter: " + 2 * Math.PI * r);
    }
}

// Write a program that reads from the console a number r r
// then calculates and prints the area and perimeter of the circle/round with radius r.
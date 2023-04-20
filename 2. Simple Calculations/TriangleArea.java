import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double side = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());

        double area = side * height / 2;
        System.out.println("Triangle area = " + Math.round(area * 100.00) / 100.00);

    }
}

//Write a program that reads from the console a side and height of a triangle and calculates its area.
// Use the formula for triangle area: area = a * h / 2.
// Round the result to 2 digits after the decimal point using Math.round(area*100.00)/100.00).
import java.util.Scanner;

public class VowelsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        int sum = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch == 'a') {
                sum += 1;
            } else if (ch == 'e') {
                sum += 2;
            } else if (ch == 'i') {
                sum += 3;
            } else if (ch == 'o') {
                sum += 4;
            } else if (ch == 'u') {
                sum += 5;
            }
        }

        System.out.println(sum);
    }
}

//  Write a program that inputs text (string),
// calculates and prints the sum of the values of vowels according to the table below:

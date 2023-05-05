import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sumLeft = 0;
        int sumRight = 0;

        for (int i = 0; i < n * 2; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (i >= n) {
                sumRight += number;
            } else {
                sumLeft += number;
            }
        }

        if (sumLeft == sumRight) {
            System.out.printf("Yes, sum = %d", sumLeft);
        } else {
            System.out.printf("No, diff = %d", Math.abs(sumLeft - sumRight));
        }
    }
}

//Write a program that inputs 2 * n integers and checks if the sum of the first n numbers (left sum)
// is equal to the sum of the second n numbers (right sum). If the sums are equal,
// print "Yes" + sum, if not, print "No" + difference.
// Calculate the difference as a positive number (absolute value).
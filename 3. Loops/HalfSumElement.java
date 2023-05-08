import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            if (num > max) {
                max = num;
            }

            sum += num;
        }
        if (sum - max == max) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", sum - max);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d", sum - max);
        }

    }
}


// Write a program that inputs n integers and checks if there is a number among them that is
// equal to the sum of all others. If there is such an element, print "Yes" + its value.
// Otherwise, print "No" + the difference between the largest element and the sum of the rest, as an absolute value.
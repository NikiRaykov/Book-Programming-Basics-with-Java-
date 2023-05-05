import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        if (n == 2) {
            int num1 = Integer.parseInt(scanner.nextLine());
            int num2 = Integer.parseInt(scanner.nextLine());
            System.out.println(Math.max(num1,num2));
        } else {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                int num = Integer.parseInt(scanner.nextLine());
                if (num > max) {
                    max = num;
                }
            }
            System.out.println(max);
        }
    }
}

//Write a program that inputs n integers (n > 0) and finds the Max Number (the largest number) among them.
// The first line of the input specifies the number of integers n. The following n lines consist of one integer.
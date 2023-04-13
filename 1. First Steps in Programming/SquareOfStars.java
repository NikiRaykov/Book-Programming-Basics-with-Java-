import java.util.Scanner;

public class SquareOfStars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                if(i==1 || i==n || j==1 || j==n) {
                    System.out.print("*");
                }
                else if(i==(n/2)+1 && j==(n/2)+1) {
                    System.out.print(" ");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

// Write a Java console program that reads a whole positive
// number N from the console and prints a square of N stars on the console, like in the examples below.
// 3
//***
//* *
//***
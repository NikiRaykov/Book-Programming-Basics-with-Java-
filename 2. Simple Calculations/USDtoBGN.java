import java.util.Scanner;

public class USDtoBGN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double usd = Double.parseDouble(scanner.nextLine());
        double bgn = usd * 1.79549;

        System.out.println(Math.round(bgn * 100.0) / 100.0 + " BGN");
    }
}

// Write a program for the conversion of US dollars (USD) into Bulgarian levs (BGN).
// Round the result 2 digits after the decimal point.
// Use a fixed rate between a dollar and levs: 1 USD = 1.79549 BGN.
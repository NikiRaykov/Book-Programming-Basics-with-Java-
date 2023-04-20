public class NumbersEndingIn7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            if (i % 10 == 7) {
                System.out.println(i);
            }
        }
    }
}

// Write a program that finds all numbers within the range [1 … 1000] that ends with 7.
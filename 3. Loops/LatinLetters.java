public class LatinLetters {
    public static void main(String[] args) {
        System.out.println("Latin alphabet: ");
        for (char letter = 'a'; letter <= 'z'; letter++) {
            System.out.print(" " + letter);
        }
        System.out.println();
    }
}

// It is good to know that the for loops don't work only with numbers.
// We can solve the problem by running a for loop that
// passes sequentially through all letters in the Latin alphabet:
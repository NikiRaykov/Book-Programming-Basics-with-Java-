import java.util.Scanner;

public class GreetingByName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        System.out.printf("Hello, %s!", name);
    }
}

// Write a program that reads the user's name as input from
// the console and greets him with the text Hello, name,
// where name is the name read as input data.

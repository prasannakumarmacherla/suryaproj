import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        System.out.println("Welcome to the Number Guessing Magic Trick!");

        // Ask the user to think of a number
        System.out.println("Think of a number between 1 and 63 (inclusive).");

        // Wait for the user to press Enter
        new Scanner(System.in).nextLine();

        // Perform the magic trick
        int guessedNumber = performMagicTrick();

        // Display the guessed number
        System.out.println("Your guessed number is: " + guessedNumber);
    }

    // Magic trick to guess the number
    private static int performMagicTrick() {
        int guessedNumber = 0;

        try (Scanner scanner = new Scanner(System.in)) {
            // Ask questions about the bits
            for (int i = 0; i < 6; i++) {
                int mask = 1 << i;
                System.out.println("Is your number in this set? (Answer 'yes' or 'no')");

                // Display the set of numbers
                for (int j = 1; j <= 63; j++) {
                    if ((j & mask) != 0) {
                        System.out.print(j + " ");
                    }
                }

                // Get the user's response
                String response = scanner.nextLine().toLowerCase();

                // Update the guessedNumber based on the response
                if (response.equals("yes")) {
                    guessedNumber |= mask;
                }
            }
        }

        return guessedNumber;
    }
}

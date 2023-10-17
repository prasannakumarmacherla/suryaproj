import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BookSuggestionSystem {
    public static void main(String[] args) {
        Map<String, Map<String, String>> books = new HashMap<>();
        books.put("It Ends With Us", Map.of("Genre", "Romance", "Link", "https://www.readanybook.com/online/587823"));
        books.put("Harry Potter and the Sorcerer's Stone", Map.of("Genre", "Fiction", "Link", "https://www.read-any-book.net/online/68"));
        // Add more books with genres and links

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Book Suggestion System!");
        System.out.print("Enter a book genre: ");
        String userGenre = scanner.nextLine();

        boolean foundGenre = false;

        for (String book : books.keySet()) {
            Map<String, String> bookData = books.get(book);
            if (bookData.get("Genre").equalsIgnoreCase(userGenre)) {
                foundGenre = true;
                System.out.println(book + ": " + bookData.get("Link"));
            }
        }

        if (!foundGenre) {
            System.out.println("Sorry, no books found in the specified genre.");
        }

        scanner.close();
    }
}

package softsouve;

import java.util.Scanner;

public class gdg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the title of the article:");
        String title = scanner.nextLine();

        // Input for the article content
        System.out.println("Enter the content of the article:");
        String content = scanner.nextLine();

        // Input for the article author
        System.out.println("Enter the author of the article:");
        String author = scanner.nextLine();

        // Display the article
        System.out.println("\n--- Article Details ---");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Content:\n" + content);
    }
}

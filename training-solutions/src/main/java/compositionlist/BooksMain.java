package compositionlist;

import java.util.Scanner;

public class BooksMain {
    public static void main(String[] args) {
        int numberOfBooks;

        Books books = new Books();

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many books do you have?");
        numberOfBooks = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numberOfBooks; i++) {
            System.out.println(i+1 + ". book's title:");
            books.addBook(scanner.nextLine());
        }

        System.out.println("Your books");
        System.out.println(books.getTitles());

        System.out.println("Give me your book title:");

        System.out.println(books.findBookAndSetAuthor(scanner.nextLine(), "Gárdonyi Géza"));

    }
}

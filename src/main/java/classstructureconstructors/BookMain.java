package classstructureconstructors;

public class BookMain {

    public static void main(String[] args) {

        Book book = new Book("John Doe", "My book");
        book.register("12345");

        System.out.println("Author: " + book.getAuthor());
        System.out.println("Title: " + book.getTitle());
        System.out.println("Registration number: " + book.getRegNumber());

    }




}

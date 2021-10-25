package objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectsMain {
    public static void main(String[] args) {
        new Book();
        System.out.println(new Book());  // output: objects.Book@eed1f14

        //Book emptyBook;
        //System.out.println(emptyBook); // output: ava: variable emptyBook might not have been initialized

        Book emptyBook = null;
        System.out.println(emptyBook); //output: null

        if (emptyBook == null){
            System.out.println("Value is null");
        } else {
            System.out.println("Other");
        }

        Book book = new Book();
        System.out.println(book); //output: objects.Book@7229724f

        book = null;
        System.out.println(book); //output: null

        book = new Book();
        System.out.println(book); //output: objects.Book@4c873330

        Book anotherBook = new Book();

        System.out.println((book == anotherBook)); //output: false

        anotherBook = book;
        System.out.println(anotherBook); //output: objects.Book@4c873330

        System.out.println(book == anotherBook); //output: true


        Book book1 = new Book(); //1 obj
        Book book2 = new Book(); //2 obj
        Book book3 = new Book(); //3 obj
        Book book4 = book1; //
        Book book5 = book1; //
        Book book6 = book3; //
        Book book7 = null; //
        book4 = book6; //
        new Book(); // 4 obj
        book5 = new Book(); //5 obj
        book6 = null; //
        book5 = book4;

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(book4);
        System.out.println(book5);
        System.out.println(book6);
        System.out.println(book7);


        Book[] books = {new Book(), new Book(), new Book()};

        System.out.println(Arrays.toString(books));

        List<Book> books1 = Arrays.asList(new Book(), new Book(), new Book());

        System.out.println(books1);

        List<Book> books2 = new ArrayList<>();
        books2.add(new Book());
        books2.add(new Book());
        books2.add(new Book());

        System.out.println(books2);

    }
}

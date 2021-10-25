package objects;

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
    }
}

package lambdastreams.bookstore;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class BookStore {
    List<Book> books;

    public BookStore(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }

    public Integer getNumberOfBooks(){
        return books.stream()
                .mapToInt(Book::getPieces)
                .sum();
    }

    public Optional<Book> findNewestBook(){
        return books.stream()
                .max(Comparator.comparingInt(Book::getYearOfPublish));
    }

    public Integer getTotalValue() {
        return books.stream().reduce(0, (i, b) -> i + b.getPrice() * b.getPieces(), (x, y) -> x + y);

    }
}

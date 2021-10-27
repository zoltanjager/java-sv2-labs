package compositionlist;

import java.util.ArrayList;
import java.util.List;

public class Books {
    private List<String> titles = new ArrayList<>();

    public void addBook(String title) {
        titles.add(title);
    }

    public String findBookAndSetAuthor(String title, String author) {
        if (titles.indexOf(title) != -1 ){
            return author + ": " + titles.get(titles.indexOf(title));
        } else {
            return "Book is not exist";
        }
    }

    public List<String> getTitles() {
        return titles;
    }


}

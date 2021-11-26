package algorithmsfilter.movie;

import java.util.ArrayList;
import java.util.List;

public class VideoTheque {
    private List<Movie> films = new ArrayList<>();

    public void addFilm(Movie film) {
        films.add(film);
    }

    public List<Movie> getGoodMoviesWithCategoryGiven (Category category) {
        List<Movie> filteredFilms = new ArrayList<>();
        for (Movie actual : films) {
            if (actual.getRating() > 3 && actual.getCategory().equals(category)){
                filteredFilms.add(actual);
            }
        }
        return filteredFilms;
    }
    public List<Movie> getFilms() {
        return films;
    }
}

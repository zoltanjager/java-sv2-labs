package algorithmsfilter.movie;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VideoThequeTest {
    VideoTheque videoTheque;

    @BeforeEach
    void init() {
        videoTheque = new VideoTheque();
        videoTheque.addFilm(new Movie("Star Wars", Category.SCIFI, 5));
        videoTheque.addFilm(new Movie("Alien", Category.SCIFI, 5));
        videoTheque.addFilm(new Movie("Alien 2", Category.SCIFI, 5));
        videoTheque.addFilm(new Movie("Titanic", Category.ROMANTIC, 3));
        videoTheque.addFilm(new Movie("John Doe returns", Category.ACTION, 2));
    }

    @Test
    void addFilm() {
        assertEquals(5, videoTheque.getFilms().size());
        videoTheque.addFilm(new Movie("Mission impossible", Category.ACTION, 5));
        assertEquals(6, videoTheque.getFilms().size());
    }

    @Test
    void getGoodMoviesWithCategoryGiven() {
        assertEquals(3, videoTheque.getGoodMoviesWithCategoryGiven(Category.SCIFI).size());
    }
}
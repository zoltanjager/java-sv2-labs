package algorithmsfilter.movie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieTest {

    @Test
    void createMovie() {
        Movie movie = new Movie("Star Wars", Category.SCIFI, 5);
        assertEquals("Star Wars", movie.getTitle());
        assertEquals(Category.SCIFI, movie.getCategory());
        assertEquals(5, movie.getRating());
    }
}
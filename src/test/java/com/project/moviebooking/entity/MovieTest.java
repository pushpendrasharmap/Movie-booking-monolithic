package com.project.moviebooking.entity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MovieTest {

    @Test
    public void testNoArgsConstructor() {
        Movie movie = new Movie();
        assertNotNull(movie);
    }

    @Test
    public void testAllArgsConstructor() {
        Movie movie = new Movie(1L, "Movie Name", "Action", "English", "Original Title", "/poster.jpg", "No", "Overview", "2024-04-03", 8.5f);
        assertNotNull(movie);
    }

    @Test
    public void testGettersAndSetters() {
        Movie movie = new Movie();
        movie.setId(1L);
        movie.setMovieName("Movie Name");
        movie.setMovieGenre("Action");
        movie.setOriginalLanguage("English");
        movie.setOriginalTitle("Original Title");
        movie.setPosterPath("/poster.jpg");
        movie.setIsAdult("No");
        movie.setOverview("Overview");
        movie.setReleaseDate("2024-04-03");
        movie.setPopularity(8.5f);

        assertEquals(1L, movie.getId());
        assertEquals("Movie Name", movie.getMovieName());
        assertEquals("Action", movie.getMovieGenre());
        assertEquals("English", movie.getOriginalLanguage());
        assertEquals("Original Title", movie.getOriginalTitle());
        assertEquals("/poster.jpg", movie.getPosterPath());
        assertEquals("No", movie.getIsAdult());
        assertEquals("Overview", movie.getOverview());
        assertEquals("2024-04-03", movie.getReleaseDate());
        assertEquals(8.5f, movie.getPopularity());
    }

    @Test
    public void testEquals() {
        Movie movie1 = Movie.builder()
                .id(1L)
                .movieName("Movie Name")
                .movieGenre("Action")
                .originalLanguage("English")
                .originalTitle("Original Title")
                .posterPath("/poster.jpg")
                .isAdult("No")
                .overview("Overview")
                .releaseDate("2024-04-03")
                .popularity(8.5f)
                .build();
        Movie movie3 = new Movie(2L, "Another Movie", "Comedy", "French", "Another Title", "/another.jpg", "Yes", "Another Overview", "2024-04-04", 7.5f);

        assertNotEquals(movie1, movie3);
    }

    // Add more test cases as needed for other methods and functionalities
}

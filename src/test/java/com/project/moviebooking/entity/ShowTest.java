package com.project.moviebooking.entity;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.time.LocalTime;
import static org.junit.jupiter.api.Assertions.*;

public class ShowTest {

    @Test
    public void testNoArgsConstructor() {
        Show show = new Show();
        assertNotNull(show);
    }

    @Test
    public void testAllArgsConstructor() {
        Show show = new Show(1L, 1L, 1L, LocalDate.now(), LocalTime.of(18, 0), 10L);
        assertNotNull(show);
    }

    @Test
    public void testGettersAndSetters() {
        Show show = new Show();
        show.setId(1L);
        show.setMovieId(1L);
        show.setTheatreId(1L);
        show.setDate(LocalDate.now());
        show.setTime(LocalTime.of(18, 0));
        show.setTicketPrice(10L);

        assertEquals(1L, show.getId());
        assertEquals(1L, show.getMovieId());
        assertEquals(1L, show.getTheatreId());
        assertEquals(LocalDate.now(), show.getDate());
        assertEquals(LocalTime.of(18, 0), show.getTime());
        assertEquals(10L, show.getTicketPrice());
    }

    @Test
    public void testEquals() {
        Show show1 = new Show(1L, 1L, 1L, LocalDate.now(), LocalTime.of(18, 0), 10L);
        Show show3 = new Show(2L, 2L, 2L, LocalDate.now().plusDays(1), LocalTime.of(20, 0), 12L);

        assertNotEquals(show1, show3);
    }

    // Add more test cases as needed for other methods and functionalities
}

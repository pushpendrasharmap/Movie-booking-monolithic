package com.project.moviebooking.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BookingTest {

    @Test
    public void testNoArgsConstructor() {
        Booking booking = new Booking();
        assertNotNull(booking);
    }

    @Test
    public void testAllArgsConstructor() {
        Booking booking = new Booking(1L, 1L, "John Doe", "john@example.com", "A1", "2024-04-03 18:00", "10.00", 1L, "Theater 1", "Movie 1", 1L);
        assertNotNull(booking);
    }

    @Test
    public void testGettersAndSetters() {
        Booking booking = new Booking();
        booking.setId(1L);
        booking.setUserId(1L);
        booking.setUserName("John Doe");
        booking.setEmail("john@example.com");
        booking.setSeat("A1");
        booking.setDatetime("2024-04-03 18:00");
        booking.setPrice("10.00");
        booking.setTheatreId(1L);
        booking.setTheatreName("Theater 1");
        booking.setMovieName("Movie 1");
        booking.setMovieId(1L);

        assertEquals(1L, booking.getId());
        assertEquals(1L, booking.getUserId());
        assertEquals("John Doe", booking.getUserName());
        assertEquals("john@example.com", booking.getEmail());
        assertEquals("A1", booking.getSeat());
        assertEquals("2024-04-03 18:00", booking.getDatetime());
        assertEquals("10.00", booking.getPrice());
        assertEquals(1L, booking.getTheatreId());
        assertEquals("Theater 1", booking.getTheatreName());
        assertEquals("Movie 1", booking.getMovieName());
        assertEquals(1L, booking.getMovieId());
    }

    @Test
    public void testEquals() {
        Booking booking1 = new Booking(1L, 1L, "John Doe", "john@example.com", "A1", "2024-04-03 18:00", "10.00", 1L, "Theater 1", "Movie 1", 1L);
        Booking booking3 = new Booking(2L, 2L, "Jane Smith", "jane@example.com", "B1", "2024-04-03 19:00", "12.00", 2L, "Theater 2", "Movie 2", 2L);

        assertNotEquals(booking1, booking3);
    }

    // Add more test cases as needed for other methods and functionalities
}

package com.project.moviebooking.entity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TheatreTest {

    @Test
    public void testNoArgsConstructor() {
        Theatre theatre = new Theatre();
        assertNotNull(theatre);
    }

    @Test
    public void testAllArgsConstructor() {
        Theatre theatre = new Theatre(1L, "Theatre Name", "123 Main St");
        assertNotNull(theatre);
    }

    @Test
    public void testGettersAndSetters() {
        Theatre theatre = new Theatre();
        theatre.setId(1L);
        theatre.setTheatreName("Theatre Name");
        theatre.setTheatreAddress("123 Main St");

        assertEquals(1L, theatre.getId());
        assertEquals("Theatre Name", theatre.getTheatreName());
        assertEquals("123 Main St", theatre.getTheatreAddress());
    }

    @Test
    public void testEquals() {
        Theatre theatre1 = new Theatre(1L, "Theatre Name", "123 Main St");
        Theatre theatre3 = new Theatre(2L, "Another Theatre", "456 Broadway");

        assertNotEquals(theatre1, theatre3);
    }

    // Add more test cases as needed for other methods and functionalities
}

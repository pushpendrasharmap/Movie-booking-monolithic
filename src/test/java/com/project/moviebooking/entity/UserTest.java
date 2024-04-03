package com.project.moviebooking.entity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    public void testNoArgsConstructor() {
        User user = new User();
        assertNotNull(user);
    }

    @Test
    public void testAllArgsConstructor() {
        User user = new User(1L, "John Doe", "password123", "john@example.com");
        assertNotNull(user);
    }

    @Test
    public void testGettersAndSetters() {
        User user = new User();
        user.setId(1L);
        user.setName("John Doe");
        user.setPassword("password123");
        user.setEmail("john@example.com");

        assertEquals(1L, user.getId());
        assertEquals("John Doe", user.getName());
        assertEquals("password123", user.getPassword());
        assertEquals("john@example.com", user.getEmail());
    }

    @Test
    public void testEquals() {
        User user1 = User.builder()
                .id(1L)
                .name("John Doe")
                .password("password123")
                .email("john@example.com")
                .build();
        User user3 = new User(2L, "Jane Smith", "password456", "jane@example.com");

        assertNotEquals(user1, user3);
    }

    // Add more test cases as needed for other methods and functionalities
}

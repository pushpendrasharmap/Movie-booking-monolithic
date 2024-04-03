package com.project.moviebooking.controller;


import com.project.moviebooking.dto.RequestBodyDto;
import com.project.moviebooking.entity.Booking;
import com.project.moviebooking.service.BookingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

class BookingControllerTest {

    @Mock
    private BookingService bookingService;

    @InjectMocks
    private BookingController bookingController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void saveBooking_ValidBooking_ShouldReturnCreated() {
        // Arrange
        Booking booking = new Booking();
        when(bookingService.saveBooking(booking)).thenReturn(booking);

        // Act
        ResponseEntity<Booking> response = bookingController.saveBooking(booking);

        // Assert
        assertEquals(HttpStatus.CREATED, response.getStatusCode());
        assertEquals(booking, response.getBody());
        verify(bookingService, times(1)).saveBooking(booking);
    }

    @Test
    void getBookingsByUserId_ValidUserId_ShouldReturnListOfBookings() {
        // Arrange
        long userId = 1;
        List<Booking> bookings = new ArrayList<>();
        when(bookingService.getBookingByUserId(userId)).thenReturn(bookings);

        // Act
        List<ResponseEntity<Booking>> response = bookingController.getBookingsByUserId(userId);

        // Assert
        assertEquals(bookings.size(), response.size());
        for (ResponseEntity<Booking> entity : response) {
            assertEquals(HttpStatus.OK, entity.getStatusCode());
        }
        verify(bookingService, times(1)).getBookingByUserId(userId);
    }

    @Test
    public void testGetBookings() {
        // Mock data
        Long theatreId = 1L;
        Long movieId = 1L;
        List<Booking> bookings = new ArrayList<>();
        // Add mock bookings as needed

        // Mock service method
        when(bookingService.getByTheatreIdAndMovieId(theatreId, movieId)).thenReturn(bookings);

        // Call controller method
        List<ResponseEntity<Booking>> response = bookingController.getBookings(theatreId, movieId);

        // Verify response
        assertNotNull(response);
        assertEquals(bookings.size(), response.size());
        // Add more assertions as needed
    }

    @Test
    public void testGetBookingsByShowDate() {
        Long theatreId = 1L;
        Long movieId = 1L;
        String datetime = "2023-06-01 10:12:00";
        List<Booking> bookings = new ArrayList<>();
        // Add mock bookings as needed

        // Mock service method
        when(bookingService.getByTheatreIdAndMovieIdAndDatetime(theatreId, movieId,datetime)).thenReturn(bookings);

        // Call controller method
        List<ResponseEntity<Booking>> response = bookingController.getBookingsByShowDate(theatreId, movieId, datetime);

        // Verify response
        assertNotNull(response);
        assertEquals(bookings.size(), response.size());
    }

    @Test
    public void testTransferBooking() {
        // Mock data
        Long bookingId = 1L;
        RequestBodyDto dto = new RequestBodyDto();
        dto.setUserId(1L);
        dto.setUserName("John Doe");
        dto.setEmail("john@example.com");

        // Mock service method
        doNothing().when(bookingService).updateUserIdInBooking(bookingId, dto);

        // Call controller method
        ResponseEntity<?> response = bookingController.transferBooking(bookingId, dto);

        // Verify response
        assertNotNull(response);
        assertEquals(ResponseEntity.ok("Updated User Id"), response);
        // Add more assertions as needed
    }

    @Test
    public void testDeleteMapping() {
        // Mock data
        Long bookingId = 1L;

        // Call controller method
        ResponseEntity<?> response = bookingController.deleteMapping(bookingId);

        // Verify response
        assertNotNull(response);
        assertEquals(ResponseEntity.ok("Deleted booking"), response);
        // Add more assertions as needed
    }
}

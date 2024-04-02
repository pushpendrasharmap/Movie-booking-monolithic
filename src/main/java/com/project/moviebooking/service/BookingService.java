package com.project.moviebooking.service;



import com.project.moviebooking.dto.RequestBodyDto;
import com.project.moviebooking.entity.Booking;

import java.util.List;

public interface BookingService {
    Booking saveBooking(Booking booking);
    List<Booking> getByTheatreIdAndMovieId(Long theatreId, Long movieId);
    List<Booking> getByTheatreIdAndMovieIdAndDatetime(Long theatreId, Long movieId, String datetime);
    List<Booking> getBookingByUserId(Long userId);
    void updateUserIdInBooking(Long bookingId, RequestBodyDto dto);
    void deleteBooking(Long bookingId);
}

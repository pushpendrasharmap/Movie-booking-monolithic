package com.project.moviebooking.service.impl;


import com.project.moviebooking.dto.RequestBodyDto;
import com.project.moviebooking.entity.Booking;
import com.project.moviebooking.repository.BookingRepository;
import com.project.moviebooking.service.BookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookingServiceImpl implements BookingService {
    private final BookingRepository bookingRepository;
    @Override
    public Booking saveBooking(Booking booking) {
        return bookingRepository.save(booking);
    }

    @Override
    public List<Booking> getByTheatreIdAndMovieId(Long theatreId, Long movieId) {
        return bookingRepository.findByTheatreIdAndMovieId(theatreId, movieId);
    }

    @Override
    public List<Booking> getByTheatreIdAndMovieIdAndDatetime(Long theatreId, Long movieId, String datetime) {
        return bookingRepository.findByTheatreIdAndMovieIdAndDatetime(theatreId, movieId, datetime);
    }

    @Override
    public List<Booking> getBookingByUserId(Long userId) {
        return bookingRepository.findByUserId(userId);
    }

    @Override
    public void updateUserIdInBooking(Long bookingId, RequestBodyDto dto) {
        Optional<Booking> booking = bookingRepository.findById(bookingId);
        if (booking.isPresent()) {
            Booking presentBooking = booking.get();
            presentBooking.setUserId(dto.getUserId());
            presentBooking.setUserName(dto.getUserName());
            presentBooking.setEmail(dto.getEmail());
            bookingRepository.save(presentBooking);
        } else {
            throw new NoSuchElementException("No booking exists with the provided booking id");
        }
    }

    @Override
    public void deleteBooking(Long bookingId) {
        bookingRepository.deleteById(bookingId);
    }
}

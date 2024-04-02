package com.project.moviebooking.repository;


import com.project.moviebooking.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> findByTheatreIdAndMovieId(Long theatreId, Long movieId);
    List<Booking> findByTheatreIdAndMovieIdAndDatetime(Long theatreId, Long movieId, String datetime);
    List<Booking> findByUserId(Long userId);
    Optional<Booking> findById(Long id);
}

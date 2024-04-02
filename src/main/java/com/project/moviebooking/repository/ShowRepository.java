package com.project.moviebooking.repository;


import com.project.moviebooking.entity.Show;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShowRepository extends JpaRepository<Show,Long>  {
    List<Show> findByMovieIdAndTheatreId(Long movieId, Long theatreId);
}

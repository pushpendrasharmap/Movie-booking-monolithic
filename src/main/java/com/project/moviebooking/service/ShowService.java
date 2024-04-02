package com.project.moviebooking.service;

import com.project.moviebooking.entity.Show;

import java.util.List;

public interface ShowService {
    List<Show> getShowsByMovieIdAndTheatreId(Long movieId, Long theatreId);
    Show saveShow(Show show);
}

package com.project.moviebooking.service;

import com.project.moviebooking.entity.Movie;
import java.util.List;

public interface MovieService {
    Movie saveMovie(Movie department);

    Movie getMovieById(Long departmentId);
    Movie getMovieByMovieName(String movieName);

    List<Movie> getAllMovies();
}
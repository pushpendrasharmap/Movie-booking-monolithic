package com.project.moviebooking.service.impl;


import com.project.moviebooking.entity.Movie;
import com.project.moviebooking.repository.MovieRepository;
import com.project.moviebooking.service.MovieService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor

public class MovieServiceImpl implements MovieService {
	
	 private MovieRepository movieRepository;
	@Override
	public Movie saveMovie(Movie movie) {
	return movieRepository.save(movie);
	}


	@Override
	public Movie getMovieById(Long movieId) {
	    Optional<Movie> optionalMovie = movieRepository.findById(movieId);
	    if (optionalMovie.isPresent()) {
	        return optionalMovie.get();
	    }
	    return null; // or throw an exception, depending on your requirement
	}

	@Override
	public Movie getMovieByMovieName(String movieName) {
		 return movieRepository.findBymovieName(movieName);
	}

	@Override
	public List<Movie> getAllMovies() {
		return movieRepository.findAll();
	}

}

package com.project.moviebooking.controller;


import com.project.moviebooking.entity.Movie;
import com.project.moviebooking.service.MovieService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/Movies")
@AllArgsConstructor
@CrossOrigin(origins="*")
public class MovieController {

	private MovieService movieService;

    @PostMapping
    public ResponseEntity<Movie> saveMovie(@RequestBody Movie movie){
        Movie savedDepartment = movieService.saveMovie(movie);
        return new ResponseEntity<>(savedDepartment, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Movie> getMovieById(@PathVariable("id") Long movieId){
        Movie department = movieService.getMovieById(movieId);
        return ResponseEntity.ok(department);
    }
    @GetMapping("/m/{movieName}")
    public ResponseEntity<Movie> getMovieByMovieName(@PathVariable("movieName") String movieName){
        Movie department = movieService.getMovieByMovieName(movieName);
        return ResponseEntity.ok(department);
    }

    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies(){
        List<Movie> department = movieService.getAllMovies();
        return ResponseEntity.ok(department);
    }
}


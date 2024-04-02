package com.project.moviebooking.controller;


import com.project.moviebooking.entity.Show;
import com.project.moviebooking.service.ShowService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("api/shows")
@AllArgsConstructor
@RestController
@CrossOrigin(origins="*")
public class ShowController {

    private final ShowService showService;
    @GetMapping("/{movieId}/{theatreId}")
    public ResponseEntity<List<Show>> getShowsByMovieIdAndTheatreId(@PathVariable("movieId") Long movieId,
                                                                 @PathVariable("theatreId") Long theatreId){
        List<Show> shows = showService.getShowsByMovieIdAndTheatreId(movieId, theatreId);
        return ResponseEntity.ok(shows);
    }

    @PostMapping
    public ResponseEntity<Show> saveShow(@RequestBody Show show){
        Show savedShow = showService.saveShow(show);
        return new ResponseEntity<>(savedShow, HttpStatus.CREATED);
    }
}

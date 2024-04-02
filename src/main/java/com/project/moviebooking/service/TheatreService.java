package com.project.moviebooking.service;

import com.project.moviebooking.entity.Theatre;
import java.util.List;

public interface TheatreService {
    Theatre saveTheatre(Theatre department);
    Theatre getTheatreByTheatreName(String theatreName);
    Theatre getTheatreById(Long departmentId);
    List<Theatre> getAllTheatres();
    List<Theatre> getTheatresForMovieId(Long movieId);
}
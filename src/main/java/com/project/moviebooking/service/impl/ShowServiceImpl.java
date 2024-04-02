package com.project.moviebooking.service.impl;


import com.project.moviebooking.entity.Show;
import com.project.moviebooking.repository.ShowRepository;
import com.project.moviebooking.service.ShowService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class ShowServiceImpl implements ShowService {
    private ShowRepository showRepository;
    @Override
    public List<Show> getShowsByMovieIdAndTheatreId(Long movieId, Long theatreId) {
        return showRepository.findByMovieIdAndTheatreId(movieId, theatreId);
    }

    @Override
    public Show saveShow(Show show) {
        return showRepository.save(show);
    }
}

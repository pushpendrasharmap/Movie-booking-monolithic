package com.project.moviebooking.repository;


import com.project.moviebooking.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie,Long> {
	Movie findBymovieName(String movieName);

	List<Movie> findAll();
}

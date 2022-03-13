package com.mouramateus.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mouramateus.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
	
}

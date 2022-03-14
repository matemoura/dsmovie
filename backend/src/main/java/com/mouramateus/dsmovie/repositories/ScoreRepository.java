package com.mouramateus.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mouramateus.dsmovie.entities.Score;
import com.mouramateus.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
	
}

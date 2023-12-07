package com.hexaware.challenge.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hexaware.challenge.entity.Players;


@Repository
public interface PlayersRepository extends JpaRepository<Players, Integer>{
	@Query("SELECT distinct p.jerseyNumber FROM Players p order by jerseyNumber asc")
    List<Integer> getAllJerseyNumbers();
	

}




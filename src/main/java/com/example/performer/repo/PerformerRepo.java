package com.example.performer.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.performer.entity.Performer;


public interface PerformerRepo extends JpaRepository<Performer, Integer> {
	
	//by default Lots of Methods Available that will do Some 
	//Magic to deal with database Connect and Query....by differen ways

}
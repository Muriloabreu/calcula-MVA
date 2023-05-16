package com.api.calculamva.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.calculamva.models.StateModel;


public interface StateRepository extends JpaRepository<StateModel, Long>{
	
	boolean existsByName(String name);

}

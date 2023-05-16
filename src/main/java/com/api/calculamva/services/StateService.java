package com.api.calculamva.services;

import java.util.List;
import java.util.Optional;

import com.api.calculamva.models.StateModel;

public interface StateService {
	
	
	List<StateModel> findAll();
	Optional<StateModel> findById(Long id);
	StateModel save(StateModel state);
	void delete(StateModel state);
	boolean existsByName(String state);

}

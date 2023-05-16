package com.api.calculamva.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.calculamva.models.StateModel;
import com.api.calculamva.repositories.StateRepository;

import jakarta.transaction.Transactional;

@Service
public class StateServiceImpl implements StateService{
	
	
	@Autowired
	StateRepository stateRepository;

	@Override
	public List<StateModel> findAll() {
		
		return stateRepository.findAll();
	}

	@Override
	public Optional<StateModel> findById(Long id) {
		
		return stateRepository.findById(id);
	}

	@Override
	@Transactional
	public StateModel save(StateModel state) {
		
		return stateRepository.save(state);
	}

	@Override
	@Transactional
	public void delete(StateModel state) {
		stateRepository.delete(state);
		
	}

	@Override
	public boolean existsByName(String state) {
		
		return stateRepository.existsByName(state);
	}

}

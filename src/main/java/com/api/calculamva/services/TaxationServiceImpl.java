package com.api.calculamva.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.calculamva.models.TaxationModel;
import com.api.calculamva.repositories.TaxationRepository;

import jakarta.transaction.Transactional;

@Service
public class TaxationServiceImpl implements TaxationService{
	
	@Autowired
	TaxationRepository taxationRepository;

	@Override
	public List<TaxationModel> findAll() {
		
		return taxationRepository.findAll();
	}

	@Override
	public Optional<TaxationModel> findById(Long id) {
		
		return taxationRepository.findById(id);
	}

	@Override
	@Transactional
	public TaxationModel save(TaxationModel taxation) {
		
		return taxationRepository.save(taxation);
	}

	@Override
	@Transactional
	public void delete(TaxationModel taxation) {
		
		taxationRepository.delete(taxation);
		
	}

}

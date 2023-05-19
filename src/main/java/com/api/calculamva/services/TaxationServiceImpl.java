package com.api.calculamva.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.calculamva.models.TaxationModel;

import jakarta.transaction.Transactional;

@Service
public class TaxationServiceImpl implements TaxationService{
	
	@Autowired
	TaxationService taxationService;

	@Override
	public List<TaxationModel> findAll() {
		
		return taxationService.findAll();
	}

	@Override
	public Optional<TaxationModel> findById(Long id) {
		
		return taxationService.findById(id);
	}

	@Override
	@Transactional
	public TaxationModel save(TaxationModel taxation) {
		
		return taxationService.save(taxation);
	}

	@Override
	@Transactional
	public void delete(TaxationModel taxation) {
		
		taxationService.delete(taxation);
		
	}

}

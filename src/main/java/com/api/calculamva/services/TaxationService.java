package com.api.calculamva.services;

import java.util.List;
import java.util.Optional;

import com.api.calculamva.models.TaxationModel;

public interface TaxationRepository {
	
	List<TaxationModel> findAll();
	Optional<TaxationModel> findById(Long id);
	TaxationModel save(TaxationModel taxation);
	void delete(TaxationModel taxation);

}

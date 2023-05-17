package com.api.calculamva.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.calculamva.models.TaxationModel;

public interface TaxationRepository extends JpaRepository<TaxationModel, Long>{

}

package com.api.calculamva.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.calculamva.models.ProductModel;

public interface ProductRepository extends JpaRepository<ProductModel, Long>{
	
	boolean existsByName(String name);

}

package com.api.calculamva.services;

import java.util.List;
import java.util.Optional;

import com.api.calculamva.models.ProductModel;



public interface ProductService {
	
	List<ProductModel> findAll();
	Optional<ProductModel> findById(Long id);
	ProductModel save(ProductModel product);
	void delete(ProductModel product);
	boolean existsByName(String name);

}

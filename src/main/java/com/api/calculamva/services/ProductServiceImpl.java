package com.api.calculamva.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.calculamva.models.ProductModel;
import com.api.calculamva.repositories.ProductRepository;

import jakarta.transaction.Transactional;

@Service
public class ProductServiceImpl implements ProductService{
	
	
	@Autowired
	ProductRepository productRepository;

	@Override
	public List<ProductModel> findAll() {
		
		return productRepository.findAll();
	}

	@Override
	public Optional<ProductModel> findById(Long id) {
		
		return productRepository.findById(id);
	}

	@Override
	@Transactional
	public ProductModel save(ProductModel product) {
		
		return productRepository.save(product);
	}

	@Override
	@Transactional
	public void delete(ProductModel product) {
		
		productRepository.delete(product);
		
	}

	@Override
	public boolean existsByName(String name) {
		
		return productRepository.existsByName(name);
	}

}

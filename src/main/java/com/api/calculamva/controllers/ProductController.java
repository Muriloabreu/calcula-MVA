package com.api.calculamva.controllers;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.calculamva.dtos.ProductDtos;
import com.api.calculamva.models.ProductModel;
import com.api.calculamva.services.ProductService;


import jakarta.validation.Valid;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600) /* Serve para permitir que seja acessado de qualquer fonte */
@RequestMapping("/calcula-imposto/products")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	
	@PostMapping
	public ResponseEntity<Object> saveProduct(@RequestBody @Valid ProductDtos productDtos){
		
		if (productService.existsByName(productDtos.getName())) {
			return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflict: Name is already in use!"); /* Check se livro já está cadastrada */
		}
		var productModel = new ProductModel();
		BeanUtils.copyProperties(productDtos, productModel); /*Coverte Dtos para Model*/
		productModel.setRegistrationDate(LocalDateTime.now(ZoneId.of("UTC")));
		return ResponseEntity.status(HttpStatus.CREATED).body(productService.save(productModel));
	}
	
	@GetMapping
	public ResponseEntity<List<ProductModel>>getAllProducts(){
		return ResponseEntity.status(HttpStatus.OK).body(productService.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Object> getOneCliente(@PathVariable(value = "id") Long id) {

		Optional<ProductModel> productOptional = productService.findById(id);

		if (!productOptional.isPresent()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Product not found.. ");
		}

		return ResponseEntity.status(HttpStatus.OK).body(productOptional.get());

	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Object> deleteProduct(@PathVariable(value = "id") Long id) {

		Optional<ProductModel> productOptional = productService.findById(id);

		if (!productOptional.isPresent()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Product not found.. ");
		}

		productService.delete(productOptional.get());
		return ResponseEntity.status(HttpStatus.OK).body("Product deleted successfully. ");

	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Object> updateProduct(@PathVariable(value = "id") Long id,
			                                        @RequestBody @Valid ProductDtos productDtos) {

		Optional<ProductModel> productOptional = productService.findById(id);

		if (!productOptional.isPresent()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Product not found.. ");
		}
		
		var productModel = productOptional.get();
		productModel.setName(productDtos.getName());
		productModel.setDescription(productDtos.getDescription());
		productModel.setRegistrationDate(productModel.getRegistrationDate());
		productModel.setUnitaryValue(productDtos.getUnitaryValue());
				
		return ResponseEntity.status(HttpStatus.OK).body(productService.save(productModel));
	

	}

}

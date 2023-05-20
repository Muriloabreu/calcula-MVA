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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.api.calculamva.dtos.TaxationDtos;
import com.api.calculamva.models.TaxationModel;
import com.api.calculamva.services.TaxationService;

import jakarta.validation.Valid;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600) /* Serve para permitir que seja acessado de qualquer fonte */
@RequestMapping("/calcula-imposto/taxation")
public class TaxationController {
	
	@Autowired
	TaxationService taxationService;
	
	@PostMapping
	public ResponseEntity<Object> saveTaxation(@RequestBody @Valid TaxationDtos taxationDtos){
		
		
		var taxationModel = new TaxationModel();
		BeanUtils.copyProperties(taxationDtos, taxationModel); /*Coverte Dtos para Model*/
		
		return ResponseEntity.status(HttpStatus.CREATED).body(taxationService.save(taxationModel));
	}
	
	@GetMapping
	public ResponseEntity<List<TaxationModel>>getAllTaxation(){
		
		return ResponseEntity.status(HttpStatus.OK).body(taxationService.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Object> getOneTaxation(@PathVariable(value = "id") Long id) {

		Optional<TaxationModel> taxationOptional = taxationService.findById(id);

		if (!taxationOptional.isPresent()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Taxation not found.. ");
		}

		return ResponseEntity.status(HttpStatus.OK).body(taxationOptional.get());

	}

}

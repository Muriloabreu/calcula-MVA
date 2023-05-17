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

import com.api.calculamva.dtos.StateDtos;
import com.api.calculamva.models.StateModel;
import com.api.calculamva.services.StateService;

import jakarta.validation.Valid;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600) /* Serve para permitir que seja acessado de qualquer fonte */
@RequestMapping("/calcula-imposto/states")
public class StateController {
	
	@Autowired
	StateService stateService;
	
	
	@PostMapping
	public ResponseEntity<Object> saveState(@RequestBody @Valid StateDtos stateDtos){
		
		if (stateService.existsByName(stateDtos.getName())) {
			return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflict: Name State is already in use!"); /* Check se livro já está cadastrada */
		}
		var stateModel = new StateModel();
		BeanUtils.copyProperties(stateDtos, stateModel); /*Coverte Dtos para Model*/
		
		return ResponseEntity.status(HttpStatus.CREATED).body(stateService.save(stateModel));
	}
	
	@GetMapping
	public ResponseEntity<List<StateModel>>getAllStates(){
		return ResponseEntity.status(HttpStatus.OK).body(stateService.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Object> getOneState(@PathVariable(value = "id") Long id) {

		Optional<StateModel> stateOptional = stateService.findById(id);

		if (!stateOptional.isPresent()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("State not found. ");
		}

		return ResponseEntity.status(HttpStatus.OK).body(stateOptional.get());

	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Object> deleteState(@PathVariable(value = "id") Long id) {

		Optional<StateModel> stateOptional = stateService.findById(id);

		if (!stateOptional.isPresent()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("State not found. ");
		}

		stateService.delete(stateOptional.get());
		return ResponseEntity.status(HttpStatus.OK).body("State deleted successfully. ");

	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Object> updateProduct(@PathVariable(value = "id") Long id,
			                                        @RequestBody @Valid StateDtos stateDtos) {

		Optional<StateModel> stateOptional = stateService.findById(id);

		if (!stateOptional.isPresent()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("State not found. ");
		}
		
		var stateModel = stateOptional.get();
		stateModel.setName(stateDtos.getName());
		stateModel.setAbbreviation(stateDtos.getAbbreviation());
		stateModel.setIcms(stateDtos.getIcms());
				
		return ResponseEntity.status(HttpStatus.OK).body(stateService.save(stateModel));
	

	}

}

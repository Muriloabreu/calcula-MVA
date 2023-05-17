package com.api.calculamva.dtos;

import com.api.calculamva.models.ProductModel;
import com.api.calculamva.models.StateModel;

import jakarta.validation.constraints.NotNull;

public class TaxationDtos {
	
	@NotNull
	private ProductModel product;
	
	private StateModel state;

}

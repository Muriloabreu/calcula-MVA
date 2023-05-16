package com.api.calculamva.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class ProductDtos {
	
	@NotBlank
	private String name;
	@NotBlank
	private String description;
	@NotNull
	private double unitaryValue;
	
	public ProductDtos() {
		super();
	}
	public ProductDtos(@NotBlank String name, @NotBlank String description, @NotNull double unitaryValue) {
		super();
		this.name = name;
		this.description = description;
		this.unitaryValue = unitaryValue;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getUnitaryValue() {
		return unitaryValue;
	}
	public void setUnitaryValue(double unitaryValue) {
		this.unitaryValue = unitaryValue;
	}
	
	
	

}

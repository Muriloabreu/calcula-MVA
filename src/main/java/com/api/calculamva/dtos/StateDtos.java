package com.api.calculamva.dtos;

import jakarta.validation.constraints.NotBlank;

public class StateDtos {
	
	@NotBlank
	private String name;
	@NotBlank
	private String abbreviation;
	
	/* Constructor */
	
	public StateDtos() {
		super();
	}
	
	/* Accessor Methods */
	
	public StateDtos(@NotBlank String name, @NotBlank String abbreviation) {
		super();
		this.name = name;
		this.abbreviation = abbreviation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}
	
	
	
	

}

package com.api.calculamva.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class StateDtos {
	
	@NotBlank
	private String name;
	@NotBlank
	private String abbreviation;
	@NotNull
	private double icms;
	
	/* Constructor */
	
	public StateDtos() {
		super();
	}
	
	public StateDtos(@NotBlank String name, @NotBlank String abbreviation, @NotNull double icms) {
		super();
		this.name = name;
		this.abbreviation = abbreviation;
		this.icms = icms;
	}

	/* Accessor Methods */
	
	

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
	public double getIcms() {
		return icms;
	}
	public void setIcms(double icms) {
		this.icms = icms;
	}
	
	
	

}

package com.api.calculamva.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class StateDtos {
	
	@NotBlank
	private String name;
	@NotBlank
	private String abbreviation;
	@NotNull
	private Integer icms;
	
	/* Constructor */
	
	public StateDtos() {
		super();
	}
	
	public StateDtos(@NotBlank String name, @NotBlank String abbreviation, @NotNull Integer icms) {
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
	public Integer getIcms() {
		return icms;
	}
	public void setIcms(Integer icms) {
		this.icms = icms;
	}
	
	
	

}

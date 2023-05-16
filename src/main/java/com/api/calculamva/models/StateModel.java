package com.api.calculamva.models;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_STATE")
public class StateModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private String abbreviation;
	
	/* Constructor */
	
	public StateModel() {
		super();
	}

	public StateModel(Long id, String name, String abbreviation) {
		super();
		this.id = id;
		this.name = name;
		this.abbreviation = abbreviation;
	}
	
	/* Accessor Methods */

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "StateModel [id=" + id + ", name=" + name + ", abbreviation=" + abbreviation + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(abbreviation, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StateModel other = (StateModel) obj;
		return Objects.equals(abbreviation, other.abbreviation) && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name);
	}
	
	
	
	

}

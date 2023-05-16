package com.api.calculamva.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_TAXATION")
public class TaxationModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
}

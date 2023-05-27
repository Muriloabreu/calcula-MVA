package com.api.calculamva.dtos;

import com.api.calculamva.models.ProductModel;
import com.api.calculamva.models.StateModel;

import jakarta.validation.constraints.NotNull;

public class TaxationDtos {
	
	@NotNull
	private ProductModel product;
	@NotNull
	private StateModel state;
	@NotNull
	private double amount;
	@NotNull
	private double MVA;
	
	public TaxationDtos() {
		super();
	}

	public TaxationDtos(@NotNull ProductModel product, @NotNull StateModel state, @NotNull double amount,
			@NotNull double mVA) {
		super();
		this.product = product;
		this.state = state;
		this.amount = amount;
		MVA = mVA;
	}



	public ProductModel getProduct() {
		return product;
	}

	public void setProduct(ProductModel product) {
		this.product = product;
	}

	public StateModel getState() {
		return state;
	}

	public void setState(StateModel state) {
		this.state = state;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getMVA() {
		return MVA;
	}
	
	public void setMVA(double mVA) {
		MVA = mVA;
	}
	
	
	

}

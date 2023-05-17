package com.api.calculamva.models;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_TAXATION")
public class TaxationModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@OneToOne
	@JoinColumn(name = "product_id", referencedColumnName = "id")
	private ProductModel product;
	@Column(nullable = false)
	private double amount;
	@Column(nullable = false)
	private double valueProduct;
	@Column(nullable = false)
	private Integer MVA;
	
	@Column(nullable = true)
	private double calculoMva;
	@Column(nullable = true)
	private double valueMva;
	@Column(nullable = true)
	private double icmsXvalueMva;
	@Column(nullable = true)
	private double icmsXicms ;
	@Column(nullable = true)
	private double UND;
	@Column(nullable = true)
	private double valueXicms;
	@Column(nullable = true)
	private double totalNFE;
	
	/* Constructor */
	
	public TaxationModel() {
		
	}
	



	public TaxationModel(Long id, ProductModel product, double amount, double valueProduct, Integer mVA,
			double calculoMva, double valueMva, double icmsXvalueMva, double icmsXicms, double uND,
			double valueXicms, double totalNFE) {
		super();
		this.id = id;
		this.product = product;
		this.amount = amount;
		this.valueProduct = valueProduct;
		MVA = mVA;
		this.calculoMva = calculoMva;
		this.valueMva = valueMva;
		this.icmsXvalueMva = icmsXvalueMva;
		this.icmsXicms = icmsXicms;
		UND = uND;
		this.valueXicms = valueXicms;
		this.totalNFE = totalNFE;
	}




	/* Accessor Methods */
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public ProductModel getProduct() {
		return product;
	}


	public void setProduct(ProductModel product) {
		this.product = product;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


	public double getValueProduct() {
		return valueProduct;
	}


	public void setValueProduct(double valueProduct) {
		this.valueProduct = valueProduct;
	}
	public Integer getMVA() {
		return MVA;
	}


	public void setMVA(Integer mVA) {
		MVA = mVA;
	}


	public double getCalculoMva() {
		return calculoMva;
	}


	public void setCalculoMva(double calculoMva) {
		this.calculoMva = calculoMva;
	}


	public double getValueMva() {
		return valueMva;
	}


	public void setValueMva(double valueMva) {
		this.valueMva = valueMva;
	}


	public double getIcmsXvalueMva() {
		return icmsXvalueMva;
	}


	public void setIcmsXvalueMva(double icmsXvalueMva) {
		this.icmsXvalueMva = icmsXvalueMva;
	}


	public double getIcmsXicms() {
		return icmsXicms;
	}


	public void setIcmsXicms(double icmsXicms) {
		this.icmsXicms = icmsXicms;
	}


	public double getUND() {
		return UND;
	}


	public void setUND(double uND) {
		UND = uND;
	}


	public double getValueXicms() {
		return valueXicms;
	}


	public void setValueXicms(double valueXicms) {
		this.valueXicms = valueXicms;
	}


	public double getTotalNFE() {
		return totalNFE;
	}


	public void setTotalNFE(double totalNFE) {
		this.totalNFE = totalNFE;
	}




	@Override
	public String toString() {
		return "TaxationModel [id=" + id + ", product=" + product + ", amount=" + amount + ", valueProduct="
				+ valueProduct + ", MVA=" + MVA + ", calculoMva=" + calculoMva + ", valueMva=" + valueMva
				+ ", icmsXvalueMva=" + icmsXvalueMva + ", icmsXicms=" + icmsXicms + ", UND=" + UND + ", valueXicms="
				+ valueXicms + ", totalNFE=" + totalNFE + "]";
	}




	@Override
	public int hashCode() {
		return Objects.hash(MVA, UND, amount, calculoMva, icmsXicms, icmsXvalueMva, id, product, totalNFE, valueMva,
				valueProduct, valueXicms);
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TaxationModel other = (TaxationModel) obj;
		return Objects.equals(MVA, other.MVA) && Double.doubleToLongBits(UND) == Double.doubleToLongBits(other.UND)
				&& Double.doubleToLongBits(amount) == Double.doubleToLongBits(other.amount)
				&& Double.doubleToLongBits(calculoMva) == Double.doubleToLongBits(other.calculoMva)
				&& Double.doubleToLongBits(icmsXicms) == Double.doubleToLongBits(other.icmsXicms)
				&& Double.doubleToLongBits(icmsXvalueMva) == Double.doubleToLongBits(other.icmsXvalueMva)
				&& Objects.equals(id, other.id) && Objects.equals(product, other.product)
				&& Double.doubleToLongBits(totalNFE) == Double.doubleToLongBits(other.totalNFE)
				&& Double.doubleToLongBits(valueMva) == Double.doubleToLongBits(other.valueMva)
				&& Double.doubleToLongBits(valueProduct) == Double.doubleToLongBits(other.valueProduct)
				&& Double.doubleToLongBits(valueXicms) == Double.doubleToLongBits(other.valueXicms);
	}

	
	


	
	
	
	
	
	
}

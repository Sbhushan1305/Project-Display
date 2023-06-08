package com.medicare.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "productDB")
public class ProductEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productID;
	private String productName;
	private String productBrand;
	private String productDescription;
	private double productPrice;
	
	public ProductEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ProductEntity(int productID, String productName, String productBrand, String productDescription,
			double productPrice) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.productBrand = productBrand;
		this.productDescription = productDescription;
		this.productPrice = productPrice;
	}
	
	public ProductEntity(String productName, String productBrand, String productDescription,
			double productPrice) {
		super();
		this.productName = productName;
		this.productBrand = productBrand;
		this.productDescription = productDescription;
		this.productPrice = productPrice;
	}	

	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductBrand() {
		return productBrand;
	}
	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "MedicareProductEntity [productID=" + productID + ", productName=" + productName + ", productBrand="
				+ productBrand + ", productDescription=" + productDescription + ", productPrice=" + productPrice + "]";
	}
}

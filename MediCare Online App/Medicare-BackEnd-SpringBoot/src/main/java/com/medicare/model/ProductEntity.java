package com.medicare.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "productDB")
public class ProductEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productid;
	private String productName;
	private String productBrand;
	private String productDescription;
	private int productTotalQuantity;
	private float productPrice;
	private int productDiscount;
	private String productImage;
	private float productDiscountedPrice = (productPrice * productDiscount) / 100;
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "user_ID")
	private RegistrationEntity registrationEntity;

	public ProductEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
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

	public int getProductTotalQuantity() {
		return productTotalQuantity;
	}

	public void setProductTotalQuantity(int productTotalQuantity) {
		this.productTotalQuantity = productTotalQuantity;
	}

	public float getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}

	public int getProductDiscount() {
		return productDiscount;
	}

	public void setProductDiscount(int productDiscount) {
		this.productDiscount = productDiscount;
	}

	public float getProductDiscountedPrice() {
		return productDiscountedPrice;
	}

	public void setProductDiscountedPrice(float productDiscountedPrice) {
		this.productDiscountedPrice = productDiscountedPrice;
	}

	public String getProductImage() {
		return productImage;
	}

	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}

	public RegistrationEntity getRegistrationEntity() {
		return registrationEntity;
	}

	public void setRegistrationEntity(RegistrationEntity registrationEntity) {
		this.registrationEntity = registrationEntity;
	}
}

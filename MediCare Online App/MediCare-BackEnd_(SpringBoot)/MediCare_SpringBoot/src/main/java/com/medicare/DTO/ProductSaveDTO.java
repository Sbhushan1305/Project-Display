package com.medicare.DTO;

//DTO for save Data in Database in this DTO we don't need ID to save data in database
public class ProductSaveDTO {
	
	private String productName;
	private String productBrand;
	private String productDescription;
	private double productPrice;
	
	public ProductSaveDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	//create constructor without ID because for save don't need id
	public ProductSaveDTO(String productName, String productBrand, String productDescription,
			double productPrice) {
		super();
		this.productName = productName;
		this.productBrand = productBrand;
		this.productDescription = productDescription;
		this.productPrice = productPrice;
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
		return "MedicareProductEntity [productName=" + productName + ", productBrand="
				+ productBrand + ", productDescription=" + productDescription + ", productPrice=" + productPrice + "]";
	}

}

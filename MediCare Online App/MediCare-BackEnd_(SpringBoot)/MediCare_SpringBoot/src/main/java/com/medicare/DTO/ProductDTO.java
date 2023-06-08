package com.medicare.DTO;
//DTO = Data transfer objects here we created constructor with arguments and without arguments and also getter and setter
public class ProductDTO {

	private int productID;
	private String productName;
	private String productBrand;
	private String productDescription;
	private double productPrice;
	
	public ProductDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ProductDTO(int productID, String productName, String productBrand, String productDescription,
			double productPrice) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.productBrand = productBrand;
		this.productDescription = productDescription;
		this.productPrice = productPrice;
	}
	
	public ProductDTO(String productName, String productBrand, String productDescription,
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

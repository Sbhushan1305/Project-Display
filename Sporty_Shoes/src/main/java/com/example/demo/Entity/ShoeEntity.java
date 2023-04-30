package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Shoe_System")
public class ShoeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int srno;
	private String shoeid;
	private String brand;
	private String category;
	private String price;
	private String description;

	public ShoeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getSrno() {
		return srno;
	}

	public void setSrno(int srno) {
		this.srno = srno;
	}

	public String getShoeid() {
		return shoeid;
	}

	public void setShoeid(String shoeid) {
		this.shoeid = shoeid;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "ShoeEntity [srno=" + srno + ", shoeid=" + shoeid + ", brand=" + brand + ", category=" + category
				+ ", price=" + price + ", description=" + description + "]";
	}

}

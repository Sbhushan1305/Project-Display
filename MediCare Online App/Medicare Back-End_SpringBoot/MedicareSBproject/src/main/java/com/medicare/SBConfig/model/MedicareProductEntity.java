package com.medicare.SBConfig.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "MediProductTable")
public class MedicareProductEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mediId;
	private String mediName;
	private String mediDescription;
	private double mediPrice;
	private int mediQuantity;
	public int getMediId() {
		return mediId;
	}
	public void setMediId(int mediId) {
		this.mediId = mediId;
	}
	public String getMediName() {
		return mediName;
	}
	public void setMediName(String mediName) {
		this.mediName = mediName;
	}
	public String getMediDescription() {
		return mediDescription;
	}
	public void setMediDescription(String mediDescription) {
		this.mediDescription = mediDescription;
	}
	public double getMediPrice() {
		return mediPrice;
	}
	public void setMediPrice(double mediPrice) {
		this.mediPrice = mediPrice;
	}
	public int getMediQuantity() {
		return mediQuantity;
	}
	public void setMediQuantity(int mediQuantity) {
		this.mediQuantity = mediQuantity;
	}
}

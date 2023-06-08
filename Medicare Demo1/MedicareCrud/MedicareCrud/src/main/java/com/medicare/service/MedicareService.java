package com.medicare.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicare.model.MedicareEntity;
import com.medicare.repo.MedicareRepo;


@Service
public class MedicareService {
	@Autowired
	private MedicareRepo medicareRepo;

	// display all data
	public List<MedicareEntity> showAllData() {
		return medicareRepo.findAll();
	}

	// getting data by name
	public MedicareEntity findByName(String productName) {
		return medicareRepo.findByproductName(productName)
				.orElseThrow(() -> new RuntimeException("Product Not Available"));
	}

	// adding product / inserting producut
	public MedicareEntity saveProduct(MedicareEntity medicareEntity) {
		return medicareRepo.save(medicareEntity);
	}

	// updating product
	public MedicareEntity updateProduct(int productID, MedicareEntity medicareEntity) {
		MedicareEntity updatingProduct = medicareRepo.findById(productID)
				.orElseThrow(() -> new RuntimeException("No product avaialble with this :" + productID + " ID name"));

		if (medicareEntity.getProductName() != null) {
			updatingProduct.setProductName(medicareEntity.getProductName());
		}
		if (medicareEntity.getProductBrand() != null) {
			updatingProduct.setProductBrand(medicareEntity.getProductBrand());
		}
		if (medicareEntity.getProductName() != null) {
			updatingProduct.setProductDescription(medicareEntity.getProductDescription());
		}
		if (medicareEntity.getProductName() != null) {
			updatingProduct.setProductPrice(medicareEntity.getProductPrice());
		}
		return medicareRepo.save(updatingProduct);
	}

	// delete product
	public String deleteProductByID(int productID) {
		MedicareEntity deleteProduct = medicareRepo.findById(productID)
				.orElseThrow(() -> new RuntimeException("No product avaialble with this :" + productID + " ID name"));
		medicareRepo.deleteById(productID);
		return "Product Deleted";
	}
}

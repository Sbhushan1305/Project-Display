package com.medicare.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.medicare.model.ProductEntity;
import com.medicare.repo.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepository;

	public List<ProductEntity> findAllProduct() {
		return (List<ProductEntity>) productRepository.findAll();
	}

	public ProductEntity findByProductname(String productName) {
		return productRepository.findByproductName(productName)
				.orElseThrow(() -> new RuntimeException("Product Not Found"));
	}

	public ProductEntity saveProduct(ProductEntity productEntity) {
		return productRepository.save(productEntity);
	}

	public ProductEntity updateProduct(int productID, ProductEntity productEntity) {
		ProductEntity updatingProduct = productRepository.findById(productID)
				.orElseThrow(() -> new RuntimeException("No product avaialble with this :" + productID + " ID name"));

		if (productEntity.getProductName() != null) {
			updatingProduct.setProductName(productEntity.getProductName());
		}
		if (productEntity.getProductBrand() != null) {
			updatingProduct.setProductBrand(productEntity.getProductBrand());
		}
		if (productEntity.getProductDescription() != null) {
			updatingProduct.setProductDescription(productEntity.getProductDescription());
		}
		if (productEntity.getProductTotalQuantity() != 0) {
			updatingProduct.setProductTotalQuantity(productEntity.getProductTotalQuantity());
		}
		if (productEntity.getProductPrice() != 0.0f) {
			updatingProduct.setProductPrice(productEntity.getProductPrice());
		}
		if (productEntity.getProductDiscount()!= 0) {
			updatingProduct.setProductDiscount(productEntity.getProductDiscount());
		}
		if (productEntity.getProductImage()!= null) {
			updatingProduct.setProductImage(productEntity.getProductImage());
		}
		return productRepository.save(updatingProduct);
	}

	public String deleteProductById(int productID) {
		ProductEntity updatingProduct = productRepository.findById(productID)
				.orElseThrow(() -> new RuntimeException("No product avaialble with this :" + productID + " ID name"));
		productRepository.deleteById(productID);
		return "Product Deleted Successfully..!";
	}
}
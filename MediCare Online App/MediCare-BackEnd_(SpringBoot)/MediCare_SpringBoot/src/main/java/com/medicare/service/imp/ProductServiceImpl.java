package com.medicare.service.imp;

import org.springframework.beans.factory.annotation.Autowired;

import com.medicare.DTO.ProductDTO;
import com.medicare.DTO.ProductSaveDTO;
import com.medicare.entity.ProductEntity;
import com.medicare.repository.ProductRepository;
import com.medicare.service.ProductService;

public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public String addProduct(ProductSaveDTO productSaveDTO) {
		ProductEntity productEntity= new ProductEntity(productSaveDTO);
		productSaveDTO.getProductName();
		productSaveDTO.getProductBrand();
		productSaveDTO.getProductDescription();
		productSaveDTO.getProductPrice();
	}

}

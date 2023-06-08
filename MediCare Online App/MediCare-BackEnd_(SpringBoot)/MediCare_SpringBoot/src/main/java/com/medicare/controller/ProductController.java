package com.medicare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medicare.DTO.ProductDTO;
import com.medicare.DTO.ProductSaveDTO;
import com.medicare.repository.ProductRepository;
import com.medicare.service.ProductService;
import com.medicare.service.imp.ProductServiceImpl;

@RestController
@CrossOrigin
@RequestMapping("v1/medicare")
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@Autowired
	private ProductRepository productRepository;
	
	@PostMapping(path = "/save")
	public String saveProduct(@RequestBody ProductSaveDTO productSaveDTO) {
		String id= productService.addProduct(productSaveDTO);
		
		return id;
	}

}

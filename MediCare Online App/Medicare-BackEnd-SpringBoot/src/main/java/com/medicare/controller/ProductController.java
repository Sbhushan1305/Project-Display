package com.medicare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medicare.model.ProductEntity;
import com.medicare.service.ProductService;

@RestController
@RequestMapping(path = "/v1/medicare")
@CrossOrigin(origins = "http://localhost:4200")
public class ProductController {
	@Autowired
	private ProductService productService;

	@GetMapping("/productlist")
	public List<ProductEntity> showAllProduct() {
		return productService.findAllProduct();
	}

	@GetMapping("/findProductById/{pname}")
	public ResponseEntity<ProductEntity> findProductByName(@PathVariable String pname) {
		return new ResponseEntity<ProductEntity>(productService.findByProductname(pname), HttpStatus.OK);
	}

	@PostMapping("/saveProduct")
	public ResponseEntity<ProductEntity> saveProduct(@RequestBody ProductEntity productEntity) {
		return new ResponseEntity<ProductEntity>(productService.saveProduct(productEntity), HttpStatus.CREATED);
	}

	@PutMapping("/updateProductById/{pid}")
	public ResponseEntity<ProductEntity> updateProductById(@PathVariable int pid,
			@RequestBody ProductEntity productEntity) {
		return new ResponseEntity<ProductEntity>(productService.updateProduct(pid, productEntity), HttpStatus.CREATED);
	}

	@DeleteMapping("/deleteProductById/{pid}")
	public ResponseEntity<String> deleteProductById(@PathVariable int pid) {
		return new ResponseEntity<String>(productService.deleteProductById(pid), HttpStatus.OK);
	}
}

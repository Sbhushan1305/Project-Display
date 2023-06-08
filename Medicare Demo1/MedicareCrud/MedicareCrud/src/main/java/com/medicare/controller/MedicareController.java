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

import com.medicare.model.MedicareEntity;
import com.medicare.service.MedicareService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "/Medicare")
public class MedicareController {
	@Autowired
	MedicareService medicareService;

	// implementing service layer method to show all data
	@GetMapping(path = "/findallProduct")
	public List<MedicareEntity> findAllData() {
		return medicareService.showAllData();
	}

	// implementing service layer method to get data by name
	@GetMapping(path = "/getByName/{productName}")
	public ResponseEntity<MedicareEntity> findByName(@PathVariable String productName) {
		return new ResponseEntity<MedicareEntity>(medicareService.findByName(productName), HttpStatus.OK);
	}

	// implementing service layer method to insert / add product
	@PostMapping(path = "/save")
	public ResponseEntity<MedicareEntity> addProduct(@RequestBody MedicareEntity medicareEntity) {
		return new ResponseEntity<MedicareEntity>(medicareService.saveProduct(medicareEntity), HttpStatus.CREATED);
	}

	// implementing service layer method to update
	@PutMapping(path = "/update/{productID}")
	public ResponseEntity<MedicareEntity> updateProduct(@PathVariable int productID,
			@RequestBody MedicareEntity medicareEntity) {
		return new ResponseEntity<MedicareEntity>(medicareService.updateProduct(productID, medicareEntity),
				HttpStatus.CREATED);
	}
	
	// implementing service layer method to delete
	@DeleteMapping(path = "/delete/{productID}")
	public ResponseEntity<String> deleteByProductID(@PathVariable int productID){
		return new ResponseEntity<String>(medicareService.deleteProductByID(productID),HttpStatus.OK);
	}
}

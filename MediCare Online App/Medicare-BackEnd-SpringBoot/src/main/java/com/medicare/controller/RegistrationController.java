package com.medicare.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
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

import com.medicare.model.RegistrationEntity;
import com.medicare.repo.RegistrationRepository;
import com.medicare.service.RegistrationService;

@RestController
@RequestMapping(path = "/v1/medicare/")
@CrossOrigin(origins = "http://localhost:4200")
public class RegistrationController {
	@Autowired
	private RegistrationService registrationService;

	@GetMapping(path = "/userlist")
	public List<RegistrationEntity> showAllUser() {
		return registrationService.findAllUser();
	}

	@GetMapping(path = "/findUserByName/{username}")
	public ResponseEntity<RegistrationEntity> findUserByName(@PathVariable String username) {
		return new ResponseEntity<RegistrationEntity>(registrationService.findUserByName(username), HttpStatus.OK);
	}

	@GetMapping(path = "/findUserByName/{useremail}")
	public ResponseEntity<RegistrationEntity> findByUserEmail(@PathVariable String useremail) {
		return new ResponseEntity<RegistrationEntity>(registrationService.findUserByEmail(useremail), HttpStatus.OK);
	}

	@PostMapping(path = "/saveUser")
	public ResponseEntity<RegistrationEntity> saveUser(@RequestBody RegistrationEntity userEntity) {
		return new ResponseEntity<RegistrationEntity>(registrationService.saveUser(userEntity), HttpStatus.CREATED);
	}

	/* <----------------save with Validation method----------------> */
	@PostMapping(path = "/usersave")
	public RegistrationEntity userSave(@RequestBody RegistrationEntity userEntity) throws Exception {
		String tempEmail = userEntity.getUseremail();
		if (tempEmail != null && !"".equals(tempEmail)) {
			RegistrationEntity entityobj = registrationService.findUserByEmail(tempEmail);
			if (entityobj != null) {
				throw new Exception("User With " + tempEmail + " is already Available");
			}
		}
		RegistrationEntity entity = null;
		entity = registrationService.saveUser(userEntity);
		return entity;
	}
	/* <----------------save with Validation method----------------> */

	@PutMapping(path = "/updateUserById/{uid}")
	public ResponseEntity<RegistrationEntity> updateProductById(@PathVariable int uid,
			@RequestBody RegistrationEntity userEntity) {
		return new ResponseEntity<RegistrationEntity>(registrationService.updateUser(uid, userEntity),
				HttpStatus.CREATED);
	}

	@DeleteMapping(path = "/deleteUserById/{pid}")
	public ResponseEntity<String> deleteProductById(@PathVariable int uid) {
		return new ResponseEntity<String>(registrationService.deleteUser(uid), HttpStatus.OK);
	}

	/*------------------> login Method <------------------*/
	@PostMapping(path = "/login")
	public RegistrationEntity loginUser(@RequestBody RegistrationEntity registrationEntity) throws Exception {
		String tempEmail = registrationEntity.getUseremail();
		String tempPassword = registrationEntity.getUserpassword();
		RegistrationEntity entityObj = null;
		if (tempEmail != null && tempPassword != null) {
			entityObj = registrationService.fetchByUsernameAndUserpassword(tempEmail, tempPassword);
		}
		if (entityObj == null) {
			throw new Exception("Bad Credentials ! Please Enter Valid Email And Password");
		}
		return entityObj;
	}
}

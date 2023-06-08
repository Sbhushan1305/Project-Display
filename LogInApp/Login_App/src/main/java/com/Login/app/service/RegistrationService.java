package com.Login.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Login.app.model.RegistrationModel;
import com.Login.app.repository.RegistrationRepo;

@Service
public class RegistrationService {
	@Autowired
	private RegistrationRepo registrationRepo;

	public RegistrationModel saveUser(RegistrationModel registrationModel) {
		return registrationRepo.save(registrationModel);
	}
	
	public RegistrationModel fetchByUserEmailID(String userEmail) {
		return registrationRepo.findByuserEmailID(userEmail);
	}
}

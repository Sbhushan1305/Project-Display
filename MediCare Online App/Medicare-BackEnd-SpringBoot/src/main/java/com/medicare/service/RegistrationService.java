package com.medicare.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicare.model.RegistrationEntity;
import com.medicare.repo.LoginRepository;
import com.medicare.repo.RegistrationRepository;

@Service
public class RegistrationService {
	@Autowired
	private RegistrationRepository registrationRepository;

	public RegistrationEntity saveUser(RegistrationEntity userEntity) {
		return registrationRepository.save(userEntity);
	}

	public List<RegistrationEntity> findAllUser() {
		return (List<RegistrationEntity>) registrationRepository.findAll();
	}

	public RegistrationEntity findUserByName(String username) {
		return registrationRepository.findByusername(username).orElseThrow(() -> new RuntimeException("No data Found"));
	}

	public RegistrationEntity updateUser(int userID, RegistrationEntity userEntity) {
		RegistrationEntity updateRegistrationEntity = registrationRepository.findById(userID)
				.orElseThrow(() -> new RuntimeException("No Data Found..!"));
		if (userEntity.getUsername() != null) {
			updateRegistrationEntity.setUsername(userEntity.getUsername());
		}
		if (userEntity.getUseremail() != null) {
			updateRegistrationEntity.setUseremail(userEntity.getUseremail());
		}
		if (userEntity.getUserpassword() != null) {
			updateRegistrationEntity.setUseremail(userEntity.getUserpassword());
		}
		if (userEntity.getRole() != null) {
			updateRegistrationEntity.setRole(userEntity.getRole());
		}
		return registrationRepository.save(updateRegistrationEntity);
	}

	public String deleteUser(int userID) {
		RegistrationEntity updateUserEntity = registrationRepository.findById(userID)
				.orElseThrow(() -> new RuntimeException("No Data Found..!"));
		registrationRepository.deleteById(userID);
		return "Deleted Sucessfully ..!";
	}
}

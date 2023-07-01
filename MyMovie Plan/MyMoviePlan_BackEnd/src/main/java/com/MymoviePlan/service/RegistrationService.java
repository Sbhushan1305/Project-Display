package com.MymoviePlan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MymoviePlan.model.RegistrationEntity;
import com.MymoviePlan.repo.RegistrationRepository;

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
	
	public RegistrationEntity findUserByEmail(String useremail) {
		return registrationRepository.findByUseremail(useremail);
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
	
	/*--------------------for login method--------------------*/
	public RegistrationEntity fetchByUsernameAndUserpassword(String username,String userpassword) {
		return registrationRepository.findByUseremailAndUserpassword(username, userpassword);
	}
}

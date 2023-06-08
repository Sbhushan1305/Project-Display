package com.Login.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Login.app.model.RegistrationModel;

public interface RegistrationRepo extends JpaRepository<RegistrationModel, Integer> {

	public RegistrationModel findByuserEmailID(String userEmail);

}

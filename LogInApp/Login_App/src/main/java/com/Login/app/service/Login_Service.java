package com.Login.app.service;

import org.springframework.stereotype.Repository;

@Repository
public interface Login_Service {
	public int loginValidation(String usrename, String password);
}

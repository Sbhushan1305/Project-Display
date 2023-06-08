package com.Login.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Login.app.model.RegistrationModel;
import com.Login.app.service.RegistrationService;

@RestController
@RequestMapping(name = "/Medicare/v1")
public class RegistrationController {
	@Autowired
	private RegistrationService registrationService;

	@PostMapping("/registerUser")
	public RegistrationModel registerUser(@RequestBody RegistrationModel registrationModel) throws Exception {
		String checkEmail = registrationModel.getUserEmailID();
		if (checkEmail != null && !"".equals(checkEmail)) {
			RegistrationModel modelobject = registrationService.fetchByUserEmailID(checkEmail);
			if (modelobject != null) {
				throw new Exception("Warning : user With this Email ID : " + checkEmail + " is alredy exist");
			}
		} else {

		}
		RegistrationModel modelobject = null;
		modelobject = registrationService.saveUser(registrationModel);

		return modelobject;
	}
}

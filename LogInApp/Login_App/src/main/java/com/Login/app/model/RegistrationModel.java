package com.Login.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class RegistrationModel {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	private String UserFullName;
	private String userEmailID;
	private String userPassword;

	public RegistrationModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RegistrationModel(int userId, String userFullName, String userEmailID, String userPassword) {
		super();
		this.userId = userId;
		UserFullName = userFullName;
		this.userEmailID = userEmailID;
		this.userPassword = userPassword;
	}

	public RegistrationModel(String userFullName, String userEmailID, String userPassword) {
		super();
		UserFullName = userFullName;
		this.userEmailID = userEmailID;
		this.userPassword = userPassword;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserFullName() {
		return UserFullName;
	}

	public void setUserFullName(String userFullName) {
		UserFullName = userFullName;
	}

	public String getUserEmailID() {
		return userEmailID;
	}

	public void setUserEmailID(String userEmailID) {
		this.userEmailID = userEmailID;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	@Override
	public String toString() {
		return "RegistrationModel [userId=" + userId + ", UserFullName=" + UserFullName + ", userEmailID=" + userEmailID
				+ ", userPassword=" + userPassword + "]";
	}
}

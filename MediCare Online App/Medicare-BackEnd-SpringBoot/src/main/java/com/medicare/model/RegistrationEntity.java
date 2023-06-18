package com.medicare.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "registraionDB")
public class RegistrationEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userID;
	private String username;
	private String useremail;
	private String userpassword;
	private String role;
	
	public RegistrationEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public RegistrationEntity(String useremail, String userpassword) {
		super();
		this.useremail = useremail;
		this.userpassword = userpassword;
	}

	public RegistrationEntity(int userID, String username, String useremail, String userpassword, String role) {
		super();
		this.userID = userID;
		this.username = username;
		this.useremail = useremail;
		this.userpassword = userpassword;
		this.role = role;
	}

	public RegistrationEntity(String username, String useremail, String userpassword, String role) {
		super();
		this.username = username;
		this.useremail = useremail;
		this.userpassword = userpassword;
		this.role = role;
	}

	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	public String getUserpassword() {
		return userpassword;
	}
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
}

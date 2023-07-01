package com.MymoviePlan.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
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
	@OneToOne (mappedBy = "registrationEntity", fetch = FetchType.LAZY , cascade = CascadeType.ALL )
	private MymovieEntity mymovieEntity;
	
	public RegistrationEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public RegistrationEntity(String useremail, String userpassword) {
		super();
		this.useremail = useremail;
		this.userpassword = userpassword;
	}

	public RegistrationEntity(int userID, String username, String useremail, String userpassword, String role,
			MymovieEntity mymovieEntity) {
		super();
		this.userID = userID;
		this.username = username;
		this.useremail = useremail;
		this.userpassword = userpassword;
		this.role = role;
		this.mymovieEntity = mymovieEntity;
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

	public MymovieEntity getMymovieEntity() {
		return mymovieEntity;
	}

	public void setMymovieEntity(MymovieEntity mymovieEntity) {
		this.mymovieEntity = mymovieEntity;
	}

}

package com.Login.app.model;

public class LogIn_Model {

	private String name;
	private String username;
	private String userPassword;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public LogIn_Model(String name, String username, String userPassword) {
		super();
		this.name = name;
		this.username = username;
		this.userPassword = userPassword;
	}
	public LogIn_Model() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "LogIn_Model [name=" + name + ", username=" + username + ", userPassword=" + userPassword + "]";
	}
}

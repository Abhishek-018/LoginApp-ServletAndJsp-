package com.servlet.dto;

public class User {
private int userCode;
private String userName;
private String userEmail;
private String userPassword;
private String userDesignation;
private String userCountry;
;



public User() {
	
}


public User(int userCode,String userName, String userEmail, String userPassword, String userDesignation, String userCountry) {
	super();
	this.userCode = userCode;
	this.userName=userName;
	this.userEmail = userEmail;
	this.userPassword = userPassword;
	this.userDesignation = userDesignation;
	this.userCountry = userCountry;
}


public int getUserCode() {
	return userCode;
}

public void setUserCode(int userCode) {
	this.userCode = userCode;
}


public String getUserName() {
	return userName;
}


public void setUserName(String userName) {
	this.userName = userName;
}


public String getUserEmail() {
	return userEmail;
}

public void setUserEmail(String userEmail) {
	this.userEmail = userEmail;
}

public String getUserPassword() {
	return userPassword;
}

public void setUserPassword(String userPassword) {
	this.userPassword = userPassword;
}

public String getUserDesignation() {
	return userDesignation;
}

public void setUserDesignation(String userDesignation) {
	this.userDesignation = userDesignation;
}

public String getUserCountry() {
	return userCountry;
}

public void setUserCountry(String userCountry) {
	this.userCountry = userCountry;
}





}

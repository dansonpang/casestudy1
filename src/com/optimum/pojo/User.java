package com.optimum.pojo;

public class User {
	
	private String userID; 		// email ID 
	private String password; 	// password
	private String securityKey; // for forget password
	private int amount; 		// bank balance
	
	// generate getters and setters
	public String getUserID() {
		return userID;
	}
	
	public void setUserID(String userID) {
		this.userID = userID;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getSecurityKey() {
		return securityKey;
	}
	
	public void setSecurityKey(String securityKey) {
		this.securityKey = securityKey;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
} // end of User

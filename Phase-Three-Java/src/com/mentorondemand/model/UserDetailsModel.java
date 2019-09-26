package com.mentorondemand.model;

public class UserDetailsModel {

	private Integer userId;
	private String userName;
	private String userEmail;
	private String userPhone;
	
	public UserDetailsModel() {
		super();
	}

	public UserDetailsModel(String userName, String userEmail, String userPhone) {
		super();
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPhone = userPhone;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
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

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

}

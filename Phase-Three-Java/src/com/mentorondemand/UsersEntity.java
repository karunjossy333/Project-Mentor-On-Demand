package com.mentorondemand;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class UsersEntity {

	@Id
	@GeneratedValue
	@Column(name="id")
	private int Id;
	@Column(name="user_email")
	private String userEmail;
	@Column(name="user_password")
	private String userPassword;
	@Column(name="user_type")
	private String userType;
	@Column(name="user_status")
	private boolean userStatus;
	
	public UsersEntity() {
		super();
	}
	
}

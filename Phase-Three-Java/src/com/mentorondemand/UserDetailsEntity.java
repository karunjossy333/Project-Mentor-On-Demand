package com.mentorondemand;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_details")
public class UserDetailsEntity {
	
	@Id
	@GeneratedValue
	@Column(name="user_id")
	private int userId;
	@Column(name="id")
	private int Id;
	@Column(name="user_name")
	private String userName;
	@Column(name="user_email")
	private String userEmail;
	@Column(name="user_phone")
	private Long userPhone;
	
	public UserDetailsEntity() {
		super();
	}

}

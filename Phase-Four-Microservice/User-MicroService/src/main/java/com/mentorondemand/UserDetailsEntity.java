package com.mentorondemand;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="user_details")
public class UserDetailsEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="user_id")
	@PrimaryKeyJoinColumn
	private Integer userId;
	@Column(name="user_name")
	private String userName;
	@Column(name="user_email")
	private String userEmail;
	@Column(name="user_phone")
	private String userPhone;

	@OneToOne(targetEntity=ActorsEntity.class,cascade=CascadeType.ALL)
	@JoinColumn(name="actor_id")
	private ActorsEntity actor;

	public ActorsEntity getActor() {
		return actor;
	}

	public UserDetailsEntity() {
		super();
	}

	public UserDetailsEntity(String userName, String userEmail, String userPhone) {
		super();
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPhone = userPhone;
	}

	public void setActor(ActorsEntity users) {
		this.actor = users;
	}

	public Integer getUserId() {
		return userId;
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

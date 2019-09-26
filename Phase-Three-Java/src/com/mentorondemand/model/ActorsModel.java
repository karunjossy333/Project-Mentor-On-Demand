package com.mentorondemand.model;

public class ActorsModel {

	private Integer actorId;
	private String actorEmail;
	private String actorPassword;
	private String actorType;
	private Boolean actorStatus;	

	public ActorsModel() {
		super();
	}


	public ActorsModel(String actorEmail, String actorPassword, String actorType, Boolean actorStatus) {
		super();
		this.actorEmail = actorEmail;
		this.actorPassword = actorPassword;
		this.actorType = actorType;
		this.actorStatus = actorStatus;
	}
	
	public Integer getId() {
		return actorId;
	}

	public String getActorEmail() {
		return actorEmail;
	}


	public void setActorEmail(String actorEmail) {
		this.actorEmail = actorEmail;
	}


	public String getActorPassword() {
		return actorPassword;
	}


	public void setActorPassword(String actorPassword) {
		this.actorPassword = actorPassword;
	}


	public String getActorType() {
		return actorType;
	}


	public void setActorType(String actorType) {
		this.actorType = actorType;
	}


	public Boolean getActorStatus() {
		return actorStatus;
	}


	public void setActorStatus(Boolean actorStatus) {
		this.actorStatus = actorStatus;
	}
	
}

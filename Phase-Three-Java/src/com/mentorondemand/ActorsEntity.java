package com.mentorondemand;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="actors")
public class ActorsEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="actor_id")
	private Integer actorId;
	public void setUserDetails(UserDetailsEntity userDetails) {
		this.userDetails = userDetails;
	}

	@Column(name="actor_email")
	private String actorEmail;
	@Column(name="actor_password")
	private String actorPassword;
	@Column(name="actor_type")
	private String actorType;
	@Column(name="actor_status")
	private Boolean actorStatus;
	
	@OneToOne(targetEntity=UserDetailsEntity.class)
	@JoinColumn(name="user_id")
	private UserDetailsEntity userDetails;
	
	@OneToOne(targetEntity=MentorDetailsEntity.class)
	@JoinColumn(name="mentor_id")
	private MentorDetailsEntity mentorDetails;
	

	public ActorsEntity() {
		super();
	}


	public ActorsEntity(String actorEmail, String actorPassword, String actorType, Boolean actorStatus) {
		super();
		this.actorEmail = actorEmail;
		this.actorPassword = actorPassword;
		this.actorType = actorType;
		this.actorStatus = actorStatus;
	}

	public void setMentorDetails(MentorDetailsEntity mentorDetails) {
		this.mentorDetails = mentorDetails;
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

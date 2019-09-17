package com.mentorondemand;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Testing {

	public static void main(String[] args) {
		
//		TechnologiesEntity obj = new TechnologiesEntity();
//		obj.setTechName("Java");
		
		///////////////////////////////////////////////////////////////////////////////////
		
//		UserDetailsEntity obj = new UserDetailsEntity("Arnab", "arnab007@gmail.com", "9876543210");
//		ActorsEntity usr = new ActorsEntity("arnab007@gmail.com", "pass1word", "trainee", true);
//		obj.setActor(usr);
//		usr.setUserDetails(obj);
		
		//////////////////////////////////////////////////////////////////////////////////
		
//		MentorDetailsEntity obj = new MentorDetailsEntity("Balakrishnan", "balakrishnan24@gmail.com", 1, "www.linkdin.com/balakrishnan24", "9876541230", 10);
//		ActorsEntity usr = new ActorsEntity("balakrishnan24@gmail.com", "p@ss1word", "trainer", true);
//		ArrayList<MentorSkillsEntity> list = new ArrayList<MentorSkillsEntity>();
//		
//		MentorSkillsEntity skill1 = new MentorSkillsEntity( 2, 10.0f, 9000.0f, 10000.0f);
//		MentorSkillsEntity skill2 = new MentorSkillsEntity( 1, 5.0f, 9500.0f, 10000.0f);
//		list.add(skill1);
//		list.add(skill2);
//		obj.setMentorSkills(list);
//		
//		obj.setActor(usr);
//		usr.setMentorDetails(obj);
		
		//////////////////////////////////////////////////////////////////////////////////
		
				
		
		Configuration config = new Configuration();
		config.configure("Config.xml");
		SessionFactory sf = config.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.getTransaction();
		
		t.begin();
		s.save(obj);
		t.commit();
		s.close();
		
		System.out.println("Executed");

	}

}

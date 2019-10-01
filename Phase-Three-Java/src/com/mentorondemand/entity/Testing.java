package com.mentorondemand.entity;

import java.sql.Date;
import java.util.ArrayList;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Testing {

	public static void main(String[] args) {
		
		Configuration config = new Configuration();
		config.configure("Config.xml");
		SessionFactory sf = config.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.getTransaction();
		
		TechnologiesEntity technology = new TechnologiesEntity();
		technology.setTechName("HTML");
		
		///////////////////////////////////////////////////////////////////////////////////
		
		UserDetailsEntity user = new UserDetailsEntity("Karun", "karunjossy333@gmail.com", "8281402261");
		ActorsEntity actor1 = new ActorsEntity("karunjossy333@gmail.com", "pass1word", "trainee", true);
		user.setActor(actor1);
		actor1.setUserDetails(user);
		
		//////////////////////////////////////////////////////////////////////////////////
		
		MentorDetailsEntity mentor = new MentorDetailsEntity("Balakrishnan", "balakrishnan24@gmail.com", 1, "www.linkdin.com/balakrishnan24", "9876541230", 10);
		ActorsEntity actor2 = new ActorsEntity("balakrishnan24@gmail.com", "p@ss1word", "trainer", true);
		ArrayList<MentorSkillsEntity> list1 = new ArrayList<MentorSkillsEntity>();
		
		MentorSkillsEntity skill1 = new MentorSkillsEntity( 10.0f, 9000.0f, 10000.0f);
		
		skill1.setTechnology(technology);
		
		list1.add(skill1);
		
		mentor.setMentorSkills(list1);
		
		mentor.setActor(actor2);
		actor2.setMentorDetails(mentor);
		
		//////////////////////////////////////////////////////////////////////////////////
		
		Date date=Date.valueOf("2019-03-30");
		TrainingsEntity training = new TrainingsEntity(10000.0f, 10.0f, date);
		
		
		try {
            s.beginTransaction();
             
//            UserDetailsEntity user = (UserDetailsEntity) s.get(UserDetailsEntity.class, 19);
//            MentorDetailsEntity mentor = (MentorDetailsEntity) s.get(MentorDetailsEntity.class, 13);
            training.setTrainingMentor(mentor);
            training.setTrainingUser(user);
            
            ArrayList<PaymentsEntity> list = new ArrayList<PaymentsEntity>();
            PaymentsEntity payments = new PaymentsEntity(date, 5000.0f);
            list.add(payments);
            training.setPayments(list);
//            payments.setTraining(training);
            
//            TechnologiesEntity tech = (TechnologiesEntity) s.get(TechnologiesEntity.class, 16);
            training.setTechnology(technology);
             
        }
        catch (HibernateException e) {
            e.printStackTrace();
            s.getTransaction().rollback();
        }
		
		/////////////////////////////////////////////////////////////////////////////////
		
		t.begin();
		s.saveOrUpdate(technology);
		s.saveOrUpdate(user);
		s.saveOrUpdate(mentor);
		s.saveOrUpdate(training);

		t.commit();
		s.close();
		
		System.out.println("Executed");

	}

}

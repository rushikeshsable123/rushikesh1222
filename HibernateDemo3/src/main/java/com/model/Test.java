package com.model;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.springframework.data.jpa.provider.HibernateUtils;

public class Test {
	
	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		AdharCard ad = new AdharCard();
		
		ad.setAdharNo(1);
		ad.setName("abc");
		
		Person p = new Person();
		p.setId(1);
		p.setName("abc");
		
		p.setAdr(ad);
		ad.setP(p);
		
		
		
		session.persist(ad);
		
		session.beginTransaction().commit();
	}

	
}

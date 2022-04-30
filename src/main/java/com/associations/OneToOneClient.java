package com.associations;

import java.util.Date;

import javax.persistence.EntityManager;

import com.entities.Passport;
import com.entities.Person;
import com.service.CRUDServices;

public class OneToOneClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Passport p = new Passport();
		p.setDateOfIssue(new java.sql.Date(2020, 01, 20));
		p.setDateOfExpire(new java.sql.Date(2030, 01, 19));
		p.setPassportNumber("N560200");
		
		Person person = new Person();
		person.setAddress("Mumbai");
		person.setMobile(9988755698l);
		person.setName("Abhishek");
		person.setPassport(p);
		
		EntityManager manager= CRUDServices.getEntityManager();
		manager.getTransaction().begin();
		manager.persist(person);
		
		manager.getTransaction().commit();
		
	}

}

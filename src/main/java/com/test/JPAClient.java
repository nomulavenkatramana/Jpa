package com.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.entities.Customer;
import com.entities.Employee;
import com.entities.Student;

public class JPAClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("FirstJPA");

		EntityManager manager = factory.createEntityManager();
		EntityTransaction txn = manager.getTransaction();
		txn.begin();

		Customer cust = new Customer();
		cust.setAddress("Kolkata");
		cust.setName("Ganguly");
		cust.setMobile(778894400l);
		manager.persist(cust);

		txn.commit();
		factory.close();
	}

}

package com.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.entities.Customer;

public class CRUDServices {
	
	public static EntityManager getEntityManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("FirstJPA");

		EntityManager manager = factory.createEntityManager();
		return manager;
	}
	
	public void deleteCustomer(int id) {
		EntityManager manager = CRUDServices.getEntityManager();
		manager.getTransaction().begin();
		Customer c= manager.find(Customer.class, id);
		manager.remove(c);
		manager.getTransaction().commit();
	}

	public void insertCustomer(Customer customer) {
		EntityManager manager = CRUDServices.getEntityManager();
		manager.getTransaction().begin();
		manager.persist(customer);
		manager.getTransaction().commit();
	}

	public List<Customer> getCustomers() {
		EntityManager manager = CRUDServices.getEntityManager();
		Query query = manager.createQuery("select c from Customer c");
		List<Customer> list= query.getResultList();
		return query.getResultList();
	}

	public Customer getCustomerById(int id) {
		EntityManager manager = CRUDServices.getEntityManager();
		return manager.find(Customer.class, id);
	}
	
	public void updateCustomerById(int id, String address) {
		EntityManager manager = CRUDServices.getEntityManager();
		manager.getTransaction().begin();
		Customer cust= manager.find(Customer.class, id);
		cust.setAddress(address);
		manager.getTransaction().commit();
	}
}

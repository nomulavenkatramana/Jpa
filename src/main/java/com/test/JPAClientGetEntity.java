package com.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.entities.Customer;
import com.service.CRUDServices;

public class JPAClientGetEntity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CRUDServices service = new CRUDServices();
		
		service.updateCustomerById(7, "Ranchi");
		
	}

}

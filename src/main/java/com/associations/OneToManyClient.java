package com.associations;

import java.sql.Date;
import java.time.LocalTime;

import javax.persistence.EntityManager;

import com.entities.Item;
import com.entities.Order;
import com.service.CRUDServices;

public class OneToManyClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item item1= new Item();
		item1.setName("Milk shake");
		item1.setPrice(120);
		item1.setQuantity(1);
		Item item2=new Item();
		item1.setName("Biryani");
		item1.setPrice(220);
		item1.setQuantity(1);
		
		Order order = new Order();
		order.setAddress("K R Puram, Bangalore");
		order.setOrderName("Beverage");
		order.setOrderDate(new Date(2022, 04, 05));
		order.setOrderTime(LocalTime.now());
		order.setTotalPrice(260);
		
		order.getItems().add(item1);
		
		
		EntityManager manager= CRUDServices.getEntityManager();
		manager.getTransaction().begin();
		
		manager.persist(order);
		
		manager.getTransaction().commit();
	}

}

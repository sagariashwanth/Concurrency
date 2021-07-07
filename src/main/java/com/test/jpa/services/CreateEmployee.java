package com.test.jpa.services;

import com.test.jpa.employee.EmployeeEntity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class CreateEmployee {
	
	public static void main(String[] args) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPATESTWO");
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		
		EmployeeEntity employee = new EmployeeEntity();
		employee.setEmail("mk@gmai.com");
		employee.setEmployeeNumber(23);
		employee.setFirstName("Alex");
		employee.setLastName("Mick");
		employee.setOfficeCode(1);
		
		em.persist(employee);
		em.getTransaction().commit();
		em.close();
	}

}

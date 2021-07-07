package com.test.jpa.services;

import com.test.jpa.employee.EmployeeEntity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class FindingEmployee {
	public static void main(String[] args) {
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("SeattleJPA");
		EntityManager entityManager = emFactory.createEntityManager();
		EmployeeEntity employee = entityManager.find(EmployeeEntity.class, 1056);
		
		System.out.println(employee.toString());
	}
}
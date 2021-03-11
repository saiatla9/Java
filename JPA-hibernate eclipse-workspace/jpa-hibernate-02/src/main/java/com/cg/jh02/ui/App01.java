package com.cg.jh02.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cg.jh02.entity.Employee;
import com.cg.jh02.entity.Laptop;
import com.cg.jh02.util.JPAUtil;

public class App01 {

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManager();

		Laptop lap1 = new Laptop(null, "HP");
		Employee emp1 = new Employee("paresh", "rawlo", lap1);
		
		Laptop lap2 = new Laptop(null, "DELL");
		Employee emp2 = new Employee("arun", "teja", lap2);
		
		EntityTransaction txn = em.getTransaction();
		
		txn.begin();
		em.persist(emp1);
		em.persist(lap1);
		em.persist(emp2);
		em.persist(lap2);
		txn.commit();
		
		JPAUtil.shutdown();
		
	}

}
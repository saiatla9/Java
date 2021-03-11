package com.cg.jh01.ui;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cg.jh01.entity.Employee;
import com.cg.jh01.util.JPAUtil;

public class App01 {
	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManager();
		
		Employee emp1 = new Employee(101L,"Bhargava",153000.0,LocalDate.now());
		Employee emp2 = new Employee(102L,"Paresh",23000.0,LocalDate.now());
		Employee emp3 = new Employee(103L,"Anvesh",593000.0,LocalDate.now());
		
		EntityTransaction txn = em.getTransaction();
		em.persist(emp1);
		em.persist(emp2);
		em.persist(emp3);
		
		txn.commit();
		em.close();
	}
}

package com.cg.jha.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cg.jha.entity.Account;
import com.cg.jha.entity.Employee;
import com.cg.jha.model.Address;
import com.cg.jha.util.JPAUtil;

public class App01 {

	public static void main(String[] args) {

		EntityManager em = JPAUtil.getEntityManager();
		Address add1 = new Address("1-1-1", "streetA", "pune");
		Address add2 = new Address("2-2-2", "streetB", "Vizag");
		Address add3 = new Address("3-3-3", "streetC", "mumbai");
		Account acc1 = new Account("ICICI", "pune", 22000L);
		Account acc2 = new Account("BOB", "vizag", 20000L);
		Account acc3 = new Account("AXIS", "pune", 25000L);
		Employee e1 = new Employee("paresh", "kumar", add1, acc1);
		Employee e2 = new Employee("arun", "teja", add2, acc2);
		Employee e3 = new Employee("anvesh", "antonyr", add3, acc3);

		EntityTransaction txn = em.getTransaction();
		txn.begin();
		em.persist(e1);
		em.persist(e2);
		em.persist(e3);
		txn.commit();
		em.close();

	}

}
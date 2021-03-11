package com.cg.jh04.ui;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import ccom.cg.jh04.entity.Employee;
import com.cg.jh04.util.JPAUtil;

public class App02 {

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManager();

		String jpql = "SELECT c FROM ContractEmployee c";
		// String jpql = "SELECT m FROM Manager m";
		// String jpql = "SELECT e FROM Employee e";
		TypedQuery<ccom.cg.jh04.entity.Employee> tqry = em.createQuery(jpql, Employee.class);
		List<Employee> employees = tqry.getResultList();
		if (employees != null) {
			employees.forEach(System.out::println);
		}
		JPAUtil.shutdown();

	}

}

package com.cg.jh05.ui;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.cg.jh05.entity.Employee;
import com.cg.jh05.util.JPAUtil;

public class App3 {

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManager();
		
		String jpql = "SELECT e FROM Employee e";
		
		TypedQuery<Employee> tqry = em.createQuery(jpql, Employee.class);
		
		List<Employee> employees =tqry.getResultList();

		if (employees.isEmpty()) {
			System.out.println("No employees found");
		} else {
			employees.forEach(System.out::println);
		}
				
		JPAUtil.shutdown();

	}

}
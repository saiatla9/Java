package com.cg.jh01.ui;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.cg.jh01.entity.Employee;
import com.cg.jh01.util.JPAUtil;

public class App6 {
	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManager();
		
		String jpql = "SELECT e FROM Employee e WHERE salary >: sal";
		
		TypedQuery<Employee> tqry = em.createQuery(jpql, Employee.class);
		tqry.setParameter("sal", 158000.0);
		List<Employee> employees = tqry.getResultList();
		if (employees.isEmpty()) {
			System.out.println("No employees found");
		} else {
			employees.forEach(System.out::println);
		}
		em.close();
	}
}

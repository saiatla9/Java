package com.cg.jh05.ui;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.cg.jh05.entity.Employee;
import com.cg.jh05.util.JPAUtil;

public class App5 {

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManager();
		
		// named parameters
		String jpql = "SELECT e FROM Employee e WHERE e.salary between :limit1 and :limit2";

		TypedQuery<Employee> tqry = em.createQuery(jpql, Employee.class);
		tqry.setParameter("limit1", 45000.0);
		tqry.setParameter("limit2", 52000.0);

		List<Employee> employees = tqry.getResultList();
		
		if (employees.isEmpty()) {
			System.out.println("No employees found");
		} else {
			employees.forEach(System.out::println);
		}
				
		JPAUtil.shutdown();

	}

}
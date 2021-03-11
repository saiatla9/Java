package com.cg.jh05.ui;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.cg.jh05.entity.Employee;
import com.cg.jh05.util.JPAUtil;

public class App8 {

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManager();
		
		// named query with named parameter
		TypedQuery<Employee> tqry = em.createNamedQuery("employees_of_a_department", Employee.class);
		tqry.setParameter("deptId", 10);

		List<Employee> employees = tqry.getResultList();
		
		if (employees.isEmpty()) {
			System.out.println("No employees found");
		} else {
			employees.forEach(System.out::println);
		}
				
		JPAUtil.shutdown();

	}

}
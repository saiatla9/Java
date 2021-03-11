package com.cg.jh05.ui;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.cg.jh05.util.JPAUtil;

public class App9 {

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManager();
		
		TypedQuery<Long> query = em.createQuery("SELECT COUNT(e) FROM Employee e", Long.class);
		TypedQuery<Double> query2 = em.createQuery("SELECT SUM(e.salary) FROM Employee e", Double.class);
		TypedQuery<Double> query3 = em.createQuery("SELECT MAX(e.salary) FROM Employee e", Double.class);
		TypedQuery<Double> query4 = em.createQuery("SELECT MIN(e.salary) FROM Employee e", Double.class);
		TypedQuery<Double> query5 = em.createQuery("SELECT AVG(e.salary) FROM Employee e", Double.class);
		
		
		System.out.println("No. of Employees = " + query.getSingleResult());
		System.out.println("Total Salary of Employees = " + query2.getSingleResult());
		System.out.println("Highest Salary of Employees = " + query3.getSingleResult());
		System.out.println("Lowest Salary of Employees = " + query4.getSingleResult());
		System.out.println("Average Salary of Employees = " + query5.getSingleResult());
				
		JPAUtil.shutdown();

	}

}
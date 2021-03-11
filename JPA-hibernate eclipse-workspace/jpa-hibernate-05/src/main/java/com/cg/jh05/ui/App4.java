package com.cg.jh05.ui;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.cg.jh05.util.JPAUtil;

public class App4 {

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManager();
		
		String jpql = "SELECT e.employeeId, e.firstName, e.lastName FROM Employee e";
		
		Query tqry = em.createQuery(jpql);
		
		@SuppressWarnings("unchecked")
		List<Object[]> empList = tqry.getResultList();
		
		for(Object[] record : empList) {
			System.out.printf("%-5s%-15s%-15s\n",record[0],record[1],record[2]);
		}
				
		JPAUtil.shutdown();

	}

}
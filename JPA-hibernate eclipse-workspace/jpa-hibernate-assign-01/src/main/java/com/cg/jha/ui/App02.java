package com.cg.jha.ui;

import javax.persistence.EntityManager;
import com.cg.jha.entity.Employee;
import com.cg.jha.util.JPAUtil;

public class App02 {
	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManager();
		Employee employee=em.find(Employee.class, 3L);
		if(employee!=null) {
			System.out.println(employee);
		}else {
			System.out.println("Employee not found!");
		}
		em.close();
		
	}


}
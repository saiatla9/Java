package com.cg.jh01.ui;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cg.jh01.entity.Employee;
import com.cg.jh01.util.JPAUtil;


public class App04 {

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManager();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter employee id : ");
		long empId = scan.nextLong();
		
		Employee employee = em.find(Employee.class, empId);
		if(employee == null)
			System.out.println("Employee with Id #" + empId + " not found");
		else {
			EntityTransaction txn = em.getTransaction();
			System.out.println("Enter new salary : ");
			double newSalary = scan.nextDouble();
			employee.setSalary(newSalary);
			txn.begin();
			em.merge(employee);
			txn.commit();
		}
		scan.close();
		em.close();
	}

}

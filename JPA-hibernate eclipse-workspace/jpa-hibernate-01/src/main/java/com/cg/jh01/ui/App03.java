package com.cg.jh01.ui;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cg.jh01.entity.Employee;
import com.cg.jh01.util.JPAUtil;

public class App03 {
	public static void main(String[]args) {
		EntityManager em = JPAUtil.getEntityManager();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter employee id: ");
		Long empId=sc.nextLong();
		Employee employee=em.find(Employee.class, empId);
		if(employee==null) {
			System.out.println("Employee with id #"+empId+"not found!");
		}else {
			EntityTransaction txn = em.getTransaction();
			txn.begin();
			em.remove(employee);
			txn.commit();
			
			//System.out.println("Employee not found!");
		}
		sc.close();
		em.close();
	}
}
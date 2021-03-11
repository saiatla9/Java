package com.cg.jh03.ui;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cg.jh03.entity.Course;
import com.cg.jh03.util.JPAUtil;

public class Remove {

	public static void main(String[] args) {

		EntityManager em = JPAUtil.getEntityManager();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter course id: ");
		Long courseId = sc.nextLong();
		Course course = em.find(Course.class, 1L);
		if (course == null) {
			System.out.println("Employee with id #" + courseId + "not found!");
		} else {
			EntityTransaction txn = em.getTransaction();
			txn.begin();
			em.remove(course);
			txn.commit();
		}
		sc.close();
		JPAUtil.shutdown();

	}

}
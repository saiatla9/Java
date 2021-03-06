package com.cg.jh02.ui;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cg.jh02.entity.Course;
import com.cg.jh02.entity.Student;
import com.cg.jh02.util.JPAUtil;

public class App04 {

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManager();

		Course c1 = new Course("oracle");
		Course c2 = new Course("java");
		
		Student s1 = new Student("raghu");
		Student s2 = new Student("divya");
		Student s3 = new Student("arun");
		Student s4 = new Student("sudha");
		
		Set<Student> javaStudents = new LinkedHashSet<>();
		javaStudents.add(s2);
		javaStudents.add(s4);
		
		Set<Student> oracleStudents = new LinkedHashSet<>();
		oracleStudents.add(s1);
		oracleStudents.add(s3);
		
		c1.setStudents(oracleStudents);
		c2.setStudents(javaStudents);
		
		s1.setCourse(c1);
		s2.setCourse(c2);
		s3.setCourse(c1);
		s4.setCourse(c2);
		

		EntityTransaction txn = em.getTransaction();
		
		txn.begin();
		em.persist(c1);
		em.persist(c2);
		txn.commit();
		
		JPAUtil.shutdown();
		
	}

}
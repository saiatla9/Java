package com.cg.jh01.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cg.jh01.entity.Student;
import com.cg.jh01.model.StudentIdentity;
import com.cg.jh01.util.JPAUtil;

public class App10 {

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManager();
		
		Student s1 = new Student(new StudentIdentity("b.tech", "it"), "geetha");
		Student s2 = new Student(new StudentIdentity("b.tech", "cse"), "arun");
		Student s3 = new Student(new StudentIdentity("m.tech", "cse"), "swapna");
		Student s4 = new Student(new StudentIdentity("m.tech", "civil"), "sudha");

		EntityTransaction txn = em.getTransaction();
		txn.begin();

		em.persist(s1);
		em.persist(s2);
		em.persist(s3);
		em.persist(s4);

		txn.commit();

		em.close();

	}

}
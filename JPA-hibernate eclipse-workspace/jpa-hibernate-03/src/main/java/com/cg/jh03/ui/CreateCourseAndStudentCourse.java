package com.cg.jh03.ui;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cg.jh03.entity.Course;
import com.cg.jh03.entity.Student;
import com.cg.jh03.util.JPAUtil;

public class CreateCourseAndStudentCourse {

	public static void main(String[] args) {
		
		EntityManager em = JPAUtil.getEntityManager();
		
		Course tempCourse = new Course("Oracle");
		System.out.println("Saving the courses----");
		em.persist(tempCourse);
		Student tempStudent1=new Student("Bhargava","Sai");
		Student tempStudent2=new Student("Amrutha","Namburi");
		
		Set<Student>set1=new LinkedHashSet<>();
		set1.add(tempStudent1);
		set1.add(tempStudent2);
		
		tempCourse.setStudents(set1);
		EntityTransaction txn=em.getTransaction();
		txn.begin();
		System.out.println("\n saving students");
		em.persist(tempStudent1);
		em.persist(tempStudent2);
		System.out.println("Saved Students: "+tempCourse.getStudents());
		txn.commit();
		JPAUtil.shutdown();
	}

}
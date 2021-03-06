package com.cg.jh02.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "student2")
public class Student implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "student_id")
	private Long student_id;
	
	@Column(name = "student_name")
	private String studentName;
	
	@ManyToOne
	@JoinColumn(name = "c_id")
	private Course course;
	public Student() {
		super();
	}

	public Student(String studentName) {
		super();
		this.studentName = studentName;
	}

	public Long getStudent_id() {
		return student_id;
	}

	
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return String.format("Student [student_id=%s, name=%s]", student_id, studentName);
	}
	
	
	
//	@ManyToOne
//	@JoinColumn(name = "course_id")
//	private Course course;
	
	

}

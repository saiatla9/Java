package com.cg.jh03.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name= "courses3")
public class Course implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "c_id")
	private Long courseid;
	
	@Column(name = "title")
	private String title;

	@ManyToMany(fetch = FetchType.LAZY,
			cascade = CascadeType.ALL)
	
	@JoinTable(
			name = "course3_students3",
			joinColumns = @JoinColumn(name = "c_id"),
			inverseJoinColumns = @JoinColumn(name = "s_id")
			)
	private Set<Student> students;
	
	public Course() {
		
	}

	
	public Course(String title) {
		super();
		this.title = title;
	}


	public Long getCourseid() {
		return courseid;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	
	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}


	@Override
	public String toString() {
		return String.format("Course [courseid=%s, title=%s]", courseid, title);
	}

}
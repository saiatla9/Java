package com.cg.jh01.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employees")
public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="emp_id")
	private Long empId;
	@Column(name="emp_name")
	private String empName;
	
	private Double salary;
	@Column(name="doj")
	private LocalDate dateJoined;
	public Employee() {
		//default
	}
	public Employee(Long empId,String empName,Double salary,LocalDate dateJoined) {
		super();
		this.empId=empId;
		this.empName=empName;
		this.salary=salary;
		this.dateJoined=dateJoined;
	}
	public Long getEmpId() {
		return empId;
	}
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public LocalDate getDateJoined() {
		return dateJoined;
	}
	public void setDateJoined(LocalDate dateJoined) {
		this.dateJoined = dateJoined;
	}
	@Override
	public String toString() {
		return String.format("empId=%s, empName=%s, salary=%s, dateJoined=%s", empId, empName, salary,
				dateJoined);
	}
	
}
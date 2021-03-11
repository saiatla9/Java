package com.cg.jh01.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.cg.jh01.model.Address;

@Entity
@Table(name = "employees2")
public class Employee2 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "emp_id")
	private Long empId;

	@Column(name = "emp_name")
	private String empName;

	@Column
	private Double salary;
	
	@Embedded
	private Address address;
	
	

	public Employee2() {
		/* default constructor */
	}

	public Employee2(Long empId, String empName, Double salary, Address address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.address = address;
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
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return String.format("empId=%s, empName=%s, salary=%s, address=%s", empId, empName, salary,
				address);
	}

	

}
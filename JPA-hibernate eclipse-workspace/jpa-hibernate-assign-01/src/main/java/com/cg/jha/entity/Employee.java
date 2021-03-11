package com.cg.jha.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.cg.jha.model.Address;


@Entity
@Table(name="employee4")
public class Employee implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="emp_id")
	private Long empId;
	@Column(name="first_name",length=15)
	private String firstName;
	@Column(name="last_name",length=15)
	private String lastName;
	@Transient
	private String fullName = firstName + " " + lastName;
	@Embedded
	private Address address;
	@OneToOne(cascade= {CascadeType.PERSIST,CascadeType.REMOVE})
	@JoinColumn(name="acc_num")
	private Account salaryAccount;
	public Employee() {
		/* Default constructor */
	}
	public Employee(String firstName, String lastName, Address address, Account salaryAccount) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		//this.fullName = fullName;
		this.address = address;
		this.salaryAccount = salaryAccount;
	}
	public Long getEmpId() {
		return empId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Account getAccount() {
		return salaryAccount;
	}
	public void setAccount(Account salaryAccount) {
		this.salaryAccount = salaryAccount;
	}
	@Override
	public String toString() {
		return String.format("Employee [empId=%s, firstName=%s, lastName=%s, address=%s, account=%s]", empId, firstName,
				lastName, address, salaryAccount);
	}
	
}
package com.cg.jh02.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name= "laptops")
public class Laptop implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "laptop_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="brand", length = 15)
	private String brand;
	
	@OneToOne(mappedBy = "laptop")
	private Employee employee;

	public Laptop() {
		/*default constructor*/
	}

	public Laptop(Long id, String brand) {
		super();
		this.id = id;
		this.brand = brand;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return String.format("Laptop [id=%s, brand=%s]", id, brand);
	}

	

	
	
	
	

}
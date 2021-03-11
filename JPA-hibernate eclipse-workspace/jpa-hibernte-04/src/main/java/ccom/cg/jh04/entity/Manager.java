package ccom.cg.jh04.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "M")
public class Manager extends Employee implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name = "allow")
	public Double allowance;

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(String empName, Double salary, Double allowance) {
		super(empName, salary);
		this.allowance = allowance;
	}

	public Double getAllowance() {
		return allowance;
	}

	public void setAllowance(Double allowance) {
		this.allowance = allowance;
	}

	

	
	

}
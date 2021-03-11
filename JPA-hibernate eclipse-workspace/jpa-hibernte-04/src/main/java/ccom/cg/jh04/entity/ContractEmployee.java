package ccom.cg.jh04.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "C")
public class ContractEmployee extends Employee implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name = "dur")
	private Integer duration;

	
	public ContractEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContractEmployee(String empName, Double salary,Integer duration) {
		super(empName, salary);
		this.duration = duration;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}


	

}
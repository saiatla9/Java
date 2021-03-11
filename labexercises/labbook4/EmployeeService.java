package com.cg.eis.service;
import com.cg.eis.bean.*;
import java.util.Scanner;

interface Findable{
	void findInsuranceScheme();
	void setValues();
	void display();
}

public class EmployeeService {
	
	Employee obj = new Employee();
	
	public void setValues(String empId,String empName ,double salary,String designation) {
		obj.setEmpId(empId);
		obj.setEmpName(empName);	
		obj.setSalary(salary);	
		obj.setDesignation(designation);	
	}
	
	public void display() {
		System.out.println("Employee ID : "+obj.getEmpId());
		System.out.println("Name : "+obj.getEmpName());
		System.out.println("Salary : "+obj.getSalary());
		System.out.println("Designation : "+obj.getDesignation());
	}
	public void findInsuranceScheme(double salary) {
		salary = obj.getSalary();
		if (salary>=20000 && salary<40000 ) {
			System.out.println("Insurance Scheme => STANDARD SCHEME");
		}
		else if (salary>=40000 && salary<60000 ) {
			System.out.println("Insurance Scheme => PREMIUM SCHEME");
		}
		else if (salary>=60000 && salary<80000 ) {
			System.out.println("Insurance Scheme => ULTRA PREMIUM SCHEME");
		}
		else if (salary>=80000) {
			System.out.println("Insurance Scheme => LUXURIOUS SCHEME");
		}
	}
}

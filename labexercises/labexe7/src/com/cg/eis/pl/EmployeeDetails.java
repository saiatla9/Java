package com.cg.eis.pl;

import com.cg.eis.service.EmployeeServiceImpl;

public class EmployeeDetails {
	public static void main(String[] args) {
		EmployeeServiceImpl Esobj=new EmployeeServiceImpl();
		Esobj.getDetailsFromUser();
		
	}
	
}

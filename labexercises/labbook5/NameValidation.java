package Fullname;

import java.util.*;
class NameException extends Exception {
	 
	 public NameException(String str) {
	  System.out.println(str);
	 }
	} 
public class NameValidation {
	public static void main(String[] args) {
		  String fname="Aduri";
		  String lname="Reddy";
				 
		  
		  try {
			   if(fname.length()==0)  
			     throw new NameException("Invalid First name:First Name shouldn't be blank");
			   
			   else {
			    System.out.println("First Name is valid");
			    
			   }
			  }
			  catch (NameException a) {
			  System.out.println(a);
			  }
		  
		  try {
			   if(lname.length()==0)  
			     throw new NameException("Invalid Last name:Last Name shouldn't be blank");
			   
			   else {
			    System.out.println("Last Name is valid");
			    
			   }
			  }
			  catch (NameException a) {
			  System.out.println(a);
			  }
			 }

	}
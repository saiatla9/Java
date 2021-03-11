package com.cg.lb2;

import java.util.*; 

public class ReversingArray {

	 static void reverse(Integer a[]) 
	    { 
	        Collections.reverse(Arrays.asList(a)); 
	        System.out.println(Arrays.asList(a)); 
	    } 
	  
	    public static void main(String[] args) 
	    { 
	        Integer [] arr = {8, 19, 21, 24, 26,}; 
	        reverse(arr); 
	    } 
}

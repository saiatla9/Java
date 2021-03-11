package com.cg.lb2;

import java.util.Arrays;
import java.util.Scanner;
 
public class Main {

	 public static void main(String[] args) 
	    {
	        int count;
	        String temp;
	        Scanner scan = new Scanner(System.in);
	          
	        System.out.print("Enter number of strings : ");
	        count = scan.nextInt();
	         
	         
	        String str[] = new String[count];
	        Scanner scan2 = new Scanner(System.in);
	         
	        System.out.println("Enter the Strings one by one:");
	        for(int i = 0; i < count; i++)
	        {
	            str[i] = scan2.nextLine();
	        }
	        scan.close();
	        scan2.close();
	        
	        for (int i = 0; i < count; i++) 
	        {
	            for (int j = i + 1; j < count; j++) 
	            { 
	                if (str[i].compareTo(str[j]) > 0) 
	                {
	                    temp = str[i];
	                    str[i] = str[j];
	                    str[j] = temp;
	                }
	            }
	        }
	         
	        System.out.print("Strings in Sorted Order: " + Arrays.toString(str));
	    }
	}

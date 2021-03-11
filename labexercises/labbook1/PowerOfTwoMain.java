package com.cg.lb;

public class PowerOfTwoMain {

	public static void main(String[] args) {
		  System.out.println("2126 is power of two : "+powerOfTwoGeneral(264));
		  System.out.println("2426 is power of two : "+powerOfTwoGeneral(21));
		 }
		public static boolean powerOfTwoGeneral(int n)
		 {
		  while(n%2==0)
		  {
		   n=n/2;
		  }
		  if(n==1)
		  {
		   return true;
		  }
		  else
		  {
		   return false;
		  }

}
	}
		

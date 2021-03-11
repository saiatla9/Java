package com.cg.lb2;

public class SecondSmallestInArray {
	public static int getSecondSmallest(int[] a, int total){  
		int temp;  
		for (int i = 0; i < total; i++)   
		        {  
		            for (int j = i + 2; j < total; j++)   
		            {  
		                if (a[i] > a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }  
		       return a[1];
		}  
		public static void main(String args[]){  
		int a[]={2,4,6,8,3,9};  
		int b[]={34,66,99,27,33,26,13};  
		System.out.println("Second smallest: "+getSecondSmallest(a,6));  
		System.out.println("Second smallest: "+getSecondSmallest(b,7));  
		} 
}


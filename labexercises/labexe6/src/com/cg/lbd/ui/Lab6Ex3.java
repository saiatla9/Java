package com.cg.lbd.ui;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Lab6Ex3 {
	public static Map<Integer,Integer> getSquares(int [] arr){
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();

	    for(int i = 0; i< arr.length; i++){
	    	m.put(arr[i],arr[i]*arr[i]);
	    }
	    
	    return m;
	}
	public static void main(String[] args) {
		System.out.println("enter no.of elements:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		System.out.println("enter elements in array:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(getSquares(arr));
	}
}

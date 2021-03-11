package com.cg.lbd.ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class Lab6Ex1 {
	public static ArrayList getValues(HashMap hMap) {
		ArrayList<Integer> list = new ArrayList<Integer>( hMap.values() );
        Collections.sort(list, new Comparator<Integer>(){
 
            public int compare(Integer i1, Integer i2) {
                return i1.compareTo(i2);
            }            
            
        });
        
		return list;
	}
	public static void main(String[] args) {
		HashMap<String, Integer> hMap = new HashMap<String, Integer>();
        hMap.put("Three", 3);
        hMap.put("Two", 2);
        hMap.put("Four", 4);
        hMap.put("One", 1);
        hMap.put("Five", 5);
        System.out.println(getValues(hMap));
        System.out.println("Sorted Values");

	}

}

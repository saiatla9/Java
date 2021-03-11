package com.cg.lb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class SortByValue {
public static void main(String[] args) {
        
        HashMap<String, Integer> hMap = new HashMap<String, Integer>();
        
        hMap.put("Six", 6);
        hMap.put("Two", 2);
        hMap.put("Eight", 8);
        hMap.put("Nine", 9);
        hMap.put("Three", 3);
       
        List<Integer> list = new ArrayList<Integer>( hMap.values() );
        
        Collections.sort(list, new Comparator<Integer>(){
 
            public int compare(Integer i1, Integer i2) {
                return i1.compareTo(i2);
            }            
            
        });
       
        System.out.println("Sorted Values");
        for(Integer value : list)
            System.out.println(value);
    }

}

package com.cg.lbd.ui;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Lab6Ex4 {
	public static HashMap<Integer,String> getStudents(HashMap hmap){
		HashMap<Integer,String> medal=new HashMap<>();
		Set<Integer> set = hmap.keySet();
        for(Integer s:set)
        {
               Integer marks = (Integer) hmap.get(s);
               if(marks>=90)
               {
                     medal.put(s,"Gold");
               }
               else if(marks >=80&&marks<90)
               {
                     medal.put(s,"Silver");
                     
               }
               else if(marks>=70&&marks<80)
               {
                     medal.put(s,"Bronze");
               }
        }
        return medal;

	}
	public static void main(String[] args) {
		HashMap<Integer,Integer> hmap=new HashMap<>();
		hmap.put(1,85);
		hmap.put(6,67);
		hmap.put(4,92);
		hmap.put(2,75);
		hmap.put(5,70);
		hmap.put(3,91);
		System.out.println(getStudents(hmap));
	}
}

package com.cg.lbd.ui;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Lab6Ex6 {
	public static List<String> votersList(Map<String,Integer> m) {
		ArrayList<String> List=new ArrayList<>();
		Set<String> set = m.keySet();
        for(String s:set)
        {
               Integer age = m.get(s);
               if(age>18)
               {
                     List.add(s);
               }
		/*if(m.getValue>=18) {
			return m
		}*/
        }
		return List;
		
	}
	public static void main(String[] args) {
		Map <String,Integer> m=new HashMap<>();
		m.put("B001",14);
		m.put("B004",18);
		m.put("B002",19);
		m.put("B003",14);
		m.put("B008",18);
		m.put("B007",19);
		m.put("B006",14);
		m.put("B005",18);
		m.put("B009",19);
		System.out.println(votersList(m));
	   /* Map<String,Date> mn=new HashMap<>();
	    m.put("B001",12-12-1999);
		m.put("B004",18-12-2000);
		LocalDate n=LocalDate.now();
		Set<Date> set = m.keySet();
        for(String s:set)
        {
		Period age=Period.between(m.get(s), n);
        }
		System.out.printf("%d years",age.getYears());*/
		
	}
}

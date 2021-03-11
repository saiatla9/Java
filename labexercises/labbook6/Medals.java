package com.cg.lb;

import java.util.HashMap;
import java.util.Set;

public class Medals {
	 public HashMap<String,String> getStudent(HashMap<String,Integer> stu)
     {
            HashMap<String,String> medal = new HashMap<>();
            Set<String> set = stu.keySet();
            for(String s:set)
            {
                   Integer marks = stu.get(s);
                   if(marks>=90)
                   {
                         medal.put(s,"Gold");
                   }
                   else if(marks >=80 )
                   {
                         medal.put(s,"Silver");
                   }
                   else if(marks>=70)
                   {
                         medal.put(s,"Bronze");
                   }
            }
            return medal;
     }
     public static void main(String[] ar)
     {
            HashMap<String,Integer> stu = new HashMap<>();
            Medals m = new Medals();
            stu.put("R6",92);
            stu.put("R12",72);
            stu.put("R9",89);
            stu.put("R16",69);
            stu.put("R3",93);
            System.out.println(m.getStudent(stu));
     }

}

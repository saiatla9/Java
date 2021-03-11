package com.cg.lbd.ui;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lab6Ex2 {
	public static Map<Character,Integer> countChars(char[] array){
		Map<Character, Integer> m = new HashMap<Character, Integer>();

	    for(int i = 0; i< array.length; i++){

	        if(m.containsKey(array[i])){

	            m.put(array[i], m.get(array[i]) + 1);
	        }
	        else {
	            m.put(array[i], 1);
	        }
	    }
        
		return m;
	}
	public static void main(String[] args) {
		/*ArrayList<Character> array=new ArrayList<>();
		array.add('c');
		array.add('a');
		array.add('a');
		array.add('c');
		array.add('a');
		array.add('a');
		array.add('c');
		array.add('a');
		array.add('a');*/
		System.out.println("enter character array:");
		Scanner sc=new Scanner(System.in);
		//n=sc.nextInt();
		char [] array;
		array=sc.next().toCharArray();
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
        System.out.println(countChars(array));
        /*for(Integer value : list)
            System.out.println(value);*/
    }

}

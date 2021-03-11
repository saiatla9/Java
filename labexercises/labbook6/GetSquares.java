package com.cg.lb;

import java.util.*;

public class GetSquares {
	public static HashMap method(int[] array) {
	    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	 
	    for (int n: array) {
	      map.put( n, n*n);
	    }
	    return map;
	  }
	 
	  public static void main(String[] args) {
	    int array[] = new int[]{3,4,1,6,2,5,9,7,8};
	    HashMap<Integer, Integer> map = method(array);
	 
	    Iterator<Integer> it = map.keySet().iterator();
	    while(it.hasNext()){
	    Integer key = it.next();
	      System.out.println(key + " : " + map.get(key));
	    }
	  }

}

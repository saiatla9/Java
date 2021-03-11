package com.cg.lb;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class GetSecondSmallest {
	public int getSecondSmallest(int[] arr){
        List<Integer> intList = new ArrayList<Integer>();
        for(int i: arr){
               intList.add(i);
        }
        Collections.sort(intList);
        return intList.get(1);
 }
 public static void main(String[] args) {
        GetSecondSmallest g = new GetSecondSmallest();
        int arr[] = {42,51,56,67,12,26,86,47,66,97,39,54,43};
        int i = g.getSecondSmallest(arr);
        System.out.println(i);
 }

}

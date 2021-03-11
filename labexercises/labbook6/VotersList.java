package com.cg.lb;

import java.util.ArrayList; 
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util. Map;
import java.util.Map.Entry;

public class VotersList {
	public static List voterslist(Map<Integer, Integer> m) {
		List <Integer> li = new ArrayList<Integer> ();
		Iterator <Map.Entry<Integer,Integer>> it=m.entrySet().iterator();
		while(it.hasNext()) {
			System. out. println(it.next());
		}
	
		return li;
	}
		public static void main(String[] args) {
		Map<Integer,Integer> me= new HashMap<Integer,Integer>();
		me.put(36,91);
		me.put(46,66);
        me.put(29,26);
		me.put(21,13);
		me.put(24,21);
		me.put(26,26);
		System.out.println(voterslist( me));
		}

}

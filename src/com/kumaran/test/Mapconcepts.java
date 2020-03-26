package com.kumaran.test;

import java.util.HashMap;
import java.util.Map;

public class Mapconcepts {
public static void main(String[] args) {
	String s="HELLOKUMARANWHEREAREYOUNOW";
	char[] ch = s.toCharArray();
	Map<Character, Integer> m=new HashMap<Character, Integer>();
	for (char c : ch) {
		if (m.containsKey(c)) {
			Integer i = m.get(c);
			m.put(c, i+1);
		}else {
			m.put(c, 1);
		}
		
	}
	System.out.println(m);
	
	
	
	
	
	
	
}
}

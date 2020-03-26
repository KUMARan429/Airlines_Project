package com.kumaran.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repeativechar {
public static void main(String[] args) {
	String s="KUMARANISALWAYSSINGLE";
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
	//System.out.println(m);
	Set<Entry<Character, Integer>> entrySet = m.entrySet();
	for (Entry<Character, Integer> entry : entrySet) {
		if (entry.getValue()>1) {
			
		
		Character key = entry.getKey();
		Integer value = entry.getValue();
		System.out.println(key+"="+value);
	}
	}
	
	
	
	
	
}
}

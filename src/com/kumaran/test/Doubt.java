package com.kumaran.test;

import java.util.HashMap;
import java.util.Map;

public class Doubt {
public static void main(String[] args) {
	
	String s="KUMARANISALWAYSSINGLE";
	char[] charArray = s.toCharArray();
	Map<Character, Integer> m=new HashMap<Character, Integer>();
for (char c : charArray) {
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

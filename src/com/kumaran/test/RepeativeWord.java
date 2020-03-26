package com.kumaran.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RepeativeWord {
	public static void main(String[] args) {
		String s= " WELCOME TO JAVA HERE JAVA HERE HERE WHERE JAVA THERE JAVA";
		String[] split = s.split(" ");
		Map<String, Integer> m=new HashMap<String, Integer>();
		for (String s1 : split) {
			//System.out.println(s1);
			if (m.containsKey(s1)) {
				Integer i = m.get(s1);
				m.put(s1, i+1);
			}
			else {
				m.put(s1, 1);
			}
		}
		Set<Entry<String, Integer>> entrySet = m.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getValue()>1) {
				String key = entry.getKey();
				Integer value = entry.getValue();
				System.out.println(key+"="+value);
			}
			
		}
		
		
		
		
		
		
		
		
	}

}

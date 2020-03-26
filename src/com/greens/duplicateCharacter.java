package com.greens;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class duplicateCharacter {
public static void main(String[] args) {
	String s1="whereareyounow";
	char[] ch = s1.toCharArray();
Map<Character,Integer>m=new LinkedHashMap<Character,Integer>();
	for (Character c : ch) {
if (m.containsKey(c)) {
	Integer i = m.get(c);
	m.put(c, i+1);
	
}else {
	m.put(c, 1);
}
	}
Set<Entry<Character, Integer>> entrySet = m.entrySet();
for (Entry<Character, Integer> o : entrySet) {
	if (o.getValue()>1) {
		Character key = o.getKey();
		Integer value = o.getValue();
		System.out.println(key+"="+value);
	}
	
}
//System.out.println(m);

	
}}

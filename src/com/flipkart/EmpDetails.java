package com.flipkart;

public class EmpDetails {
	
public static void main(String[] args) {
	
	String s="sathiya123";
	String d="";
	for (int i = 0; i <s.length(); i++) {
		char c = s.charAt(i);
		if ('0'< c && c<'9') {
			String f = String.valueOf(c);
			d=d+f;
			
		}
		
	}
	System.out.println(d);
	
	
	
	
}
}
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	


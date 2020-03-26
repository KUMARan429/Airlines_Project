package com.greens;

import java.util.Scanner;

public class PalindromeString {
public static void main(String[] args) {
	Scanner d=new Scanner(System.in);
	
	System.out.println("enter the name");
	String next = d.next();
	String a=next;
	String f="";
	for (int i = next.length()-1; i >=0; i--) {
		
		char c = next.charAt(i);
		f=f+c;
	}
	System.out.println(f);
	if (f.equals(a)) {
		System.out.println("palindome");
	}else {
		System.out.println("not an palindrome");
	}
	
	
	
	
	
	
	
}
}

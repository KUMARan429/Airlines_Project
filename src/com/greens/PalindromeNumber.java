package com.greens;

import java.util.Scanner;

public class PalindromeNumber {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number");
	int c = s.nextInt();
	int h=c;
	int i=0,j=0;
	while(h>0) {
		i=h%10;
		j=(j*10)+i;
		h=h/10;
	}
	System.out.println(j);
	if (c==j) {
	System.out.println("the number is palindrome "+c);	
	}else {
	System.out.println("not an palindorme");
}
}}

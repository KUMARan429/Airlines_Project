package com.greens;

import java.util.Scanner;

public class PrimeNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n = sc.nextInt();
	int count=0;
	for (int j= 2; j <n/2; j++) {
		if (n%j==0) {
			count++;
		}
	}
		if (count==0) {
			System.out.println("Prime number");
		}else {
			System.out.println("not an prime number");
		}
	
	
	
	
	

}}

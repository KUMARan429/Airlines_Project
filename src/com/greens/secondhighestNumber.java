package com.greens;

public class secondhighestNumber {
public static void main(String[] args) {
	int a[]= {10,70,20,244,30,60,451};
	int s;
	for (int i = 0; i < a.length; i++) {
		for (int j = i+1; j <a.length; j++) {
			if (a[i]>a[j]) {
				
				s=a[i];
				a[i]=a[j];
				a[j]=s;
			}
			
		}
		System.out.println(a[i]);
		
	}
	System.out.println("Second Max numis :"+a[a.length-2]);
	
	
}
}

package com.greens;

import java.util.Scanner;

public class Armstrongnumber {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number");
	int z = s.nextInt();
	int p=z,j=0,i=0;
	while(p>0) {
		i=p%10;
		j=j+(i*i*i);
		p=p/10;
		}
	if (z
			==j) {
		System.out.println("the number is armstrong");
	}
	else {
		System.out.println("not an armstrong number");
	}
	
	
	
}
}

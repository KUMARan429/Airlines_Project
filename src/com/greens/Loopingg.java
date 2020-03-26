package com.greens;

import java.util.ArrayList;

public class Loopingg {
public static void main(String[] args) {
	ArrayList<Integer> o=new ArrayList<Integer>();
	o.add(20);
	o.add(30);
	o.add(32);
	o.add(40);
	o.add(25);
	o.add(560);
	o.add(556);
	o.add(666);
	//ArrayList<Integer> h=new ArrayList<Integer>();
	for (int i = 0; i < o.size(); i++) {
	}
	System.out.println(o);

	System.out.println("foreach");
	for (Integer f : o) {
		System.out.println(f);
	}
	System.out.println("While LOOP");
	int h = 0;
	while(h <o.size()) {
	System.out.println(o.get(h));
	h++;
}}
}


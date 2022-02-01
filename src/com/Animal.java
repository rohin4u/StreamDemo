package com;

import java.util.ArrayList;
import java.util.List;

public class Animal {

	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<Integer>();
		l.add(34);
		l.add(50);
		l.add(50);
		l.add(80);
		l.add(100);
		l.add(90);
		
		l.stream().filter(p->p>50).forEach(System.out::println);
		

	}

}

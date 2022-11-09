package com.java.oops.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet<String> emp = new HashSet<>();
		
		emp.add("Ramesh");
		emp.add("Senjal");
		emp.add("john");
		emp.add("paddy");
		emp.add("john");
		
		Iterator<String> itr = emp.iterator();
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
	}
}

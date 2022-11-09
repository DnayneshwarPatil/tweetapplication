package com.java.oops.collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		
		
		LinkedHashSet<String> laptop = new LinkedHashSet<>();
		
		laptop.add("HP");
		laptop.add("Dell");
		laptop.add("Sony");
		laptop.add("Mac book");
		laptop.add("Dell");
		
		Iterator<String> itr = laptop.iterator();
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
	}

}

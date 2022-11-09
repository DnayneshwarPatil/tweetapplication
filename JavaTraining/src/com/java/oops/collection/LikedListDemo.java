package com.java.oops.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.stream.Stream;

public class LikedListDemo {
	
	public static void main(String[] args) {
		
		LinkedList<String> emp = new LinkedList<>();
		emp.add("Peter");
		emp.add("john");
		emp.add("sushil");
		emp.add("rama");
		
		emp.remove(1);
		emp.addLast("mahesh");
		
		
		Iterator<String> itr = emp.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("***************************************************");
		
		emp.stream().forEach(System.out::println);
		System.out.println("***************************************************");
		
	}
	

	
	
}

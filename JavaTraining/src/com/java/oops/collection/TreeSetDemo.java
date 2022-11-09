package com.java.oops.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		
		TreeSet<String > bike = new TreeSet<>();
		bike.add("R15");
		bike.add("FZ");
		bike.add("pulsar");
		bike.add("Nija");
		
		Iterator<String> itr = bike.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}

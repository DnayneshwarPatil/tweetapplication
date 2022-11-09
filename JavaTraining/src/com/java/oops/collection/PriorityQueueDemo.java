package com.java.oops.collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
	
	public static void main(String[] args) {
		
		PriorityQueue<String> empQueue = new PriorityQueue<>();
		
		empQueue.add("peter");
		empQueue.add("Rohan");
		empQueue.add("jain");
		
		System.out.println("Lead is "+empQueue.peek());
		Iterator<String > itr = empQueue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}

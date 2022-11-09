package com.java.oops.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
public static void main(String[] args) {
	
	ArrayList<String > empList =  new ArrayList<>();
	empList.add("Peter");
	empList.add("sushil");
	empList.add("paramij");
	empList.add("john");
	
	System.out.println(empList);
	
	Iterator itr = empList.iterator();
	
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}

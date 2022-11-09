package com.java.oops.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapAssignment {
	
	public static void main(String[] args) {
		
	Map<String, String> emp = new HashMap<String, String>();
		
		emp.put("101", "john");
		emp.put("102", "peter");
		emp.put("103", "Rama");
		emp.put("104", "Rohan");
		
		
		
		emp.remove("102", "peter");
		
		System.out.println(emp);
		for(Map.Entry<String, String> map: emp.entrySet()) {
			
			System.out.println("Emp Id : "+map.getKey()+" "+"Emp-Name: "+map.getValue());
		}
	}

}

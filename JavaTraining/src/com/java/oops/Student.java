package com.java.oops;

public class Student {
	Integer id;
	String name;
	Address address;

	void addStudent(Integer id, String name, Address address) {
		this.id=id;
		this.name=name;
		this.address=address;
	}
	void displayStudent() {
		System.out.println(name + "" +address.city+""+address.country);
	}
	public static void main(String[] args) {
		Address peterAddress = new Address("Pune", "Maharastra", "India");
		
		Student peter = new Student();
		peter.addStudent(1, "peter", peterAddress);
		peter.displayStudent();
	}
	
	 
}

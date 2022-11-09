package com.java.oops;


public class Dev extends Employee {
    Integer bonus = 50000;
	Integer totalSalary =basicSalary+ bonus;
	
	public static void main(String[] args) {
		Dev peter = new Dev();
		System.out.println("Total salary of Peter ="+ peter.totalSalary);
	}
}

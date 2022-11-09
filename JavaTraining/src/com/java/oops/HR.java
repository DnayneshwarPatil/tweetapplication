package com.java.oops;

public class HR extends Employee{
	Integer bonus = 2000;
	//Integer total = bonus+basicSalary;
	public static void main(String[] args) {
		HR jon = new HR();
	//	System.out.println("jon total salary"+jon.total);
		jon.TotalSalary(jon.basicSalary, jon.bonus);
	}

}

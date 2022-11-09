package com.java.oops;

public class Sale extends Employee {
	
	Integer bonus = 32000;
	Integer insentive;
	
	void working() {
		System.out.println("Employee working in Sale");
	}
	
	
	public static void main(String[] args) {
		Sale peter = new Sale();
		peter.insentive= 15000;
		peter.TotalSalary(peter.basicSalary, peter.bonus, peter.insentive);
		peter.working();
	}

}

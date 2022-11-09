package com.java.oops;

public class Employee {
	Integer basicSalary = 30000;
	
	void TotalSalary(Integer bs, Integer bonus) {
		Integer total = bs+bonus;
		System.out.println(total);
	}

	void TotalSalary(Integer bs, Integer bonus, Integer insentive) {
		
		Integer total = bs+bonus+insentive;
		System.out.println(total);
	}
	
	void working() {
		System.out.println("employee working");
	}
}

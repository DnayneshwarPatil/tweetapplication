package com.junit.demo;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	public void testAddMethod() {

		Calculator cl = new Calculator();
		int sum = cl.add(10, 20);
		System.out.println(sum);

	}

	@Test
	public void testSubMethod() {

		Calculator cl = new Calculator();
		int sub = cl.add(50, 20);
		System.out.println("Sub Value :" + sub);

	}

	@Test
	public void testProductMethod() {

		Calculator cl = new Calculator();
		int pro = cl.add(20, 20);
		System.out.println("Product Valu :" + pro);

	}

}

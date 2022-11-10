package com.junit.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.junit.demo.Calculator;

public class BeforeAndAfterTest {

	Calculator cl;
	
	@BeforeEach
	public void init() {
		cl = new Calculator();
		System.out.println("calling before each Method");
		
	}
	
	@AfterEach
	public void after() {
		System.out.println("Call After each Method");
	}

	@Test
	@DisplayName("Adding number")
	public void testAddMethod() {
		int sum = cl.add(10, 20);
		assertEquals(30, sum);
		System.out.println("Add Value :" + sum);

	}

	@Test
	@DisplayName("Substracting two number")
	public void testSubMethod() {
		Calculator cl = new Calculator();
		int sub = cl.sub(50, 20);
		assertEquals(30, sub);
		System.out.println("Sub Value :" + sub);

	}

	@Test
	@DisplayName("Multiplying two  number")
	public void testProductMethod() {
		int pro = cl.product(20, 20);
		assertEquals(400, pro);
		System.out.println("Product Valu :" + pro);

	}

}

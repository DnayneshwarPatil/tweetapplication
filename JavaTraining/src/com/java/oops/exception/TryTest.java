package com.java.oops.exception;

public class TryTest {

	public static void main(String[] args) {
		try {
			Integer num = 100/0;
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		System.out.println("hello");
	}
}

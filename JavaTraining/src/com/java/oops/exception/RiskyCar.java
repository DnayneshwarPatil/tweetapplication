package com.java.oops.exception;

import java.io.IOException;

class Car{
	void breakDown() throws IOException{
		throw new IOException("this is car broken");
	}
}
public class RiskyCar {
public static void main(String[] args) {
	try {
		Car c = new Car();
		c.breakDown();
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("exception"+ e);
	}
	System.out.println("continue...");
}
}

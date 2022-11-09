package com.java.oops.exception;

public class Eligibility {
public static void Eligible (Integer Ex) {
	if(Ex< 10) {
		throw new ArithmeticException("this not eligible for this position");
		
	}else {
		System.out.println("Eligible for this position");
	}
}
public static void main(String[] args) {
	Eligible(9);
}
}

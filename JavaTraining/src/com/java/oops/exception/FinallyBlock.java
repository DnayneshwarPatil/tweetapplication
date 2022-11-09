package com.java.oops.exception;


public class FinallyBlock {
	public static void main(String[] args) {
		
		try {
			
			System.out.println("inside try block");
			
			Integer num = 100/0;
			System.out.println(num);
			
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		finally {
			System.out.println("Always Execute if excection occur or not");
		}
		System.out.println("continue");
	}

}

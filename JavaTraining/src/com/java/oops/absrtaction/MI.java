package com.java.oops.absrtaction;

public class MI extends IPL{

	@Override
	void play() {
		// TODO Auto-generated method stub
		System.out.println("Mumbai Indians");
	}
	
	public static void main(String[] args) {
		  MI mi = new MI();
		  mi.play();
	}
}

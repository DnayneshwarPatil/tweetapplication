package com.java.oops.encapsulation;

public class Bajaj {
	public static void main(String[] args) {
		
		Bike pulsar = new Bike();
		
		pulsar.setName("Palsur 150");
		pulsar.setCc(150);
		pulsar.setColor("red");
		pulsar.setPrice(130000);
		System.out.println(pulsar.getName()+" "+pulsar.getCc()+" "+pulsar.getColor()+" "+pulsar.getPrice());
	}

}

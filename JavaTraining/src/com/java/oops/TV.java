package com.java.oops;

public class TV {

	String brand;
	String modelName;
	Integer modelNumber;
	String  color;
	Integer screenSize;
	Integer price;
	
	void insertData(String b, String mNa, Integer mNu, String c, Integer ss, Integer p) {
		
		brand =b;
		modelName= mNa;
		modelNumber = mNu;
		color = c;
		screenSize = ss;
		price = p;
		
	}
	
	void displayTv() {
		System.out.println(brand+"" +modelName);
	}
	
	public static void main(String[] args) {
		
		TV lg = new TV();
		TV sonyLED = new TV();
		lg.brand= "Samsung";
		lg.modelName="52 inch tv";
		lg.modelNumber=2002;
		lg.color="Black";
		lg.screenSize=52;
		lg.price= 80000;
		lg.displayTv();
		
		sonyLED.insertData("sony", "70 INCH LED", 2322, "Black", 70, 87000);
		System.out.println(sonyLED.brand+" "+sonyLED.modelName);
		
		System.out.println(lg.brand+"  "+lg.modelName+" "+lg.modelNumber+" "+lg.color+" "+lg.screenSize+" "+lg.price);
	}
	
}

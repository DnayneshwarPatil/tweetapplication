package com.junit.test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedTestDemo {
	
	
	
	
	@ParameterizedTest(name="{index} -Run with arg = {0}")
	@ValueSource(ints = {1, 2, 3, 4})
	public void valueSourceTest(int arg) {
		System.out.println(arg);
	}
	
	
	// Enum Source
	
	enum TV {
		LG,Samsung,Toshiba;
	}
	
	
	@ParameterizedTest
	@EnumSource(TV.class)
 public void enumSourceTest(TV tv){
		System.out.println(tv);
		
	}
	//..Method Source
	
	private static String[] cars() {
		return new String[] {"Nissan", "TATA", "Maruti"};
	}
	
	@ParameterizedTest
	@MethodSource("cars")
	public void methodSourceTest(String cars) {
		
		System.out.println(cars);
	}
	
	//..CSV Source
	
	@ParameterizedTest
	@CsvSource({"Peter", "john", "Sushil"})
	public void csvSourceTest(String csv) {
		System.out.println(csv);
	}
}

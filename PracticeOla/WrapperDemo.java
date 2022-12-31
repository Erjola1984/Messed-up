package com.neotech.review08;

public class WrapperDemo {
	
	public static void main(String[]args) {
		
		int num1 = 6;
		
		//Integer integer1 = new Integer(num1);
		//Integer integer2 = Integer.valueOf(num1);
		
		Integer integer1 = new Integer(num1); //boxing or wrapping
		
		int num2 = integer1.intValue();//un-boxing or unwrapping
		
		//easy way from java 
		int num3 = 9;
		Integer integer3 = num3;// autoboxing, auto-wrapping, auto-converting
		int num4 = integer3; // auto- unboxing, auto- unwrapping, auto-converting
		
		//Double wrapper
		double d1 = 4.8;
		Double d2 = d1; // auto - boxing
		Double d3 = 2.2; //auto - boxing
		double d4 = d3; //auto - unboxin
		
		Boolean b1 = true; //auto - boxing
		
		Character c1 = 'G';
		
		//int -> Integer
		//byte -> Byte and so on
		
		
		
		
		
		
		
		
	}

}

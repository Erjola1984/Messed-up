package com.neotech.review07_Abstraction;

//abstract - 
public abstract class Human {
	String name;
	static String Planet;
	
	Human(String name) {
		this.name = name;
		
	}
public abstract void talk(); //we are declaring a method but 
							//we're not definning a body

public  void sleep() {
	System.out.println("Every human sleeps the same.");
	
	
	}
}

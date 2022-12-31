package com.neotech.review07_Abstraction2;

//we can only extand one and only one class
//we can implement multiple interfaces
public class Apple extends Fruit implements Peelable, Washable {
	
		
	public Apple(String color) {
		super(color);
		
	}

	@Override
	public void peel() {
		System.out.println("Peeling the apple!!");
	}

	@Override
	public void wash() {
		// TODO Auto-generated method stub
		
	}
	
	

}

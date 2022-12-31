package com.neotech.review08;

public class PhoneDemo {

	public static void main(String[] args) {
		Phone p = new Phone("Samsung", "S1234", "pass@123");
		
		
		String serial = p.getserialNumber("pass@123");
		System.out.println();
		
		p.setSerialNumber("Inva");
		p.dispalyInfo();
		
		
		
		System.out.println("---------------------");
		
		String phoneBrand = p.getBrand();
		System.out.println("The brand is " + phoneBrand);
		
		//I can't change the brand because there is no setter method
		//p.setBrand("apple");
		
		
		
		
		
		
		
		
	}

}

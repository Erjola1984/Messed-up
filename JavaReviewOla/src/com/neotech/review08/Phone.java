package com.neotech.review08;

public class Phone {
	private String serialNumber;
	private String brand;
	private String password;
	
	public Phone(String serialNumber, String brand, String password) {
		this.serialNumber = serialNumber;
		this.brand = brand;
		this.password = password;
	}
	
public void dispalyInfo() {
	System.out.println("This is a " + brand + " phone with serial number " 
+ serialNumber);
	
	//Getters and Setters are methods that allowed uss to get info
	
	
	}

	//Will give the serialNumber only if you
	//provide the correct password
public String getserialNumber(String password) {
	String result = "";
	

	if(this.password.equals(password)) {
		result = serialNumber;
	} else {
		result = "Acces Denied!!!";
	}	

	return result;
	
	}
//you will be ablemto change the serialnumber 
//only if it is 7 characters long
public void setSerialNumber(String serialNumber) {
	if(serialNumber.length() == 7) {
		this.serialNumber = serialNumber;
		
	}
}
	//Brand should be view Only

public String getBrand() {
	return this.brand;
}
	
}






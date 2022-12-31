package com.neotech.review05;

public class FamilyMember {

	String firstName;// instance variable, belongs to the instance/object
	static String lastName;//static/class variable, belongs to the class
	int age;// instance variable, belongs to the instance/object
	
	//with non static methods you can access all the variables
	void printFullName() {
		System.out.println("The full name is: " + firstName + " " + lastName);
	}
	//with static methods you can access only static  variables	
	static void printFamilyName() {
		//System.out.println("The full name is: " + firstName + " " + lastName);
		System.out.println("Family name is: " + lastName);
	}
		

	

}

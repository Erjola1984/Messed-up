package com.neotech.review06;

public class Animal {
	// You can have multiple classes in one file
	// Only one class can be public
	// The public class name should be same as file name
	
		String name;
		int legs;

		Animal(String name, int legs) {
			this.name = name;
			this.legs = legs;
		}

		public void sleep() {
			System.out.println("All animals sleep");
		}

		void displayInfo() {
			System.out.println(name + " has " + legs + " legs");
		}

	}



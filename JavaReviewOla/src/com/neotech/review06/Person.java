package com.neotech.review06;

public class Person {
	
	// instance variables
		public String name;
		int age;
		protected int weight;

		public Person() {
			System.out.println("Creating a person");
		}

		public Person(String pName, int pAge) {
			name = pName;
			age = pAge;
		}

		public Person(String pName, int pWeight, int pAge) {
			this(pName, pAge);
			weight = pWeight;
		}

		public void displayInfo() {
			System.out.println("Name: " + name + " age: " + age + " weight: " + weight);
		}

	}
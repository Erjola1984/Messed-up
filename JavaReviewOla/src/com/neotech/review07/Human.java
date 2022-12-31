package com.neotech.review07;

public class Human {
	// Every class by default extends the Object class
	
		// fields/variables
		String name; // instance variable
		static String planet; // class variable

		public Human() {
			// super();
			System.out.println("A human is being created");
		}

		public Human(String name) {
			this();
			this.name = name;
		}

		// behavior/method
		public void talk() {
			System.out.println("bla bla bla");
			
			
			
			
		}
		
}



package com.neotech.review07;

public class Albanian extends Human {
	
	Albanian() {
		//super();
	}
	
	public Albanian(String name) {
		super(name);
	}
		@Override
		public void talk() {
			System.out.println("Une flas shqip. Une quhem " + name);
		}
		
		public void albanianDance() {
			System.out.println("Dancing valle Kosavare");
		}
}

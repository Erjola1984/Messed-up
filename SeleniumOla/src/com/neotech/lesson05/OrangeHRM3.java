package com.neotech.lesson05;

import com.neotech.utils.BaseClass;

public class OrangeHRM3 extends BaseClass{
	
	public static void main (String [] args) throws InterruptedException{
		
		//this line will open the browser and navigate to the specific URl
		setUp();
		
		//here we are writing our tests
		
		
		//this line will quit the browser
		String title = driver.getTitle();
		System.out.println("title -> " + title);
		
		Thread.sleep(3000);
		
		tearDown();
	}
	
}

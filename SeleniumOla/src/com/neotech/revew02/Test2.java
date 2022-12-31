package com.neotech.revew02;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

import com.neotech.util.BaseClass;

public class Test2 extends BaseClass{
	
	 public static void main(String[] args) throws InterruptedException {
		 
		//We are preparing for our test
		setUp();
		
		
		Thread.sleep(2000);
		
		
	
		WebElement username = driver.findElement( By.id("t.username"));
		username.sendKeys("Admin");
		Thread.sleep(1000);
		
		driver.findElement(By.name("tPassword")).sendKeys("Neotech$123"));
		Thread.sleep(1000);
		
		driver.findElement(By.xpath(null)).click();
		Thread.sleep(3000);
		
		//clear up everything
		tearDown();
	}

	private static void tearDown() {
		// TODO Auto-generated method stub
		
	}

	private static void setUp() {
		// TODO Auto-generated method stub
		
	}
	 
	 

}

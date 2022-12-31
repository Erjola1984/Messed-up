package com.neotech.lesson02;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Homework1 {
	
	//Amazone page title verification:
	//Open Chrome browser
	//go to : https://www.amazone.com/"
	//verify Title "Amazone.com Online Shopping for Electronics, Apparel
	//Computers, Books, DVDs & more" is displayed
	//End the session, close the browser
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();//up-casting
		
		driver.get("https://www.amazone.fr/");
		
		String expectedTitle = "Amazone – Machines agricoles";
		String actualTitle = driver.getTitle();
		
		System.out.println("Actuall title -> " + actualTitle);
		if(expectedTitle.equalsIgnoreCase(actualTitle)) {
			System.out.println("Test passed");
		}else {
			System.out.println("Taste failed");
			
		}
		
		Thread.sleep(2000);
		 driver.quit();
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
		
		
		
		
	}

}

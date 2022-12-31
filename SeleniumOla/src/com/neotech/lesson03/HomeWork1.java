package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork1 {
	
	public final static String url = "https://demo.guru99.com/test/newtours/";
	
	public static void main(String[] args) throws InterruptedException {
		/*
		 * Open chrome browser Go to "https://demo.guru99.com/test/newtours/" 
		 * Click on Register Link 
		 * Fill out ALL required info 
		 * Click Submit 
		 * User successfully registered (Create the script using different locators)
		 */
		
		//deciding which browser we are using and directing it to the correct driver
				System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
				
				WebDriver driver = new ChromeDriver();
				
				driver.get(url);
				
				//click on the Register link
				driver.findElement(By.partialLinkText("REGIS")).click();
				
				Thread.sleep(2000);
				//doing this in two steps
//				WebElement register = driver.findElement(By.partialLinkText("REGIS"));
//				register.click();
				
				driver.findElement(By.name("firstName")).sendKeys("John");
				driver.findElement(By.name("lastName")).sendKeys("Smith");
				driver.findElement(By.name("phone")).sendKeys("333-444-5555");
				driver.findElement(By.id("userName")).sendKeys("js@gmail.com");
				
				//address info
				driver.findElement(By.name("address1")).sendKeys("123 prospect st");
				driver.findElement(By.name("city")).sendKeys("Garfield");
				driver.findElement(By.name("state")).sendKeys("NJ");
				driver.findElement(By.name("postalCode")).sendKeys("03245");
				
				//user details
				driver.findElement(By.id("email")).sendKeys("john123");
				driver.findElement(By.name("password")).sendKeys("john123");
				driver.findElement(By.name("confirmPassword")).sendKeys("john123");
				
				Thread.sleep(2000);
				
				driver.findElement(By.name("submit")).click();
			
				Thread.sleep(2000);
			
				//check if we register
				String expectedUrl = "https://demo.guru99.com/test/newtours/register.php";
				String actualUrl = driver.getCurrentUrl();
				
				if (expectedUrl.equals(actualUrl))
				{
					System.out.println("Test passed");
					
				}else {
					System.out.println("Test fail");
				}
				
				driver.quit();
				
				
	}

}

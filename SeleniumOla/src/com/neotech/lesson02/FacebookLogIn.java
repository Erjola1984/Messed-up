package com.neotech.lesson02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogIn {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//typing email into username textbox
		driver.findElement(By.id("email")).sendKeys("o.komici@gmail.com");
		
		Thread.sleep(1000);
		
		//typing the password
		driver.findElement(By.name("pass")).sendKeys("Hera2008");
		
		Thread.sleep(1000);
		
		//click on Link Forgot Passwuord
		driver.findElement(By.linkText("Forgot password?")).click();
		
		Thread.sleep(2000);
		
		driver.quit();
	}

}

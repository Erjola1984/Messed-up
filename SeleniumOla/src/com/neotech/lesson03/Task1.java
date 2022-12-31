package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public final static String url = "https://www.facebook.com/";
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		//go to this url
		driver.get(url);
		
		
		//*[@id="email"]
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("john123");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("john123");
		
		//clicking on login
		//button[@id='u_0_5_Te'] --this is generated
		//button[@name='login']
		//another option //button[@type='submit']
		//button[contains[@id,'u_0']]
		driver.findElement(By.xpath("//button[contains(@id,'u_0')]")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
	}
}
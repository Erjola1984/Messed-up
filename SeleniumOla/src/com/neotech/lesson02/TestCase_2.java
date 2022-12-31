package com.neotech.lesson02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase_2 {

	public static void main(String[] args) throws InterruptedException {
		
		//test case 2; open chrome browser
		//go to https://demo.guru99.com/test/newtours/
		//click on register link
		//fillout just
		//first and last name; phone; email/
		//click submit
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//doing it in one step
		//driver.findElement(By.partialLinkText("Register")).click();
		
		//doing it in 2 steps.1st step returns the web element
		WebElement element = driver.findElement(By.linkText("REGISTER"));
		element.click();
		
		driver.findElement(By.name("firstName")).sendKeys("Erjola");
	  ((WebElement) driver.findElements(By.name("lastName"))).sendKeys("Komici");
	  driver.findElement(By.name("phone")).sendKeys("12345");
		driver.findElement(By.id("username")).sendKeys("o.komici@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.name("submit")).click();
		
		Thread.sleep(2000);
		driver.quit();

	}

}

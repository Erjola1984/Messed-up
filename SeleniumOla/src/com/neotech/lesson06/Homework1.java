package com.neotech.lesson06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;
import com.neotech.utils.ConfigsReader;

public class Homework1 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * HRM app login=open browser
		 * go to : // hrm.neotechacademy.com/
		 * enter valid username and password
		 * click on login button
		 * than verify "span with id account-name" has the text
		 * "Jacqueline White"
		 * quit the browser
		 * 
		 */
		
		setUp();
	//1.declaring driver location
	//2.Initialize driver
	//3.Go to the url.
		
		//How do I get mu credentials?
		String username = ConfigsReader.getProperty("username");
		String password = ConfigsReader.getProperty("password");
		
		
		
		WebElement usernameBox = driver.findElement(By.id("txtUsername"));
		WebElement passwordBox = driver.findElement(By.id("txtPassword"));
		WebElement loginBtn = driver.findElement(By.cssSelector("button"));
		
		//send credentials to boxes
		
		passwordBox.sendKeys(username);
		usernameBox.sendKeys("username");
		loginBtn.click();
		
		Thread.sleep(3000);
		
		String expected = "Jacqueline White";
		String actual = driver.findElement(By.id("account-name")).getText();
		
		
		if(expected.equals(actual))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		Thread.sleep(3000);
		
		
	tearDown();
	
		
	}

}

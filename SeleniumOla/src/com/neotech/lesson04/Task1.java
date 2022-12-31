package com.neotech.lesson04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	
	public static String url = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
	public static String username = "Tester";
	public static String password = "test";
	
	public static void main(String[] args) {
		/*
		 * "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
		*Enter valid username and password
		*Click on login button
		*Then verify "Web Orders" is displayed and also username is displayed right top corner
		 */
		
		System.setProperty("webdriver. chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		//Send username and passoword
		
		driver.findElement(By.id("ctl00_MainContent username")).sendKeys(username);
		driver.findElement(By.id("id=\"ctl00_MainContent password")).sendKeys(password);
		
		//log in
		
		driver.findElement(By.id("ctl00$MainContent$login_button")).submit();
		
		//check if logo is displayed
		
		WebElement logo = driver.findElement(By.xpath("// hi[text()='Web Orders']"));
		if(logo.isDisplayed())
		{
			System.out.println("The logo with text " + logo.getText() + " is displayed");
		}
		else
		{
			System.out.println("The logo is not dispalyed!!");
		}
		
		//check if username is dispalyed
		//locator---. //div[contains(text(), 'Tester')]
		
		
		driver.quit();

	}

}

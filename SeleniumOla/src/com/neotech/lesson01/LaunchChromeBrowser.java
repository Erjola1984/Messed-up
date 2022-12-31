package com.neotech.lesson01;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) {

		
			//C:\Users\sabah\eclipse-workspace\Selenium4\drivers -- Full Path
			// drivers/chromedriver.exe     ---> Relative Path
			
			//for mac: drivers/chromedriver
			
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver"); //which driver, and where is it
			
			
			//creating a new object of ChromeDriver
			//upcasting it to WebDriver object
			WebDriver driver =  new ChromeDriver(); //opened the browser
			
			
			driver.get("https://www.neotechacademy.com/");
			
	}
}
			
			
			
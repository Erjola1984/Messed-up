package com.neotech.lesson02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Homework2 {
/*Open Page on Firefox Browser
 * open firefox browser
 * Navigate to "https://www.redfin.com/"
 * Verify that you have navigated to (https://www.redfin.com/)
 * End the ssesion , close the broweser
 */
	
	public static void main(String[] args) throws InterruptedException {
		
		System.getProperty("webdriver.geckodriver.driver", "drivers/geckodriver");
		
		//1.open firefox
		WebDriver driver = new FirefoxDriver();
		
		String url = "https://www.redfin.com/";
		
		//2.Navigate to https://www.redfin.com/
		driver.get(url);
		
		
		Thread.sleep(2000);
		
		// getCurrentUrl() and returns the url of the page
 		String actualURL = driver.getCurrentUrl();
			
 		if(url.equals(actualURL)) {
 			System.out.println("Url is as expected -> " + actualURL);
 			
 		}else {
 			System.out.println(actualURL + " <- is Not as expected!!!-> " + url);
 		}
		driver.quit();
		
		
		
		
		
		
		
		
	}

}

package com.neotech.revew02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.util.BaseClass;

public class HarryPotterSearch extends BaseClass {
	
	/*
	 * // Go to https://amazon.com
// select books from the search dropdown
// type Harry potter
// and click on Search
// check "Kindle Unlimited Eligible" checkbox on the left
	 */
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		Thread.sleep(2000);
		
		WebElement searchDDElement = driver.findElement(By.id(null));
		Select selectDD = new Select(searchDDElement);
		
		List<WebElement> optionList= selectDD.getOptions();
		for(WebElement option : optionList)
		{
			System.out.println(option.getText());
		}
		
		//3 different ways to select one drop down options
		
		//selectDD.selectByIndex(4);
		//selectDD.selectByValue(null);
		selectDD.selectByVisibleText("Books");
		
		
		
		
		
		tearDown();
		
		
		
		
		
	}

	private static void tearDown() {
		// TODO Auto-generated method stub
		
	}

	private static void setUp() {
		// TODO Auto-generated method stub
		
	}
	
	

}

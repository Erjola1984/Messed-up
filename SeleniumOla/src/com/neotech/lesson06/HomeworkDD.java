package com.neotech.lesson06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

public class HomeworkDD  extends BaseClass{

	
		/*
		 *  Amazon Department List Verification
        Open chrome browser
        Go to "http://amazon.com/"
        Verify how many department options available.
        Print each department 
        Select Computers
        Quit browser

		 */
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		//http://amazon.com/
		
		WebElement department = driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]/span"));
		
		Select departmentSel = new Select(department);
		
		List<WebElement> options = departmentSel.getOptions();
		int totalOptions = options.size();
		System.out.println("DepartmentS' options in website are: " + options.size());
		System.out.println("Departments' name are --> ");
		
		for(WebElement wl : options)
		{
			System.out.println(wl.getText());
			
			if(wl.getText().equals("Computers")) {
				wl.click();
				Thread.sleep(2000);
			}
				
		}
		tearDown();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		tearDown();
	
	
	}

}

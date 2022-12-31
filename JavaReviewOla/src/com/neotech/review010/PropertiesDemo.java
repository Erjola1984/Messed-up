package com.neotech.review010;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		
		String filePath = projectPath + "/Extra/demo.properties";
		System.out.println(filePath);

		FileInputStream fileIS = new FileInputStream(filePath);
		
		Properties proper = new Properties();
		
		proper.load(fileIS);// to read
		
		System.out.println(proper);
		
		//1rst way
		
		Object firstName = proper.get("FirstName");
		System.out.println(firstName);
		
		//2nd way, the correct one
		String school = proper.getProperty("School");
		System.out.println(school);
			
		String age = proper.getProperty("Age");
		System.out.println(age);
		//Add more key -> value pairs
		proper.setProperty("SSN", "647-21-9034");
		System.out.println(proper);
		
		//Re-assing the age
		proper.setProperty("Age", "60");
		System.out.println(proper);
		
		//now lets save in a new file
		
		//the path to a new file
		
		String newPath = System.getProperty("user.dir") + "/Extra/NewFile.txt";
		
		FileOutputStream fileOS = new FileOutputStream(newPath);
		
		proper.store(fileOS, "Dardan is waiting for us");
		
		
		
		
		
	}

}

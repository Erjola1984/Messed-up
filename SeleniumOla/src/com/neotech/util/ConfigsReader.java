package com.neotech.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigsReader {
	
public static Properties prop;
	/**
	 * This method will read the Properties file
	 * @param filePath
	 * @throws FileNotFoundException
	 */
	public static void readProeprties(String filePath) throws FileNotFoundException {
		
		FileInputStream fileIS = new FileInputStream(filePath);
		prop = new Properties();
		try {
			prop.load(fileIS);
		} catch (IOException e) {
			System.out.println("I couldn't read the file!!!");;
		}
		
	}
	
	/**
	 * This method will return the value for a specific key
	 * @param Key
	 * @return
	 */


public static String getProperty(String Key) {
	
	return prop.getProperty("url");
	
}

}






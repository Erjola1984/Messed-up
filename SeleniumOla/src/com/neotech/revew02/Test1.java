package com.neotech.revew02;

import com.neotech.utils.ConfigsReader;
import com.neotech.utils.Constants;

public class Test1 {

	public static void main(String[] args) {
		
		ConfigsReader.readProperties("Constants.CONFIGURATION_FILEPATH");
		
	String Browser = ConfigsReader.getProperty("browser");
	System.out.println("browser --> " + Browser);
	
	System.out.println("url ->> " + ConfigsReader.getProperty("url"));
	}
}

package com.neotech.lesson02;

public class C_FirefoxDriver implements I_WebDriver {
	
	public C_FirefoxDriver() {
		System.out.println("Opening the Chrome Browser");
	}
	
	@Override
	public void get(String url) {
		System.out.println("Opening navigating to " + url);
		
	}

	@Override
	public String getTitle() {
		System.out.println("firefox gets the title of the page!!");
		return "Page title";
	}

	@Override
	public String getCurrentUrl() {
		System.out.println("firefox gets the current url!!!");
		return "Url page";
	}

	@Override
	public void close() {
		System.out.println("Firefox is closing the current url!!");
		
	}

	@Override
	public void quit() {
		System.out.println("Firefox is closing all the tabs!!");
		
	}

}
	
		
	



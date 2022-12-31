package com.neotech.review02;

public class ContinueDemo {

	public static void main(String[] args) {
		
		
	// Task - 5 minutes
	// I want to celebrate my son's birthdays from 11 to 20 (Use for loop)
	// but not 13th birthday, because we are scared
	// Let's use for loop
		
		for (int a =11; a <=20; a++) {
			
		
		if (a == 13) {
			continue;   //can do it without continue (!13)
		}
		System.out.println("Happy birthday! You are " + a + "year old");
		
		}	
       System.out.println("----Same thing with While loop-----");
       
       
       int a2 = 11;
       
       while (a2<20) {
    	   
    	   a2++;
    	   
    	   if (a2 == 13) {
    		   System.err.println("No celebration, we're scare");
    		   continue;
    	   }
    System.out.println("Happy birthday! You are " + a2 + "year old");
    
    
       }
	}
}
    
    
    
    
    
    
    
    
    
    
    
    
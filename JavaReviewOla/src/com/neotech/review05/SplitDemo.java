package com.neotech.review05;

public class SplitDemo {

	public static void main(String[] args) {
		String longStr = "I am very happy today, because today is monday";
		String[] strArray = longStr.split("today");
		System.out.println(strArray.length);
		
		System.out.println("+++++++Iterating using Enhanced for Loop++++++");
		
		for(String element : strArray);
		
		System.out.println("+++++++Iterating using Normal for Loop++++++");
	}
		
}
			
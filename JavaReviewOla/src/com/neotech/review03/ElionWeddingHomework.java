package com.neotech.review03;

public class ElionWeddingHomework {

	public static void main(String[] args) {
		//print the sum of the numbers in an array
		//using normal for loop
		//enhanced for loop
		
		
		int []arr = { 2, 12, 22, 32};
		
		//1rst method: using normal for loop:
		int sumarr = 0;
		for(int a = 0; a < arr.length; a++) {
			
			sumarr += arr[a];
			
		}
		System.out.println("Sum of array is: " + sumarr);
		System.out.println("-----------------------");
		//2nd method: enhanced for loop
		
		int [] arra = {2, 12, 22, 32};
		
		int sumarra = 0;
		for(int b : arra) {
			 sumarra += b;
		}
		System.out.print("Sum of array is: " + sumarra);
 	}
	          
}

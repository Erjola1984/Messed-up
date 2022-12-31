package com.neotech.review02;

public class Task2 {

	public static void main(String[] args) {
		
		//Add Even numbers
		// Also add Odd numbers
		// Also add All numbers
		// Between 1 && 50
		// Using for loop
		
	
		int oddTotal= 0;
		int evenTotal= 0;
		int total= 0;
		
		for (int i = 1; i <=50; i++) {
			
			if (i% 2 == 0) { // even numbers
			evenTotal += i;
		}else { //0dd
			oddTotal += i;
		}
			
			total+=i;
			
		}
		System.out.println("The sum of even numbers--> evenTotal");
		System.out.println("The sum of odd numbers--> oddTotal");
		System.out.println("The sum of all numbers--> (evenTotal + oddTotal");
		
		
		
		System.out.println("===Smarter Way=====");
		
		for (int i= 1; i <= 50; i++) {
			
			if(i% 2 == 0) {
				evenTotal +=1;
			}else {
				oddTotal +=i;
			}
			
			System.out.println("The sum of even numbers--> evenTotal");
			System.out.println("The sum of odd numbers--> oddTotal");
			System.out.println("The sum of all numbers--> (evenTotal + oddTotal");
			
		}
		
		
		
		
		
		
	System.out.println("===========================");	
		int even = 0;
		int odd = 0;
		
		for (int i =1; i<=50; i++) {
			if (i % 2 == 0) {
				even += i;
			}else if (i % 2 == 1) {
			
				odd += i;
			}	
		}
			int sum = even + odd;
			System.out.println("Even numbers: " + even);
			System.out.println("Odd numbers: " + odd);
			System.out.println("Total: " + total);
			}
		
		
		}
		
	



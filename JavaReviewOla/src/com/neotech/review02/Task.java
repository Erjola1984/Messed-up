package com.neotech.review02;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		//ask the user te enter a positive number and add it to the total
		//he should enter -1 to Stop.-1 will not be added to the total
		
		
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		int num = 0;
		
	System.out.println("Please enter a positive nume! To stop enter -1");
	num = scan.nextInt();
		
		while (num != -1) {
			sum += num;
			
	System.out.println("Please enter a positive nume! To stop enter -1");
	num = scan.nextInt();
	
		}
		
		System.out.println("Sum = " + sum);
		
		
		
		
		do {
			System.out.println("Please enter a positive number! To Stop enter -1 ");
			num = scan.nextInt();
			
			if (num != -1) {
			
			sum += num;
			}
		}while (num !=-1);
		
		System.out.println("Sum = " + sum);	
	}
		
}	
		

		
		
		
	
		

		
		
		



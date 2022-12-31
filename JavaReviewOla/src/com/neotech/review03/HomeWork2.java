package com.neotech.review03;

public class HomeWork2 {

	public static void main(String[] args) {
		// Write a java program to find the second largest number in the array.
		//maximum and minimum number in the array.
		
		int []num = {-15, -10, -5, 0, 5, 10, 15};
		
		int largest = num[0];
		
		for (int i = 0; i < num.length; i++ )
		{
			if (largest < num[i])
			{
				largest = num[i];
			}
			System.out.println();
		}
		System.out.println("The largest num is: " + largest);
		
		
		System.out.println("+++++++++++++++++");

int []number = {-15, -10, -5, 0, 5, 10, 15};
		
		int smallest = num[0];
		
		for (int i = 0; i < number.length; i++ )
		
		{
			if (smallest > num[i])
			{
				smallest = num[i];
			}
			System.out.println();
		}
		System.out.println("The smallest num is: " + smallest);
		

		
		System.out.println("+++++++++++++++++++++++++++++++++++++++");
		
int [] hena= {-15, -10, -5, 0, 5, 10, 15};
		
		int secondG = num[0];
		
		for (int b = 0; b < hena.length; b++ )
		
		{
			if (secondG < hena[b])
			{
				secondG = hena[b];
			}
			System.out.println();
		}
		System.out.println("The secondG number is: " + secondG);
		

		
	}
	
	
	
}
			

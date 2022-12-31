package com.neotech.review03;

import java.util.Scanner;

public class ScannerArray {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in); 
		 
		 System.out.println("How many names do you want to store in the array");
		 int nam = input.nextInt();
		 
		 System.out.println("Please enter a name");
			int name = input.nextInt();
			
		 
		 String[] names = { "Hene", "Marte", "Merkure", "Enjte" };
				 
			for(int b = 0; b < names.length; b++);	{
			
			
			System.out.println("Let's print the names from the array");
			for (int b = 0; b < names.length; b++) {
				System.out.print(names[b] + " ");
			}
				
				
			}
				 
				 
				 
				 
				 
		 
		 
	}

	}



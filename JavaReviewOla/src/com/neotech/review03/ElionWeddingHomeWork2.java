package com.neotech.review03;

import java.util.Scanner;

public class ElionWeddingHomeWork2 {

	public static void main(String[] args) {
		
		//Ask the user: How many rows do you want in the array?
		//Ask the user: How many columns do you want in the array?
		//Create the array String [] [] names
		//Fill the array
		// Print the array
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("How many rows do you want in the array?");
		int rows = input.nextInt();
		System.out.println("How many columns do you want in the array");
		int col = input.nextInt();
		
		String [][] names = new String [rows][col];
		for(int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				System.out.println("Please enter a name");
				names[i][j]= input.next();
				
			}
				
		}
		for(int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				System.out.println(names[i][j] + " ");
			}
			
			System.out.println();
		}
			
		   //Enhanced loop
		
		for(String []row : names) {
			for (String name : row) {
				
				System.out.print(name + " ");
			}
			System.out.println();	
		}
		
		
		
}

	}


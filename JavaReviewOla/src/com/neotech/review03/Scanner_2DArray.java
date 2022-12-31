package com.neotech.review03;

import java.util.Scanner;

public class Scanner_2DArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Haw many rows do you want in the array?");
		int rows = input.nextInt();

		System.out.println("Haw many cols do you want in the array?");
		int cols = input.nextInt();
		
		String [][] names = {
				
				{"Ana",    "Boiken",  "Josana"},
				{"Ola",    "Hera",    "Dajna"},
				{"Kalter", "Helia",   "Olsi"},
			
		};

		
		for(int row = 0; row < names.length; row++) {
			
			for (int col = 0; col < names[row].length; col++) {
				System.out.print(names[row][col] + " ");
			}
			System.out.println();
		}
		
}
	}



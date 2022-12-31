
package com.neotech.review03;

public class Max2DArray {

	public static void main(String[] args) {
		
		int[][]b = {
				{-2, 3, 5},
				{2, 4, 7},
				{8, 1, -9},
				{3, 5, 1}
		};
		
		int biggest = b [0][0]; //no start with 0,because may have (-) numbers in array
		for(int row = 0; row < b.length; row++) {
			for(int col = 0; col < b[row].length; col++) {
				int element = b[row][col];
				if(element > biggest);
				//i found a bigger element (stands for a number )
				//i have to update the biggest
				biggest = element;
			}
			System.out.println("The biggest number is : " + biggest);
		}
		
System.out.println("+++++enhaced for loop++++++++++++++");

		int max = b[0][0];
		for (int []row : b) {
			
				
			}
		}
		
	}

}

package com.neotech.review03;

public class ThreeD_Array {

	public static void main(String[] args) {
		int[][] nums = {
				{3, 6},
				{5, 2, 9, 7},
				{8}
		};
		System.out.println(nums[1][3]);
		System.out.println(nums[2][0]);
	//System.out.println(nums[0][2]);//run time error, outside of the array
		
		System.out.println("The number of rows is-> " + nums.length);
		System.out.println("The number or row with index 1 is -> " + nums[1].length);
		System.out.println("The number or row with index 0 is -> " + nums[0].length);
		
		System.out.println("-------------------");
		
		for (int row = 0; row < nums.length; row++) {
			//nums[row].length will give me the length of that specific row
			
			for(int col = 0; col < nums[row].length; col++) {
				System.out.print(nums[row][col] + " ");
			}
			System.out.println();
			
			
		}
		
		System.out.println("____enhanced for loop---------");
		
		//nested or enhanced--> advanced for loop
		for(int[] row : nums) {
			//i will itinerate the row 1D array with an enhanced for loop
			for (int element : row) {
			System.out.print(element + " ");	
		}
		System.out.println();
	}
	}
}

package com.neotech.review03;

public class ArrayIntro {

	public static void main(String[] args) {
		
		int a = 6;
		int b = 4;
		int c = 9;
		int d = 2;
		
		int sum = a + b + c + d;
		
		System.out.println("Sum is --> " + sum);
		
		// 1st serious way
		
		int [] arr = new int[4];
		
		arr[0] = 6;
		arr[2] = 9;
		arr[3] = 2;
		arr[1] = 4;
		
		int sumArr = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sumArr += arr[i];

		System.out.println("Sum of the array is: " + sumArr);
		
		//2nd serious way:
		int [] arr2 = {6, 4, 9, 2};
		
		int sumArr2 = 0;
		for(int num : arr2) {  //enhanced for loop
		sumArr2 += num;
		
		}
		
		System.out.println("Sum of the array is: " + sumArr);
		System.out.println("==============================");
		
		String[]animals = {"dog", "cat", "pig", "horse", "mouse"};
		
		for(int k = 0; k < animals.length; k++) {
			
			System.out.print(animals[k] + " ");
		}	
		System.out.println();
		 for(String element : animals) {
			 System.out.print(element + " ");
		 
		 }
		System.out.println();
		System.out.println("----------------------");
		System.out.println("Let's print the animals in reverse order");
		
		for(int e = animals.length-1; e >= 0; e--) {
			System.out.print(animals[e] + " " );
		}
		System.out.println();
		System.out.println("Let's print the animals in enhanced for loop");
		//we can not do it
		
		
		
		}
	}
		
		
		

		}
	

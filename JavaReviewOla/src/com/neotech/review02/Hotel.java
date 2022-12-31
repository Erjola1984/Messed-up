package com.neotech.review02;

public class Hotel {
//	In my hotel I have 4 flors
//	In each floor i have 6 rooms
//	Room nr in floor 1 are 1.1;1.2;1.3;1.4;1.5;1.6
//	Room nr in floor 2 ar 2.1;2.2;2.3;2.4;2.5;2.6
//	I want to print all room numbers

	public static void main(String[] args) {

		for(int floor = 1; floor <= 4; floor++) {
			System.out.println("Floor -> "  + floor);
			
			for(int room = 1; room <= 6; room++) {
				System.out.print(floor + "." + room + " ");
			}
			System.out.println(); //bring to the next line
		}
		
		
			
		
		
		
	}

}


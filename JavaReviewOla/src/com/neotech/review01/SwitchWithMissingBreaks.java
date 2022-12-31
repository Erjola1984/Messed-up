package com.neotech.review01;

public class SwitchWithMissingBreaks {

	public static void main(String[] args) {

		int number = 4;

		switch (number) {
		case 2:
			System.out.println("2");
		case 3:
			System.out.println("3");
			break;
		case 4:
			System.out.println("4");
		case 5:
			System.out.println("5");
			break;
		case 6:
			System.out.println("6");
		}

		// Limitations of switch
		// 1. You cannot have duplicate cases
		// 2. You should be careful with breaks

		// 3. You cannot use logical operators like in if-else
		if (number == 3 || number == 4) {

		}

		// 4. You cannot use double
		double d = 4.5;
		if (d == 4.0) {
			
		}
		
	}

}

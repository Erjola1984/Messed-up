package com.neotech.review01;

import java.util.Scanner;

public class CalculatorSwitch {

	public static void main(String[] args) {

		// Mac -> command + shift + o --> Will import the Scanner class
		// Windows -> ctrl + shift + o --> Will import the Scanner class

		Scanner kenan = new Scanner(System.in);

		System.out.println("Please enter the first number:");
		double d1 = kenan.nextDouble();

		System.out.println("Please enter the second number:");
		double d2 = kenan.nextDouble();

		System.out.println("Please enter the operator (+,-,*,/)");
		String operator = kenan.next();

		double result = 0;

		switch (operator) {
		case "+":
			result = d1 + d2;
			break;
		case "-":
			result = d1 - d2;
			break;
		case "*":
			result = d1 * d2;
			break;
		case "/":
			result = d1 / d2;
			break;
		default:
			System.out.println("Invalid operator");
			break;
		}

		if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) {
			System.out.println("The result is -> " + result);
		}
		
	}

}

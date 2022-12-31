package com.neotech.review01;

public class TypeCasting {

	public static void main(String[] args) {
		// byte < short < int < long < float < double

		int intNumber = 50;

		// widening/implicit casting/automatically
		double doubleNumber = intNumber;

		System.out.println("intNumber -> " + intNumber);
		System.out.println("doubleNumber -> " + doubleNumber);

		// narrowing/explicit casting/manually
		byte byteNumber = (byte) intNumber; // It is risky, you MAY loose
		System.out.println("byteNumber -> " + byteNumber);

		// re-assign
		intNumber = 870;

		// in this case we WILL loose data
		byte b2 = (byte) intNumber;
		System.out.println("b2 -> " + b2);

		// widening/implicit casting/automatically
		byte b3 = 90;
		int i3 = b3;
		System.out.println("i3 -> " + i3);

	}

}

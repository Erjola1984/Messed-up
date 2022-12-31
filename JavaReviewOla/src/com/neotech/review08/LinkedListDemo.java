package com.neotech.review08;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		List<String> asia = new LinkedList<>();//up-casting
		asia.add("Japan");
		asia.add("Taiwan");
		asia.add("Turkey");
		asia.add(0, "Cambodia");
		asia.add("Japan");
		
		System.out.println(asia);
		//iterate the asia list and remove duplicate
		//hint: you can create a new list add the el one by one
		//but first check if the new list contains the country

	}

}

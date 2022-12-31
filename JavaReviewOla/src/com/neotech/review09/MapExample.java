package com.neotech.review09;

import java.util.*;

public class MapExample {
	//Map is an interface, no object but implementation
	//HashMap | LinkedHashMap | TreeMap | HashTable
	
	public static void main(String[] args) {
		Map<Integer, String> phoneBook = new HashMap<>();
		
		phoneBook.put(123456789, "John Smith");
		phoneBook.put(234567890, "Julia Roberts");
		phoneBook.put(345712345, "Donald trump");
		phoneBook.put(237485950, "Obama");
		phoneBook.put(77777777, "Cristiano");
		
		phoneBook.replace(234567890, "Julia Roberts");
		
		System.out.println(phoneBook);
		
		//another way to replace
		
		phoneBook.put(123456789, "Sedat");
		
		System.out.println(phoneBook);
		
		//Map is one directional, from key to value
		
		String name = phoneBook.get(234567890);
		
		System.out.println(name + "is calling....");
		
		name = phoneBook.get(666);
		System.out.println(name + "is calling....");
		
		boolean containsK = phoneBook.containsKey(666);
		System.out.println("666 is in my phone book " + containsK);
		
		boolean containsV = phoneBook.containsValue("Obama");
		System.out.println("Obama  is in my phone book " + containsV);
		
		phoneBook.remove(456789012);
		System.out.println(phoneBook);
		
		System.out.println("The size of my phoneBook is -> " + phoneBook.size());
		
		System.out.println("--------------------phonebook.keySet----------------");
		
		//we can not iterate a Map
		//let's get all the keys and store them into a set
		
		Set<Integer> numbers = phoneBook.keySet();
		System.out.println(numbers);
		
		Iterator<Integer> itNumbers = numbers.iterator();
		
		while(itNumbers.hasNext()) {
		Integer number = itNumbers.next();
		
		//find the name/value by using the number/key
		String personName = phoneBook.get(number);
		System.out.println(number + " -> " + personName);	
		}
		
		System.out.println("-----------------phonebook.values()----------------");
		
		//task
		//get the values and iterate them using enhanced for loop
		//try to get the number by using the name
		
		//let's get all the values and store them in a Collection
		Collection <String> v = phoneBook.values();
		
		for(String values : v) {
			System.out.println(values);
			
		}
		
		System.out.println();
		
		//getting the number  by using the name
		
		
		
		
		
		
		
		
		
		
		
}
}
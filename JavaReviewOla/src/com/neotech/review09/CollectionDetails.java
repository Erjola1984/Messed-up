package com.neotech.review09;

import java.util.*;

public class CollectionDetails {

	public static void main(String[] args) {
		// 1.List preserves insertion order, BUT SET does Not
		//2/List contains duplicates, BUT SET contains UNIQUE objects.
		
		//collection Framework = All interfaces and implementation
		//collection Interface = Only one interface
		//collection = It is a helper/utilitu class
		
		Set<Integer> numbers = new HashSet<>();

		numbers.add(63);
		numbers.add(98);
		numbers.add(54);
		numbers.add(40);
		numbers.add(95);
		numbers.add(43);
		
		System.out.println(numbers);
		
		Collections.min(numbers);
		
		Integer min = Collections.min(numbers);
		System.out.println("min -> " + min);
		
		Integer max = Collections.max(numbers);
		System.out.println("max -> " + max);
		
		//set can not be sorted
		//Collections.sort(numbers); //set is order in specific order and in
									//collection there is not and index
		//LIST can be sorted
		List<Integer>numberList = new ArrayList<>(numbers);
		System.out.println("List before sorting -> " + numberList);
		Collections.sort(numberList);
		System.out.println("List after sorting -> + numberList");
		
		System.out.println("---------------------------");
		
		List<String> students = new LinkedList<>();
		students.add("Betim");
		students.add("Shirina");
		students.add("Dardan");
		students.add("Emine");
		students.add("Murad");
		
		System.out.println(students);
		
		String first = Collections.min(students);
		System.out.println("first -> " + first);
		
		System.out.println("last -> " + Collections.max(students));
		
		System.out.println(students);
		
		Collections.sort(students);
		System.out.println(students);
		
		System.out.println("===================================");
		
		
		int[]arr = { 9, 2, 8, 5, 1 };
		
		Arrays.sort(arr);
		
		for(int n : arr)
			System.out.print(n + " ");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

package com.neotech.review08;

import java.util.ArrayList;
import java.util.Iterator;

public class WrapperList {

	public static void main(String[] args) {
		//ArrayList can only store objects/classes
		//ArrayList<int> nums = ArrayList<>();
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		boolean isEmpty = numbers.isEmpty();
		System.out.println("Is it empty? " + isEmpty);
		System.out.println("The size is -> " + numbers.size());
		
		numbers.add(new Integer(5));
		numbers.add(6);//auto boxing in a shorter way
		numbers.add(8);
		numbers.add(1);
		
		System.out.println("The size is -> " + numbers.size());
		
		//list is interface
		//ArrayList and LinkedList are classes implementing the list Interface
		
		boolean contains = numbers.contains(8);
		System.out.println("Does the list contains the number 8? " + contains);
		
		System.out.println(numbers);
		
		numbers.remove(1);// remove by index
		numbers.remove(new Integer(1)); //remove by objects
		System.out.println(numbers);
		
		System.out.println("----1rst way normal for loop-------");
		
		for(int i = 0; i < numbers.size(); i++) {
			int element = numbers.get(i); //auto - unboxing
			System.out.println(element);
		}
		
		System.out.println("----2nd way normal enhanced for loop-------");
		
		for(Integer element : numbers) {
			System.out.println(element);
		}
		
		System.out.println("----3rd way iterator-------");
		
		Iterator<Integer> it = numbers.iterator();// get the iterator from the list		
		
		 //there are 3 methods in iterator class
		
		//it.hasNext();//this method will return if there us a next element or not
		//it.next();// this method will return the next element from the list
		//it.remove();// this method will remove the current element from the list.
		
		//System.out.println(it.next());//move to the next element and get it
		//System.out.println(it.next());//
	   //System.out.println(it.next());
		//System.out.println(it.next());//run - time error
		
		
	System.out.println("--------- task--------------------");	
		//task
		
		
		while(it.hasNext())
		{
			int a = it.next();
			System.out.print(a + " ");
		}
		
		
	}

}

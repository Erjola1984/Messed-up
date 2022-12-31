package com.neotech.review08;

import java.util.ArrayList;
import java.util.*;//import all the classes under java.util package

public class CollectionIntro {

	public static void main(String[] args) {
		
		// List is an interface
		//List<String> names = new List<>();
		
		List<String> africa = new ArrayList<String>();//up-casting
		africa.add("Kenya");
		africa.add("Morocco");
		africa.add("Chad");
		africa.add(1, "Ghana");
		
		System.out.println(africa);
		
		//2nd way of filling an arrayList
		List<String> africa2 = new ArrayList<>();//creating an empty list
		africa2.addAll(africa);
		System.out.println(africa2);
		
		//3rd way of filling an arrayList
		
		List<String> africa3 = new ArrayList<>(africa);//creating a filled list
		System.out.println(africa3);
		
		System.out.println("---------------------------------------------------");
	
		
		
		//there are 3 ways to iterate a list
		
		for(int i = 0; i < africa.size(); i++) {
			String country = africa.get(i);
			System.out.print(country + " ");
			
		}
		
		System.out.println();
		
		System.out.println("+++++++++++++++++++++");
		//enhanced for loop
	
		for(String country : africa) {
			System.out.print(country + " ");
		}
		
		System.out.println("---------------------");
		//using iterator
		
		Iterator<String> it = africa.iterator();
		
		while(it.hasNext()) {
			String country = it.next();
			System.out.println(country + " ");
		}
		
		System.out.println();
		
		
		System.out.println("_________________________");
		
		ArrayList europe = new ArrayList();//non generic
		europe.add("Italy");
		europe.add(4);
		europe.add(4.5);
		europe.add(true);
		
		for(Object element : europe) {
			System.out.println(element);
		}
		
		
	}

}

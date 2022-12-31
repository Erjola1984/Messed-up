package practiceLesson10;

import java.util.*;

public class Homework29 {

	public static void main(String[] args) {
		/*
		 * create a set collections in which you need to add name of the countries
		 * All the objects must be sorted in alphabetic order. Use 2 different ways to retrieve all el.
		 */
		
		Set<String> countries = new TreeSet<>();
		countries.add("Albania");
		countries.add("Italy");
		countries.add("France");
		countries.add("Germany");
		
		System.out.println(countries);
		
		for(String country : countries)
		{
			System.out.println(country);
		}
		Iterator<String> iter = countries.iterator();
		
		while(iter.hasNext())
		{
			String country = iter.next();
			System.out.println();
		}
		
		/*
		 * create a set of cities in which you want to make sure that 
		 * insertion order is mainened.Using iterator remove any city that starts with "a"
		 * 
		 */
		
		
		
Set<String> cities = new LinkedHashSet<>();
		
		cities.add("Ankara");
		cities.add("Albany");
		cities.add("Izmir");
		cities.add("Tirana");
		cities.add("Kiev");
		cities.add("Elbasan");
		cities.add("Quito");
		
		System.out.println("Before removing: " + cities);
		
		Iterator<String> it = cities.iterator();
		
		while(it.hasNext())
		{
			//two ways: 
			//1st way:
			/*
			 * String city = it.next(); if (city.toUpperCase().startsWith("A")) {
			 * it.remove(); }
			 */		
			
			//2nd way: 
			if (it.next().toUpperCase().startsWith("A"))
			{
				it.remove();
			}
			
		}
		System.out.println("After removing: " + cities);
		
		
	}

}
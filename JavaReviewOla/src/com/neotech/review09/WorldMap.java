package com.neotech.review09;

import java.util.*;

public class WorldMap {

	public static void main(String[] args) {
		Map<String, String> europe = new TreeMap<>();//ordered by the kew
		
		europe.put("Spain", "Madrid");
		europe.put("Germany", "Berlin");
		europe.put("Italy", "Roma");
		
		System.out.println(europe);
		
		Map<String, String> africa = new LinkedHashMap<>();//the order is preserved 
														// as we entered the names
		
		africa.put("Morrocco", "Rabat");
		africa.put("Egypt", "Cairo");
		africa.put("South Africa", "Johannesburg");
		
		System.out.println(africa);
		
		Map<String, String> asia = new HashMap<>();//no order
		
		asia.put("Japan", "Tokyo");
		asia.put("Iran", "Tehran");
		asia.put("Tajikistan", "Dushanbe");
		
		//HM iterate europe by numbers
		//iterate the same for asia
		
		System.out.println("------WORLD-----------------");
		
		List<Map<String, String>> world = new ArrayList<>();
		
		world.add(europe);
		world.add(asia);
		world.add(africa);
		
		System.out.println(world);
		
		System.out.println("world size -> " + world.size());
		
		world.get(1);//get the element with index 1
		
		Map<String, String> map1 = world.get(1);
		System.out.println("map1 -> " + map1);
		
		System.out.println("-----let iterate  the WORLD-----------------");
		
		for (Map<String , String> continent : world) {
			//System.out.println(continent);
			
			Set<String> countryNames = continent.keySet();
			
			for (String country : countryNames) {
				System.out.println(country);
				
				String capitalCity = continent.get(country);
				System.out.println(country + " -> " + capitalCity);
				
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

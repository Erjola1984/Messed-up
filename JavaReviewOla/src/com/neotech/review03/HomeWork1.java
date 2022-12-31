package com.neotech.review03;

public class HomeWork1 {

	public static void main(String[] args) {
		// create an array of countries: north America, south America, Europe, Asian , 
		// African countries. Then print all the values from that array using 2 different
		//loops and calculate how many total countries been stored.
		
		String[][] countries = {
				{"Florida",   "Ohio",      "New York",     "Georgia"},
				{"Brazil",     "Meksike",  "Porto Rico"},
				{"Albania",    "France",    "Italy"},
				{"China",      "Japan"},
				{"Nigeri",     "Kongo",      "Ethiopia"},
		};
		int sum = 0;
		for(int row = 0; row < countries.length; row++ )
		{
			for (int columns = 0; columns < countries[row].length; columns++)
			{
				System.out.print(countries[row][columns]+ " ");
				sum++;
				
			}
			System.out.println();
			{
			}
			System.out.println("Total countries: " + sum);
			
		}
	
			
	//using for each method, changed string name from countries to places
	
		int sum1 = 0;
	for (String[]row : countries)
	{
		for (String places : row)
		{
			System.out.print(places + " ");
			sum1++;
		}
		
		System.out.println();
	}	
	System.out.println("Total countries: " + sum);
	
	}
	
	}

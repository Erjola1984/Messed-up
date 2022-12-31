package com.neotech.review05;

public class ToCharArray {

	public static void main(String[] args) {
		
		 
			String longStr = "I am very happy today, because today is monday";
			
			System.out.println("String length -> " + longStr.length());
			
			char[] charArray = longStr.toCharArray();
			
			System.out.println("char[] length -> " + charArray.length);
			
			for (char el : charArray) {
				System.out.println(el);
			}
			System.out.println();
			
			for (int i = 0; i < charArray.length; i++) 
			{
				System.out.println(charArray[i]);
			}
			
			//Print the whole array, but replace a with e.
			
			System.out.println("");
			for  (char el : charArray ){
				
				if (el == 'a') {
				System.out.println('e');
				}
				else
				System.out.print(el);
			}

}
	
}
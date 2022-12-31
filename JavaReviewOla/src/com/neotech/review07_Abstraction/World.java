package com.neotech.review07_Abstraction;

public class World {

	public static void main(String[] args) {
		// I can not create an obj from human class
		//Human h1 = new Human("Melih");

		//Up-casting and also down-casting can be done 
		//only because of INHERITANCE
		Human a1 = new Albanian("Valbona");//up-casting
		a1.talk();
		a1.sleep();
		//ai.albanianDence()
		
		Human t1 = new Turkish("Vane");//up -casting
		t1.talk();
		t1.sleep();
		//t1.makeBaklava();
		
		Turkish tur = (Turkish) t1; //down-casting
		

		//Task = create an array of 5 humans and fill it.
		//Iterate the array with an inhanced for loop
		//execute the talk and sleep method for all all of them
		
		

		
	}

}

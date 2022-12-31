package com.neotech.review07;

public class World {
	public static void main(String[] args) {
		Human.planet = "Earth";

		Human h1 = new Human();
		System.out.println(h1.name + " lives in " + Human.planet);

		Human h2 = new Human("Fatihcan");
		System.out.println(h2.name + " lives in " + Human.planet);
		
		
		Human h3 = new Human ("Ola");
		System.out.println(h3.name + " lives in " + Human.planet);
		
		Human.planet = "Mars"; // sending everyone to mars
		System.out.println(h3.name + " lives in " + Human.planet);
		
		Human h4; //declaring a variable of type human;
		h4 = new Albanian("Hera");// creating an Albanian and assigning to h3. Upcasting
		
		Human h5 = new Turkish("Osman");
		
		System.out.println("Let us make people talk, by giving money");
		h1.talk();
		h2.talk();
		h3.talk();
		h4.talk();
		h5.talk();
		
		System.out.println("________________________________");
		
		//down-casting has to be done manually
		Turkish t1 = (Turkish) h5;
		t1.makeBaklava();
		//java does not know, if it is human can convert in turkish
		//but hard to be able to do it
		//this will give an run time error
		//Turkish t2 = (Turkish) h3;
	//	t2.makeBaklava();
		
		
		System.out.println("________________________________");
		
		//Polymorphism
		//Method overriding
		//Run time Polymorphism/late binding, dynamic binding
		
		if (h3 instanceof Turkish) {
			//can cast or convert into turkish
			Turkish tur = (Turkish) h3;
			tur.makeBaklava();
			
		}else if (h3 instanceof Albanian) {
			//can cast or convert into albanian
			Albanian alb = (Albanian)h3;
			alb.albanianDance();
		} else if (h3 instanceof American) {
			//can cast into american
			American amer = (American)h3;
			amer.taxReturn();
	}
		
		System.out.println("________________________________");	
		
		American us1 = new American("Donald", "345-43-1234");
		us1.talk();
		us1.taxReturn();
		
		Human h6 = us1; //up casting
		h6.talk();
		
		American us2 = (American) h6;//down casting to do manually
		us2.taxReturn();
		
		System.out.println("-------Power of Polymorphism--------");
		Human[] humans = new Human[6];
		humans[0] = h1;
		humans[1] = h2;//human
		humans[2] = h3;//albanian
		humans[3] = h4;//turkish
		humans[4] = h5;//american
		humans[5] = h6;//american
		
		for (Human element : humans) {
			System.out.println("---------");
			element.talk(); //humans will talk their language
		
		
		if (element instanceof Albanian ) {
			Albanian alb =(Albanian) element;
			alb.albanianDance();
		}else if (element instanceof Turkish ) {
			Turkish tur  =(Turkish) element;
			tur.makeBaklava();
		}else if (element instanceof American) {
			((American ) element).taxReturn();
		}
		

		}
	}
}

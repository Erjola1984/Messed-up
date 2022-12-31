package com.neotech.review05;

public class FamilyDemo {

	public static void main(String[] args) {
		
		//I can access static/class variables before I create an object
		FamilyMember.lastName = "James";
		
		//I can't access instance variables before I create an object
		//FamilyMembers.firstNAME  = "LeBron";
		
		//I can access static/class methods before I create an object
		FamilyMember.printFamilyName();
		
		//I can't access static/class methods before I create an object
		//FamilyMembers.printFullName();

		System.out.println("------------------------------------");
		
		FamilyMember member1 = new FamilyMember();
		member1.firstName = "LeBron";
		member1.age = 37;
		
		FamilyMember member2 = new FamilyMember();
		member2.firstName = "Savannah";
		member2.age = 34;
		
		member1.printFullName();
		member2.printFullName();
		
		System.out.println("------------------------------------");
		System.out.println("They went to the court and changed their last name!!");
		
		//static variables can change
		FamilyMember.lastName = "Brown";
		
		member1.firstName = "King leBron";
		
		member2.printFullName();
		member1.printFullName();
		
		//they had a baby;
		FamilyMember baby = new FamilyMember();
		
		//does this baby has a firstName?
		System.out.println("firstName-> " + baby.firstName);
		
		//does this baby has a lastName?
		System.out.println("lastName-> " + FamilyMember.lastName);
		
		
		
		
		
		
		
		
		
	}

}

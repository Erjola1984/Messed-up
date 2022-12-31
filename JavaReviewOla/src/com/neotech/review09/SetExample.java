package com.neotech.review09;

import java.util.*;

public class SetExample {
	//collection (first interface),
	//List | Set | 	Queue (3 interfaces inheriting Collection interface)
	//ArrayList | LinkedList (2 classes implementing the List Interface)
	//HashSet | LinkedHashSet | TreeSet (3 classes implementing the Set Interface, 
	//all 3 of them are kids of Set)
	
	public static void main(String[] args) {
		
		Set<String>africaLinked = new LinkedHashSet<>();
		africaLinked.add("Egypt");
		africaLinked.add("Niger");
		africaLinked.add("Morrocco");
		africaLinked.add("Gana");
		
		System.out.println(africaLinked);
		System.out.println("Size -> " + africaLinked.size());//upcasting: declaring the set
															// and storing a HashSet
		//it will not add in the set because they already exist
		boolean added = africaLinked.add("Morroco");
		africaLinked.add("Egypt");
		africaLinked.add("Niger");
		
		System.out.println("Size -> " + africaLinked.size());
		
		System.out.println("Was it added in the Set? " + added);
		
		//can I add with an index in a Set??- nope
		//africaLinked.add(2,"Zambia");
		
		System.out.println("linkedHashSet -> " + africaLinked);
		
		Set<String> africaTree = new TreeSet<>(africaLinked);
		System.out.println("Treeset -> " + africaTree);
		
		Set<String> africaHash = new HashSet<>();
		africaHash.addAll(africaLinked);
		System.out.println("HashSet -> " + africaHash);
		
		int size = africaHash.size();
		System.out.println("Size -> " + size);
		boolean contains = africaHash.contains("Turkey");
		boolean isEmpty = africaHash.isEmpty();
		
		boolean ableToRemove = africaHash.remove("Turkey");
		System.out.println("Was I able to remove Turkey? " + ableToRemove);
		
		//Note: we are not able to get/add/remove by index in a set
		//africaHash.get(2);
		
		System.out.println("---for loop does not work in a ");
		//for(int i = 0; i < africaHash.size(); i++)
		//	africaHash.get(i);
		
		
		System.out.println("---2nd way enhanced for loop---------");
		
		for(String africa : africaHash)
		{
			System.out.println(africa);
		}
		
		
		
		System.out.println("---3 way using iterator---------");
		
		
		Iterator<String> it = africaHash.iterator();
		while(it.hasNext())
		{
			String africa = it.next();
			System.out.println(africa);
		}
		
		
		
			
			}
		
		
		
		
		
		
	}
	


package com.people.week2day2;

import java.util.ArrayList;

public class Building {

	public static void main(String[] args) {
		
		ArrayList<Person> ourBuilding = new ArrayList<>(3);
		
		Student studentA = new Student("Brendan", 29, "male", 6.4f, "6518130", false, true, true);
		Student studentB = new Student("Mary", 35, "female", 5.3f, "5841581", true, true, true);
		Janitor janitorA = new Janitor("Kavita", 30, "female", 5.0f, true, "Head GroundsKeeper");
		
		ourBuilding.add(studentA);
		ourBuilding.add(studentB);
		ourBuilding.add(janitorA);
		
		//If no toString in the Student class then this will do the same printout as the one below.
//		System.out.println(studentA.toString());
		
		//By putting the toString in the Student class then this will do the same printout as the one above.
		System.out.println(ourBuilding.get(0));
		System.out.println(ourBuilding.get(0).getName());
		
		


	}
}

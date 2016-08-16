package com.reboot.week2.day2.assignment;

import java.util.ArrayList;

public class Zoo {

	public static void main(String[] args) {
		
		ArrayList<Animal> theBees = new ArrayList<>(3);
		ArrayList<Animal> theBirds = new ArrayList<>(3);
		ArrayList<Animal> theButterflies = new ArrayList<>(3);
		ArrayList<Animal> theCrocodiles = new ArrayList<>(3);
		ArrayList<Animal> theDogs = new ArrayList<>(3);
		ArrayList<Animal> theHorses = new ArrayList<>(3);
		ArrayList<Animal> theLions = new ArrayList<>(3);
		ArrayList<Animal> theSharks = new ArrayList<>(3);
		ArrayList<Animal> theSnakes = new ArrayList<>(3);
		ArrayList<Animal> theSpiders = new ArrayList<>(3);
		
		Bee beeA = new Bee("bee", "African bee", 6, false, true, false, 0.2f, 0.4f, true);
		Bee beeB = new Bee("bee", "Carpenter bee", 6, false, true, true, 0.3f, 0.5f, false);
		
		Bird birdA = new Bird("bird", "hummingbird", 2, true, true, false, 1.2f, 1.1f, true, true);
		
		Butterfly butterflyA = new Butterfly("butterfly", "Sphingidae butterfly", 6, false, true, false, 0.2f, 0.3f, true);
		
		Crocodile crocodileA = new Crocodile("crocodile", "Dwarf crocodile", 4, true, false, true, 0.7f, 27.9f, 5.3f);
		
		Dog dogA = new Dog("dog", "German Sherpherd", 4, true, false, false, 2.3f, 6.2f, "Pita", "female");
		
		Horse horseA = new Horse("horse", "Appaloosa horse", 4, true, false, false, 4.5f, 275.2f, "Olaf", true, true);
		
		Lion lionA = new Lion("lion", "African lion", 4, true, false, false, 3.1f, 98.5f, "Simba", "male");
		
		Shark sharkA = new Shark("shark", "Wobbegong shark", 0, true, false, false, 0.7f, 85.4f, 16.2f);
		
		Snake snakeA = new Snake("snake", "Anaconda", 0, true, false, true, 0.6f, 125.9f, false, 35.1f);
		
		Spider spiderA = new Spider("spider", "Wolf spider", 8, false, false, false, 0.2f, 0.1f, false, true);
		
		theBees.add(beeA);
		theBees.add(beeB);
		
		theBirds.add(birdA);
		
		theButterflies.add(butterflyA);
		
		theCrocodiles.add(crocodileA);
		
		theDogs.add(dogA);
		
		theHorses.add(horseA);
		
		theLions.add(lionA);
		
		theSharks.add(sharkA);
		
		theSnakes.add(snakeA);
		
		theSpiders.add(spiderA);
		
		System.out.println(beeA.toString());
		System.out.println();
		System.out.println(beeB.toString());
		System.out.println();
		
		System.out.println(birdA.toString());
		System.out.println();
		
		System.out.println(butterflyA.toString());
		System.out.println();
		
		System.out.println(crocodileA.toString());
		System.out.println();
		
		System.out.println(dogA.toString());
		System.out.println();
		
		System.out.println(horseA.toString());
		System.out.println();
		
		System.out.println(lionA.toString());
		System.out.println();
		
		System.out.println(sharkA.toString());
		System.out.println();
		
		System.out.println(snakeA.toString());
		System.out.println();
		
		System.out.println(spiderA.toString());
		System.out.println();
			
	}

}

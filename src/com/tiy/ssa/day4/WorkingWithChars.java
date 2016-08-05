package com.tiy.ssa.day4;

import java.util.Scanner;

public class WorkingWithChars {

	public static void main(String[] args) 
	{
		Scanner alien = new Scanner(System.in);
		
		System.out.println("How is your day?");
		System.out.println("You can choose 'great' or 'bad'");
		
		String theDayIs = alien.nextLine();
		
		switch (theDayIs.toLowerCase())
		{
		case "great":
			System.out.println("Great to hear!");
			break;
		case "bad":
			System.out.println("I's sorry");
			break;
		
		default:
			System.out.println("What?");
			break;
		}
	}

}

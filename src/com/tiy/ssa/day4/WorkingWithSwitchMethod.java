package com.tiy.ssa.day4;

import java.util.Scanner;

public class WorkingWithSwitchMethod {

	public static void main(String[] args) 
	{
		Scanner alien = new Scanner(System.in);
		
		System.out.println("How is your day?");
		
		String theDayIs = alien.nextLine();
		
		for (int day = 0; day < 8; day++) {
			switch (day) {
			case 1:
				happyDay(day);
				break;
			case 2:
				happyDay(day);
			default:
				thatsNotADay(day);
				break;
			}
		}
	}

	private static void thatsNotADay(int day) 
	{
		System.out.println("There are only 7 days in a week!!!");	
		
	}

	private static void happyDay(int day) 
	{
		System.out.println("There are only 7 days in a week!!!");	
	}
}

// Author - Kamaldeen Alabi
// Assignment - Calculate Batting Stats
// August 8, 2016

package com.tiy.ssa.reboot.week2;

import java.util.ArrayList;

import java.util.Scanner;

public class CalculateBattingStats 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> myBattingBasesList = new ArrayList<>();
		String playersName;
		Scanner sc = new Scanner(System.in);
		boolean isAtBatResultHigh = false;
		int numOfBasesResult = 0;
		int cumulativeHitsAtBat = 0;

		// Welcome
		System.out.println("Welcome to the Batting Stats Calcluator");

		// Get name of batter
		System.out.println("Enter the player's name: ");

		playersName = sc.nextLine();

		System.out.println("The player's name is: " + playersName);

		// Ask how many times at bat?
		System.out.println("Enter the number of at-bats " + playersName + " took:");

		String numberOfAtBat;
		numberOfAtBat = sc.nextLine();

		int numAtBat = Integer.parseInt(numberOfAtBat);

		do {
			isAtBatResultHigh = false;
			for (int i = 0; i < numAtBat; i = i + 1) {
				System.out.println("How many bases did " + playersName + " scored at-bat number " + (i + 1));

				String numberOfBasesForEachAtBat = sc.nextLine();

				numOfBasesResult = Integer.parseInt(numberOfBasesForEachAtBat);
				
				if (numOfBasesResult > 0 && numOfBasesResult <= 4) 
				{
					cumulativeHitsAtBat++;
				} 
				else if (numOfBasesResult <= 0) 
				{
//					cumulativeHitsAtBat--;
//					int playerMissesAtBat = 0;
				} 
				else 
				{
					System.out.println("Please enter only numbers between 0 and 4.");
					isAtBatResultHigh = true;
					break;
				}

				myBattingBasesList.add(numOfBasesResult);
			}
			
		} while (isAtBatResultHigh);

		int cumulativeSum = 0;

		// Add up all the at-bat results to sum
		for (int i = 0; i < myBattingBasesList.size(); i = i + 1) 
		{
			cumulativeSum = cumulativeSum + myBattingBasesList.get(i);
		}
		
		Float averageAtBat = (float) cumulativeHitsAtBat / numAtBat;

		Float sluggingPercent = (float) cumulativeSum / myBattingBasesList.size();

//		System.out.println(playersName + "'s batting average is " + averageAtBat + 
//				" and slugging percent is " + sluggingPercent);
		
		System.out.print(playersName + "'s batting average is ");
		System.out.printf("%.3g", averageAtBat);
		System.out.print(" and slugging percent is ");
		System.out.printf("%.3g%n", sluggingPercent);
	}
	
}

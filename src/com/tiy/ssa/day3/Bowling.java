package com.tiy.ssa.day3;

public class Bowling {
	
	public static void main(String[] args) 
	{
		int numberOfPins = 10;
		int numberOfFrames = 11;
		int totalScore = 0;
		
		for (int i = 1; i < numberOfFrames; i++) 
		{
			int scoresPerFrame = 0;
			System.out.println("Frame " + i);
			
			int pinsHit = (int)((Math.random() * numberOfPins) + 1);
			
			System.out.println(pinsHit);
			scoresPerFrame += pinsHit;
			
			if (pinsHit == 10) 
			{
				System.out.println("X - Strike");
			}
			else
			{
				pinsHit = (int)((Math.random() * (numberOfPins - pinsHit)) + 1);
				System.out.println(pinsHit);
				scoresPerFrame += pinsHit;
			}
			System.out.println("This score for frame " + i + " is " + scoresPerFrame);
			
			System.out.println();
			totalScore += pinsHit;
		}
		System.out.println("This is the total score " + totalScore);
	}
}



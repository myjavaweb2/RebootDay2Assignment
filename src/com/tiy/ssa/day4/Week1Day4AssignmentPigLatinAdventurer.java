//This is a program that accepts a word from the user and translates it to Pig Latin.
//Author - Kamaldeen Alabi
//August 4, 2016

package com.tiy.ssa.day4;

import java.util.Scanner;

public class Week1Day4AssignmentPigLatinAdventurer 
{
	Scanner sc = new Scanner(System.in);

	
	public void geUserInputWords() 
	{
		boolean whileGettingUserInputWords = true;
		
		while (whileGettingUserInputWords) 
		{	
			System.out.println(userInput);
			
			String[] UserWordsInASentence = new String[0];
			
			for (int i = 0; i < UserWordsInASentence.length; i++) 
			{
				System.out.println("Enter each word in your sentence,one word at a time: ");
				System.out.println(i);
				UserWordsInASentence[i] = sc.nextLine();
				UserWordsInASentence[i] = UserWordsInASentence[i].toLowerCase();
				
				System.out.println(UserWordsInASentence[i]);
			
			if (whileGettingUserInputWords)
			{
				System.out.println("Please enter each word in your sentence to translate to Pig Latin");
				System.out.println("Enter one word at a time and click the 'Return or Enter' button: ");
				String userInput = sc.nextLine();
				
				whileGettingUserInputWords =!selectedAnswer.equalsIgnoreCase("x");
					
				switch (selectedAnswer)
				{
				case "a":
					System.out.println(storyLine[0]);
					followUpOnOptionA();
					break;
				case "b":
					System.out.println(storyLine[1]);
					followUpOnOptionB();
					break;
				case "c":
					System.out.println(storyLine[2]);
					followUpOnOptionC();
					break;
				case "d":
					System.out.println(storyLine[3]);
					followUpOnOptionD();
					break;
				}
			}		
		}
		
		System.out.println("Exiting Adventure");
	}
	
	
	
	
	
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter each word in your sentence to translate to Pig Latin");
		System.out.println("Enter one word at a time and click the 'Return or Enter' button: ");
		String userInput = sc.nextLine();
		
		System.out.println(userInput);
		
		String[] UserWordsInASentence = new String[0];
		
		for (int i = 0; i < UserWordsInASentence.length; i++) 
		{
			System.out.println("Enter each word in your sentence,one word at a time: ");
			System.out.println(i);
			UserWordsInASentence[i] = sc.nextLine();
			UserWordsInASentence[i] = UserWordsInASentence[i].toLowerCase();
			
			System.out.println(UserWordsInASentence[i]);
			
			while (sc.hasNext()) {
				String string = (String) sc.next();
				
				System.out.println("Enter the next word in your sentence,one word at a time: ");
				System.out.println(i++);
				UserWordsInASentence[i] = sc.nextLine();
				UserWordsInASentence[i] = UserWordsInASentence[i].toLowerCase();
				
				System.out.println(UserWordsInASentence[i]);
				break;
			}
			System.out.println("Existing");
		} 
		
		
		StringBuilder modifyUserInput = new StringBuilder(userInput.toLowerCase());
		
		char firstLetter = modifyUserInput.charAt(0);
		
		//This checks to see if the user inputed only one letter-word such as "I" and
		// then translate it to "i-yay" else it moves to the next loop in the if-statement.
		if (modifyUserInput.length() <= 1)
		{
			modifyUserInput.append('-');
			
			char[] yay = {'y', 'a', 'y'};
			
			System.out.println(modifyUserInput.append(yay));
		}
		else
		{	
			char secondLetter = modifyUserInput.charAt(1);
			
			//This checks for words that begin with a consonant followed by a vowel 
			//such as "Hello" and translate it to "ello-hay" or "duck" to "uck-day".
			if (firstLetter != 'a' && firstLetter != 'e' && firstLetter != 'i' && firstLetter != 'o' && firstLetter != 'u' &&
					secondLetter == 'a' || secondLetter == 'e' || secondLetter == 'i' || secondLetter == 'o' || secondLetter == 'u') 
			{
				modifyUserInput.deleteCharAt(0);
				
				modifyUserInput.append('-');
				modifyUserInput.append(firstLetter);
				
				char[] ay = {'a', 'y'};
				
				System.out.println(modifyUserInput.append(ay));		
			} 
			
			//This checks for consonant cluster words that begin with two consecutive consonants followed 
			//such as "Switch" and translate it to "itch-sway" or "glove" to "ove-glay".
			else if (firstLetter != 'a' && firstLetter != 'e' && firstLetter != 'i' && firstLetter != 'o' && firstLetter != 'u' &&
					 	secondLetter != 'a' && secondLetter != 'e' && secondLetter != 'i' && secondLetter != 'o' && secondLetter != 'u') 
			{
				modifyUserInput.deleteCharAt(0);
				modifyUserInput.deleteCharAt(0);
				
				modifyUserInput.append('-');
				modifyUserInput.append(firstLetter);
				modifyUserInput.append(secondLetter);
				
				char[] ay = {'a', 'y'};
				
				System.out.println(modifyUserInput.append(ay));	
			}
			
			//This checks for the default words that begin with a vowel such as 
			//"Ultimate" and translate it to "ultimate-yay" or "egg" to "egg-yay".
			else 
			{
				modifyUserInput.append('-');
				
				char[] yay = {'y', 'a', 'y'};
				
				System.out.println(modifyUserInput.append(yay));
			}
		}
	}
}

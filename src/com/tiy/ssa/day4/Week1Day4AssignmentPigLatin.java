//This is a program that accepts a word from the user and translates it to Pig Latin.
//Author - Kamaldeen Alabi
//August 4, 2016

package com.tiy.ssa.day4;

import java.util.Scanner;

public class Week1Day4AssignmentPigLatin 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a word to translate to Pig Latin: ");
		String userInput = sc.nextLine();
		
		System.out.println(userInput);
		
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

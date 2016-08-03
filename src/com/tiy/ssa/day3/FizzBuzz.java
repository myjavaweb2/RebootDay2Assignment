package com.tiy.ssa.day3;

public class FizzBuzz {

	public static void main(String[] args) 
	{
//		FizzBuzzBang
//		Test if digit is clearly divisible by 3 - replace with Fizz
//		Test if digit is clearly divisible by 5 - replace with Buzz
//		Test if digit is clearly divisible by 7 - replace with Bang
//		Test if digit is clearly divisible by 3 and 5 - replace with FizzBuzz
//		Test if digit is clearly divisible by 3 and 7 - replace with FizzBang
//		Test if digit is clearly divisible by 5 and 7 - replace with BuzzBang
//		Test if digit is clearly divisible by 3, 5 and 7 - replace with FizzBuzzBang
				
		for (int i = 1; i < 110; i++) 
		{
			if (((i % 3) == 0) && ((i % 5) == 0) && ((i % 7) == 0)) 
			{
				System.out.println("FizzBuzzBang");		
			}
			else if (((i % 3) == 0) && ((i % 5) == 0))
			{
				System.out.println("FizzBuzz");
			}
			else if (((i % 3) == 0) && ((i % 7) == 0))
			{
				System.out.println("FizzBang");
			}
			else if (((i % 5) == 0) && ((i % 7) == 0))
			{
				System.out.println("BuzzBang");
			}
			else if ((i % 3) == 0)
			{
				System.out.println("Fizz");
			}
			else if ((i % 5) == 0)
			{
				System.out.println("Buzz");
			}
			else if ((i % 7) == 0)
			{
				System.out.println("Bang");
			}
			else
			{
				System.out.println(i);
			}
		}
	}
}

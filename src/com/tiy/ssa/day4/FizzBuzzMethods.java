package com.tiy.ssa.day4;

public class FizzBuzzMethods {

	public static void main(String[] args) 
	{
		for(int i = 1; i < 110; i++)
		{
			if (divisableByAllThree(i))
			{
				System.out.println("FizzBuzzBang");
			}
			else if (divisableByThreeAndFive(i)) 
			{
				System.out.println("FizzBuzz");
			}
			else if (divisableByThreeAndSeven(i)) 
			{
				System.out.println("FizzBang");
			}
			else if (divisableByFiveAndSeven(i)) 
			{
				System.out.println("BuzzBang");
			}
			else if (divisableByOnlyThree(i)) 
			{
				System.out.println("Fizz");
			}
			else if (divisableByOnlyFive(i)) 
			{
				System.out.println("Buzz");
			}
			else if (divisableByOnlySeven(i)) 
			{
				System.out.println("Bang");
			}
			else 
			{
				System.out.println(i);
			}			
		}
	}

	public static boolean divisableByAllThree(int theNumberFromTheForLoop)
	{
		boolean howIsThis = false;
		
		if (((theNumberFromTheForLoop % 3) == 0) && ((theNumberFromTheForLoop % 5) == 0) && ((theNumberFromTheForLoop % 7) == 0))
		{
			howIsThis = true;
		}
		
		return howIsThis;
	}
	
	public static boolean divisableByThreeAndFive(int theNumberFromTheForLoop)
	{
		boolean howIsThis = false;
		
		if (((theNumberFromTheForLoop % 3) == 0) && ((theNumberFromTheForLoop % 5) == 0))
		{
			howIsThis = true;
		}
		
		return howIsThis;
	}
	
	public static boolean divisableByThreeAndSeven(int theNumberFromTheForLoop)
	{
		boolean howIsThis = false;
		
		if (((theNumberFromTheForLoop % 3) == 0) && ((theNumberFromTheForLoop % 7) == 0))
		{
			howIsThis = true;
		}
		
		return howIsThis;
	}
	public static boolean divisableByFiveAndSeven(int theNumberFromTheForLoop)
	{
		boolean howIsThis = false;
		
		if (((theNumberFromTheForLoop % 5) == 0) && ((theNumberFromTheForLoop % 7) == 0))
		{
			howIsThis = true;
		}
		
		return howIsThis;
	}
	public static boolean divisableByOnlyThree(int theNumberFromTheForLoop)
	{
		boolean howIsThis = false;
		
		if ((theNumberFromTheForLoop % 3) == 0)
		{
			howIsThis = true;
		}
		
		return howIsThis;
	}
	public static boolean divisableByOnlyFive(int theNumberFromTheForLoop)
	{
		boolean howIsThis = false;
		
		if ((theNumberFromTheForLoop % 5) == 0)
		{
			howIsThis = true;
		}
		
		return howIsThis;
	}
	public static boolean divisableByOnlySeven(int theNumberFromTheForLoop)
	{
		boolean howIsThis = false;
		
		if ((theNumberFromTheForLoop % 7) == 0)
		{
			howIsThis = true;
		}
		
		return howIsThis;
	}
}

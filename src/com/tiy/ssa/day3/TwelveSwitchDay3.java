package com.tiy.ssa.day3;

public class TwelveSwitchDay3 {

	public static void main(String[] args) 
	{
		for (int i = 0; i < 100; i++) 
		{
			switch (i)
			{
			case 1:
				System.out.println("It's a one");
				break;
			case 2:
				System.out.println("It's a two");
				break;
				default:
					System.out.println("It's some other number");
			}
			
		}

	}

}

package com.tiy.ssa.reboot.week2;

public class ExceptionExample {

	public static void main(String[] args) 
	{
		int[] hiya = new int[1];
		
		try{
			System.out.println(hiya[2]);
		} catch (ArrayIndexOutOfBoundsException alienEggs){
			
			System.out.println("You have make some error.");
		}

	}

}

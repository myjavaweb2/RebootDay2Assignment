package com.tiy.ssa.day4;

public class WorkingWithCharArrays {

	public static void main(String[] args) 
	{
		StringBuilder stuffNThings = new StringBuilder("Hi Everyone!");
		
		char[] sayHiClass = {'H', 'i', ' ', 'c', 'l', 'a', 's', 's'};
		
		String sayingHiClass = new String(sayHiClass);
		
		System.out.println(sayingHiClass);
		
		String stuff = "Hi all";
		
		System.out.println(stuff.toLowerCase());
		
		System.out.println(stuffNThings);
		
		System.out.println(stuffNThings.deleteCharAt(0));
		System.out.println(stuffNThings.deleteCharAt(0));
		System.out.println(stuffNThings.deleteCharAt(0));

	}

}

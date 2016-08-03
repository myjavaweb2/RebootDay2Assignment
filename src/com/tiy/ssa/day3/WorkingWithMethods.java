package com.tiy.ssa.day3;

public class WorkingWithMethods {

	public static void main(String[] args) 
	{
		boolean doWeHaveAllTheNotebooks = true;
		
		//Went to count the books and found one missing thus,
		doWeHaveAllTheNotebooks = false;
		
		String whatHappened = notebook(doWeHaveAllTheNotebooks);
		
		System.out.println(whatHappened);
		System.out.println(notebook(doWeHaveAllTheNotebooks));
		
		System.out.println();
		String doThisNext = whatHappened + " Do you know where the book is?";
		
		System.out.println(doThisNext);

	}
	
	public static String notebook(boolean isLost)
	{
		String whatToDoNow = null;
		if (isLost)
		{
			whatToDoNow = "Good, we have all the books.";
		}
		else
		{
			whatToDoNow = "Ask the students";
		}
		return whatToDoNow;
	}

}

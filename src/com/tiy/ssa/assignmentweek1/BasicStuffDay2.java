package com.tiy.ssa.assignmentweek1;

public class BasicStuffDay2 {

	public static void main(String[] args) 
	{

//Explorer Mode
//
//Using the appropriate data types in Java create the following variables:
//
//1. a variable that holds the string "Hello World"
		
		String welcomeJava = "Hello World";

//2. a variable that holds the number 1492
		
		int numHolder = 1492;

//3. a variable that holds if you have a dog at home
		
		boolean aDogOrNot = true;

//4. a variable that holds today's date as a string

		String toDate = "08/02/2016";
		
//5. a variable that holds the amount of $5.45
		
		double amount = 5.45;

//6. a variable that holds the single letter X
		
		String alphabet = "X";

//Print the following Strings to the console. Use string concatenation 
//
//1. "Hello World" (using the variable from #1 above)
		
		System.out.println(welcomeJava);

//2. "Columbus Sailed the world in 1492." (using the variable from #2 above)
		
		System.out.println("Columbus sailed the world in " + numHolder + ".");

//3. "It is true that I have a dog at home." (using the variable from #3 above)
		
		if (aDogOrNot)
		{
		System.out.println("It is true that I have a dog at home.");
		}

//4. "Today is 2/29/2016." (using the variable from #4 above)
		
		System.out.println("Today is " + toDate + ".");
//
//5. "I spent $5.45 on a cheeseburger." (using the variable from #5 above)
		
		System.out.println("I spent $" + amount + " on a cheeseburger.");
//
//6. "X marks the spot" (using the variable from #6 above)
		
		System.out.println(alphabet + " marks the spot");
		
//Adventurer Mode
//
//1. Make an array of your favorite movies or books or bands, etc. Have at least 10 values.
		
		String[] myMoviesArray = new String[10];
		
		myMoviesArray[0] = "Rambo - First Blood";
		myMoviesArray[1] = "Rocky V";
		myMoviesArray[2] = "The Expendables 2";
		myMoviesArray[3] = "Commando";
		myMoviesArray[4] = "The Terminator";
		myMoviesArray[5] = "Total Recall";
		myMoviesArray[6] = "Predator";
		myMoviesArray[7] = "Collateral Damage";
		myMoviesArray[8] = "Training Day";
		myMoviesArray[9] = "Malcolm X";

//2. Make an array of your favorite movies or books or bands, etc. Have at least 10 values.
		
		String[] myBooksArray = new String[10];
		
		myBooksArray[0] = "Oracle Database 12c SQL";
		myBooksArray[1] = "Core Java Volume 1";
		myBooksArray[2] = "Core JavaServer Faces";
		myBooksArray[3] = "A Smarter Way to Learn JavaScript";
		myBooksArray[4] = "Java - How To Program";
		myBooksArray[5] = "Learning Web Design";
		myBooksArray[6] = "Beginning JavaScript";
		myBooksArray[7] = "The Phoenix Project";
		myBooksArray[8] = "Learning PHP, MYSQL & JavaScript";
		myBooksArray[9] = "Android Programming for Beginners";

	}
	
//3. Create 10 methods with different modifiers, return types, names, parameter lists, and method bodies
	
		public int numOfCars()
		{
			return 0;	
		}

		private String coolPlaces()
		{
			return "Hollywood";
				
		}
			
		protected double savingAmount()
		{
			return 768.65d;
		}
		
		public int classPets()
		{
			return 0;	
		}
	
		public void bootCampers()
		{
		
			String[] bootCampers = {"John", "Chris", "Mary", "Adam", "Sarah"};
			
			for (int i = 0; i < bootCampers.length; i++) {
				System.out.println(bootCampers[i]);
			}
	
		}
		
		public float myFloatNums()
		{
			return 25.9f;
		}
		
		public long bigNumbers()
		{
			return 983890;
		}
		
		public int someNumbers()
		{
			return 9;
		}
		
		public String[] famousPeople()
		{
			String[] famousPeople = {"Michael Jackson", "Barack Obama", "Michael Jordan", "Bill Clinton", "Bill Gates"};
			
			return famousPeople();
		}
		
		private int[] secretAccounts()
		{
			return secretAccounts();
		}

}

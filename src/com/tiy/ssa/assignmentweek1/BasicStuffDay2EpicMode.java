package com.tiy.ssa.assignmentweek1;

public class BasicStuffDay2EpicMode {
	
//Epic Mode
//
//1. Make an multidimensional array of your favorite foods, albums, books, and movies

	public static void main(String[] args) 
	{
//		String[] myArrays = new String[10]; 
//		String[] myArrays = new String[10];
		
		String[][] myArrays = new String[10][10];
		
		myArrays[0][0] = "Rambo - First Blood";
		myArrays[0][1] = "Rocky V";
		myArrays[0][2] = "The Expendables 2";
		myArrays[0][3] = "Commando";
		myArrays[0][4] = "The Terminator";
		myArrays[0][5] = "Total Recall";
		myArrays[0][6] = "Predator";
		myArrays[0][7] = "Collateral Damage";
		myArrays[0][8] = "Training Day";
		myArrays[0][9] = "Malcolm X";
		
		myArrays[1][0] = "Oracle Database 12c SQL";
		myArrays[1][1] = "Core Java Volume 1";
		myArrays[1][2] = "Core JavaServer Faces";
		myArrays[1][3] = "A Smarter Way to Learn JavaScript";
		myArrays[1][4] = "Java - How To Program";
		myArrays[1][5] = "Learning Web Design";
		myArrays[1][6] = "Beginning JavaScript";
		myArrays[1][7] = "The Phoenix Project";
		myArrays[1][8] = "Learning PHP, MYSQL & JavaScript";
		myArrays[1][9] = "Android Programming for Beginners";
		
		for (int i = 0; i < 2; i++)
		{
			for (int j = 0; j < 10; j++)
			{
				System.out.println(myArrays[i][j]);
			}
			System.out.println();
		}

	}

}

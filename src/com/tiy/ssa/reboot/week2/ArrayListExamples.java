package com.tiy.ssa.reboot.week2;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayListExamples 
{
	public static void main(String args[]) {
	      // create an array list
	      ArrayList al = new ArrayList();
	      System.out.println("Initial size of al: " + al.size());

	      // add elements to the array list
	      al.add("C");
	      al.add("A");
	      al.add("E");
	      al.add("B");
	      al.add("D");
	      al.add("F");
	      al.add(1, "A2");
	      System.out.println("Size of al after additions: " + al.size());

	      // display the array list
	      System.out.println("Contents of al: " + al);
	      // Remove elements from the array list
	      al.remove("F");
	      al.remove(2);
	      System.out.println("Size of al after deletions: " + al.size());
	      System.out.println("Contents of al: " + al);
	      
	      
	      HashMap cars = new HashMap();
	      
	      cars.put("Sonic", "Chevy");
	      cars.put("F-150", "Ford");
	      cars.put("F-250", "Ford");
	      
	      System.out.println(cars.get("F-150"));
	      
	      HashMap<String, String> zipCodes = new HashMap<>();
	      
	      zipCodes.put("30236", "Georgia");
	      
	      System.out.println(zipCodes.get("30236"));
	      	
	   }

}

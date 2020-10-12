package javaPractice.Array;

import java.util.ArrayList;
import java.util.Iterator;

public class PracticeArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> number = new ArrayList<>();
		System.out.println("Size : " + number.size());
		number.add(45);
		number.add(34);
		number.add(12);
		number.add(32);
		number.add(98);
		System.out.println(number);
		/*
		 * //Print arraylist with iterator Iterator newItr = number.iterator(); while
		 * (newItr.hasNext()) { System.out.println(" " + newItr.next() ); }
		 */
		/*
		 * //For loop to print all for (int x : number) { System.out.print(" "+x); }
		 */
		System.out.println("\n" + "From 0, the array size increased to");
		System.out.println("Size : " + number.size());

		// Removing elements
		number.remove(2);
		System.out.println(number);
		
		// checking array with while loop
		boolean check = number.isEmpty();
		System.out.println("Array list is empty? " + "\n" + check);
		
		boolean contains = false;
		while (contains == number.contains(43)) {
			System.out.println("\n"+"ArrayList does not have the number you are looking for");
			break;
		}
			
		// Replacing value with set method
		number.set(3, 54);
		System.out.println("\n"+"Values after adding a new value: "+number);
		
		
		System.out.println("\n"+"Show me the value of the 3rd array?"+"\n"+ "The value is: "+number.get(2));
	}

}

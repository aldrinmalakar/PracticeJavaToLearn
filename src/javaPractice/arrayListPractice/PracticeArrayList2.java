package javaPractice.arrayListPractice;

import java.util.ArrayList;

public class PracticeArrayList2 {
	public static void main(String[] args) {
		ArrayList<Integer> number1 = new ArrayList<>();
		ArrayList<Integer> number2 = new ArrayList<>();
		ArrayList<Integer> number3 = new ArrayList<>();

		number1.add(34);
		number1.add(12);
		number1.add(32);
		number1.add(67);
		number1.add(45);
		number1.add(98);
		System.out.println("The values of arrayList 1 is: " + number1 + " ");

		number2.add(45);
		number2.add(6);
		number2.add(8);
		number2.add(7);
		number2.add(89);
		number2.add(74);
		System.out.println("\n"+"The values of arrayList 2 is: " + number2 + " ");

		number3.addAll(number1);
		System.out.println("\n"+"The values of arrayList 3 is: " + number3 + " ");
		
		//Checking the equality of two different arrays with *.equal(e); method
		System.out.println("\n"+"Number1 is equal to Number2: "+number1.equals(number2));
		System.out.println("\n"+"Number1 is equal to Number3: "+number1.equals(number3));

	}

}

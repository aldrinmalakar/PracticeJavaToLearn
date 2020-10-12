package javaPractice.OOP;

public class forEachLoop {
	static String[] names = { "Aldrin ", "Emelda ", "Alaeddin ", "Shaila ", "Rois " };
/**
 * Main method while calling other methods
 * @param args
 */
	public static void main(String[] args) {

		sumArray();

	}
/**
 * For Loop method
 */
	public static void forLoop() {
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i]);
		}
	}
/**
 * For Each Loop Method
 */
	public static void forEachLoopMethod() {

		for (String studentName : names) {
			System.out.println(studentName);
		}
	}
	
	public static void sumArray() {
		int [] numbers = {1,550,6,9,8,4,5};
		int sum = 0;
		for (int x : numbers) {
			 sum = sum + x;
			 
		}
		System.out.println(sum);
	}
}

package javaPractice;

public class practiceLoop {
	

	public static void main(String[] args) {
		/*
		 * Make code look like:
		 * 
		 * 1
		 * 2 3
		 * 4 5 6
		 * 7 8 9 10
		 */
		
		for (int i=1;i<=4;i++) {
			// Outer loop
			
			for (int j = 1; j <= i; j++) {
			//Inner loop
				System.out.print(j+" ");
				
			} System.out.println("");
			
		}
		

	}

}

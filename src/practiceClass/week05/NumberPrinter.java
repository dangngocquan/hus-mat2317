package practiceClass.week05;

//Exercise 1.3

/**
 * 
 * This class is used to print out the numbers which is divided by 3, 5 and both.
 * 
 * @author Bris
 * @version 1.0
 * @since 11:30:41 PM Mar 16, 2022
 */
public class NumberPrinter {
	/**
	 * 
	 * The main method - entry point of this app.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		// Print the numbers which is divided by 3.
		System.out.println("\nDivided by 3: ");
		for (int i = 1; i <= 100; i++) {
			if (i%3 == 0) {
				System.out.print(i + " ");
			}
		}
		
		// Print the numbers which is divided by 5.
		System.out.println("\n\nDivided by 5: ");
		for (int i = 1; i <= 100; i++) {
			if (i%5 == 0) {
				System.out.print(i + " ");
			}
		}
		
		// Print the numbers which is divided by 3 and 5
		System.out.println("\n\nDivided by 3 & 5: ");
		for (int i = 1; i <= 100; i++) {
			if (i%15 == 0) {
				System.out.print(i + " ");
			}
		}
	}
}

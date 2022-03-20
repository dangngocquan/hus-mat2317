package practiceClass.week06.lab04;

//Exercise 1.1

/**
 * 
 * This class is used to calculate the factorial of a number n. 
 * However, this program has a logical error and produce a wrong answer for n = 20.
 * So, this class is used to test Debugging features.
 * 
 * @author Bris
 * @version 1.0
 * @since 7:30:28 AM -  Mar 20, 2022
 */
public class Factorial {
	/**
	 * 
	 * The main method - entry point of this program.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		int n = 20;
		int factorial = 1;
		
		for (int i = 1; i <= n; i++) {
			factorial *= i; // Set an initial breakpoint at this line.
		}
		System.out.println("The Factorial of " + n + " is " + factorial);
		/*
		 * This program only produce a right answer for n <= 12. 
		 * 
		 */
	}
}

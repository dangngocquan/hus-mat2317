package practiceClass.week08.homework06;

/**
 * Exercise 1.1
 * @author Bris
 * @version 1.0
 * @since 11:59:10 PM -  Apr 4, 2022
 */
public class FactorialRecursive {
	/**
	 * Get factorial of a number
	 * @param n .
	 * @return .
	 */
	public static int factorial(int n) {
		return (n==0)? 1 : n*factorial(n-1);
	}
	
	/**
	 * The main method.
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		int n = 5;
		System.out.println("Factorial of " + n + " is " + factorial(n));
	}
}

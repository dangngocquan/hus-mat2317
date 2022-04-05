package practiceClass.week08.homework06;

/**
 * Exercise 1.2
 * @author Bris
 * @version 1.0
 * @since 12:10:24 AM -  Apr 5, 2022
 */
public class FibonacciRecursive {
	/**
	 * get fibonacii number.
	 * @param n .
	 * @return .
	 */
	public static int fibonacci(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		return fibonacci(n-1) + fibonacci(n-2);
	}
	
	/**
	 * The main method.
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		int n = 5;
		System.out.printf("fibonacci(%d) = %d", n, fibonacci(n));
	}
}

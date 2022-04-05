package practiceClass.week08.homework06;

/**
 * Exercise 3.4
 * @author Bris
 * @version 1.0
 * @since 4:41:09 PM -  Apr 5, 2022
 */
public class GreatestCommonDivisor {
	/**
	 * Get greatest common divisor.
	 * @param a .
	 * @param b .
	 * @return .
	 */
	public static int gcd(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
	
	/**
	 * The main method.
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		int firstNumber = 15;
		int secondNumber = 20;
		System.out.printf("GCD(%d, %d) = %d", firstNumber, secondNumber, gcd(firstNumber, secondNumber));
	}
}

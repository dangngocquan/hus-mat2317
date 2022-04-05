package practiceClass.week08.homework06;

/**
 * Exercise 1.4
 * @author Bris
 * @version 1.0
 * @since 12:26:19 AM -  Apr 5, 2022
 */
public class GCD {
	/**
	 * Get greatest common divisor.
	 * @param firstNumber .
	 * @param secondNumber .
	 * @return .
	 */
	public static int gcd(int firstNumber, int secondNumber) {
		if (secondNumber == 0) {
			return firstNumber;
		}
		return gcd(secondNumber, firstNumber % secondNumber);
	}
	
	/**
	 * The main method.
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		int firstNumber = 12;
		int secondNumber = 14;
		System.out.printf("GCD(%d, %d) = %d", firstNumber, secondNumber, gcd(firstNumber, secondNumber));
	}
}

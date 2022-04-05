package practiceClass.week08.homework06;

import java.util.Scanner;

/**
 * Exercise 3.3
 * @author Bris
 * @version 1.0
 * @since 4:11:46 PM -  Apr 5, 2022
 */
public class PerfectPrimeFactorList {
	/**
	 * Check prime number.
	 * @param aPosInt Unused.
	 * @return .
	 */
	public static boolean isPrime(int aPosInt) {
		if (aPosInt <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(aPosInt); i++) {
			if (aPosInt % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Check product of all prime factors.
	 * @param aPosInt .
	 * @return .
	 */
	public static boolean isProductOfPrimeFactors(int aPosInt) {
		if (aPosInt == 1) {
			return false;
		}
		int product = 1;
		for (int i = 2; i < aPosInt; i++) {
			if (aPosInt % i == 0 && isPrime(i)) {
				product *= i;
			}
		}
		return product == aPosInt;
	}
	
	/**
	 * The main method.
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the upper bound: ");
		int upperBound = scanner.nextInt();
		scanner.close();
		
		System.out.println("These numbers are equal to the product of prime factors: ");
		int counter = 0;
		for (int number = 1; number <= upperBound; number++) {
			if (isProductOfPrimeFactors(number)) {
				counter++;
				System.out.print(number + " ");
			}
		}
		System.out.printf("\n[%d numbers found (%.2f%%)]", counter, counter * 100.0 / upperBound);
	}
}

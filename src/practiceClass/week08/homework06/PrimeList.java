package practiceClass.week08.homework06;

import java.util.Scanner;

/**
 * Exercise 3.2
 * @author Bris
 * @version 1.0
 * @since 3:57:59 PM -  Apr 5, 2022
 */
public class PrimeList {
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
	 * The main method.
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the upper bound: ");
		int upperBound = scanner.nextInt();
		scanner.close();
		
		int countPrime = 0;
		for (int i = 1; i <= upperBound; i++) {
			if (isPrime(i)) {
				countPrime++;
				System.out.println(i);
			}
		}
		System.out.printf("[%d primes found (%.2f%%)]", countPrime, countPrime * 100.0 / upperBound);
	}
}

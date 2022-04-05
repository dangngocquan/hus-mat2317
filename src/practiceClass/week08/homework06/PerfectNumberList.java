package practiceClass.week08.homework06;

import java.util.Scanner;

/**
 * Exercise 3.1
 * @author Bris
 * @version 1.0
 * @since 3:30:31 PM -  Apr 5, 2022
 */
public class PerfectNumberList {
	/**
	 * Check perfect number.
	 * @param aPosInt .
	 * @return .
	 */
	public static boolean isPerfect(int aPosInt) {
		if (aPosInt == 1) {
			return false;
		}
		long sum = 1;
		for (int i = 2; i <= Math.sqrt(aPosInt); i++) {
			if (aPosInt % i == 0) {
				if (i*i == aPosInt) {
					sum += i;
				}else {
					sum += i + aPosInt/i;
				}
			}
			if (sum > aPosInt) {
				return false;
			}
		}
		return sum == aPosInt;
	}
	
	/**
	 * Check deficient number.
	 * @param aPosInt .
	 * @return .
	 */
	public static boolean isDeficient(int aPosInt) {
		if (aPosInt == 1) {
			return true;
		}
		long sum = 1;
		for (int i = 2; i <= Math.sqrt(aPosInt); i++) {
			if (aPosInt % i == 0) {
				if (i*i == aPosInt) {
					sum += i;
				}else {
					sum += i + aPosInt/i;
				}
			}
			if (sum >= aPosInt) {
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
		System.out.print("Enter the upper bound: ");
		int upperBound = scanner.nextInt();
		scanner.close();
		
		System.out.println("These numbers are perfect:");
		int countPerfectNumber = 0;
		for (int i = 1; i <= upperBound; i++) {
			if (isPerfect(i)) {
				countPerfectNumber++;
				System.out.print(i + " ");
			}
		}
		System.out.printf("\n[%d perfect numbers found (%.2f%%)]\n\n", countPerfectNumber, countPerfectNumber*100.0/upperBound);
		
		System.out.println("These numbers are neither deficient nor perfect:");
		int countNeitherDeficientNorPerfect = 0;
		for (int i = 1; i <= upperBound; i++) {
			if (!isPerfect(i) && !isDeficient(i)) {
				countNeitherDeficientNorPerfect++;
				System.out.print(i + " ");
			}
		}
		System.out.printf("\n[%d numbers found (%.2f%%)]", countNeitherDeficientNorPerfect, countNeitherDeficientNorPerfect*100.0/upperBound);
	}
}

package theoryClass.week04;

import java.util.Scanner;

//Exercise 3

/**
 * 
 * The PerfectNumber class is use to check if the number n is a perfect number or not.
 * 
 * @author <b>BrisS</b>
 * @version 1.0
 * @since 16/03/2022
 *
 */
public class PerfectNumber {
	/**
	 * 
	 * This function is to check if the number n is a perfect number or not.
	 * 
	 * @param n The number that you want to check.
	 * @return boolean Return true if n is a perfect number, and otherwise, return false if it isn't a perfect number.
	 * 
	 */
	public static boolean isPerfectNumber(long n) {
		if (n < 0) {
			return false;
		}
		long i = (long)Math.sqrt(n);
		if (n == i*i) {
			return true;
		}else {
			return false;
		}
	}
	
	/**
	 * 
	 * The main function, entry point of this app.
	 * 
	 * @param args Unused in this app.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Check perfect number.");
		System.out.print("Enter the number n = ");
		
		//n - The input number
		long n = scanner.nextLong();
		scanner.close();
		
		//Use isPerfectNumber() function
		if (isPerfectNumber(n)) {
			System.out.printf("%d is a perfect number.", n);
		}else {
			System.out.printf("%d isn't a perfect number.", n);
		}
	}
}

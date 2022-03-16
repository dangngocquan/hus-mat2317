package theoryClass.week04;

import java.util.Scanner;

//Exercise 2

/**
 * 
 * This class is to check the number n if is a prime number or not, n is the input number.
 * 
 * @author <b>BrisS</b>
 * @version 1.0
 * @since 16/03/2022
 *
 */
public class PrimeNumber {
	/**
	 * 
	 * This function is to check if the number n is a prime number or not.
	 * 
	 * @param n The number that you want to check.
	 * @return boolean Return true if n is a prime number, and otherwise, return false if n isn't a prime number.
	 * 
	 */
	public static boolean isPrime(long n) {
		if (n <= 1) {
			return false;
		}
		for (long i = 2; i <= Math.sqrt(n); i++) {
			if (n%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * 
	 * The main function, entry point of this app.
	 * 
	 * @param args Unused in this app.
	 * 
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Check prime number.");
		System.out.print("Enter the number n = ");
		
		//n - The input number.
		long n = scanner.nextLong();
		scanner.close();
		
		//Use isPrime() function.
		if (isPrime(n)) {
			System.out.printf("%d is a prime number.", n);
		}else {
			System.out.printf("%d isn't a prime number.", n);
		}
	}
}

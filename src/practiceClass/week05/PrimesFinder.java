package practiceClass.week05;

import java.util.Arrays;
import java.util.Scanner;

//Exercise 1.7

/**
 * 
 * This class is used to get the number of the prime numbers which is less than or equal to n, n is the input number.
 * 
 * @author Bris
 * @version 1.0
 * @since 11:48:12 PM Mar 16, 2022
 */
public class PrimesFinder {
	/**
	 * 
	 * This method is used to get the number of the prime numbers which is less than or equal to "number".
	 * 
	 * @param number We will get the number of the prime numbers which is less than or equal to "number".
	 * @return Return a Integer data type - the number of the prime numbers which is less than or equal to "number".
	 */
	public static int getNumberOfPrimesLessThanOrEqual(int number) {
		if (number <= 1) {
			return 0;
		}
		
		//counter - the number of the prime numbers which is less than or equal to "number".
		int counter = 0;
		
		// i will be a prime number if isPrime[i] == true.
		// Otherwise, i will be not a prime number if isPrime[i] == false.
		boolean[] isPrime = new boolean[number+1];
		Arrays.fill(isPrime, true);
		
		// 0 and 1 aren't prime numbers.
		isPrime[0] = false;
		isPrime[1] = false;
		
		for (int i = 2; i <= number; i++) {
			if (isPrime[i]) {
				counter++;
				
				// j will not a prime number if j is divided by i, so isPrime[j] := false
				for (int j = 2*i; j <= number; j += i) isPrime[j] = false;
			}
		}
		return counter;
	}
	
	/**
	 * 
	 * The main method - entry point of this app.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a number: ");
		
		//number - The input number.
		int number = scanner.nextInt();
		scanner.close();
		
		//Print out the result
		System.out.printf("Number of prime numbers which are less than or equal to %d: %d", number, getNumberOfPrimesLessThanOrEqual(number));
	}
}

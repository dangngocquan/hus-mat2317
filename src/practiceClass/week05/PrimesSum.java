package practiceClass.week05;

import java.util.Arrays;
import java.util.Scanner;

//Exercise 1.8

/**
 * 
 * This class is used to get the sum of the n-first prime numbers, n is the input number and n is less than or equals to 10000.
 * 
 * @author Bris
 * @version 1.0
 * @since 12:03:52 AM Mar 17, 2022
 */
public class PrimesSum {
	/**
	 * 
	 * This method is used to get sum of n-first prime numbers.
	 * 
	 * @param n We will get sum of n-first prime numbers.
	 * @return Return a Long data type - the sum of n-first prime numbers.
	 */
	public static long getPrimesSum(int n) {
		//sum - The sum of n-first prime numbers.
		long sum = 0;
		
		// i will be a prime number if isPrime[i] == true.
		// Otherwise, i will be not a prime number if isPrime[i] == false.
		boolean[] isPrime = new boolean[110000];
		Arrays.fill(isPrime, true);
		
		// 0 and 1 aren't prime numbers.
		isPrime[0] = false;
		isPrime[1] = false;
		
		for (int i = 2; i < 110000; i++) {
			if (isPrime[i]) {
				sum += (long)i;
				n--;
				
				//We only get sum of n-first prime number. So, if n == 0, the loops should be stopped.
				if (n == 0) {
					break;
				}
				
				//j will be not a prime number if j is divided by i, so isPrime[j] := false
				for (int j = 2*i; j < 110000; j += i) isPrime[j] = false;
			}
		}
		return sum;
	}
	
	/**
	 * 
	 * The main method - entry point of this app.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a number (n <= 10000) to compute the sum: ");
		
		//number - The input number
		int number = scanner.nextInt();
		scanner.close();
		
		//Print out the result.
		System.out.printf("Sum of first %d prime numbers: %d", number, getPrimesSum(number));
	}
}

package practiceClass.week05;

import java.util.Scanner;

//Exercise 1.6

/**
 * 
 * This class is used to check the input number if it is a prime number or not.
 * 
 * @author Bris
 * @version 1.0
 * @since 10:32:03 PM Mar 16, 2022
 */
public class CheckPrimeNumber {
	/**
	 * 
	 * This function is used to check the number "number" if it is a prime number or not.
	 * 
	 * @param number The number which you want to check
	 * @return Return true if "number" is a prime number. Otherwise, return false if it isn't a prime number.
	 */
	public static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * 
	 * This function is used to get the position of the number "number".
	 * Example: The position of 2 is 1, 3 is 2, 5 is 3, 7 is 4, ...
	 * 
	 * @param number The number which you want to get the position.
	 * @return Return a Integer data type - the position of "number".
	 */
	public static int getPrimePosition(int number) {
		if (!isPrime(number)) {
			return 0;
		}
		int counter = 0;
		for (int i = 2; i <= number; i++) {
			if (isPrime(i)) {
				counter++;
			}
		}
		return counter;
	}
	
	/**
	 * 
	 * The main function - entry point of this app.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a number: ");
		
		//number - The input number
		int number = scanner.nextInt();
		scanner.close();
		
		//Print out the result
		System.out.println("The given number is a prime number: " + isPrime(number));
		System.out.println("Position of the said prime number: " + getPrimePosition(number));
	}
}

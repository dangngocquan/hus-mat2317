package theoryClass.week0506.submit;

import java.util.Scanner;

/**
 * 
 * This program is used to find and print out all prime number in the input array.
 * 
 * @author Bris
 * @version 1.0
 * @since 10:34:51 AM -  Mar 27, 2022
 */
public class Example01 {
	/**
	 * 
	 * This method is used to check a number if it is a prime number or not.
	 * 
	 * @param number is the number which you want to check.
	 * @return Return true if it is a prime number.
	 * Return false if otherwise.
	 */
	public static boolean isPrime(int number) {
		if (number < 2) {
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
	 * This method is used to print the elements which is a prime number in array.
	 * 
	 * @param array is a integer array.
	 */
	public static void printPrimeNumbers(int[] array) {
		for (int element : array) {
			if (isPrime(element)) {
				System.out.printf("%4d",element);
			}
		}
	}
	
	/**
	 * 
	 * The main method - entry point of this program.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a positive number n - the length of array a: ");
		int n = scanner.nextInt();
		int[] a = new int[n];
		for (int index = 0; index < n; index++) {
			System.out.printf("a[%d] = ", index);
			a[index] = scanner.nextInt();
		}
		scanner.close();
		
		System.out.println("Prime numbers in the array a is: ");
		printPrimeNumbers(a);
	}
}

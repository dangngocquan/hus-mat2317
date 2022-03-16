package practiceClass.week05;

import java.util.Scanner;

//Exercise 1.11

/**
 * 
 * This class is used to check the input number if it is a perfect square number or not.
 * 
 * @author Bris
 * @version 1.0
 * @since 10:27:16 PM Mar 16, 2022
 */
public class CheckPerfectSquareNumber {
	/**
	 * 
	 * This function is used to check the number n if it is a perfect square number or not.
	 * 
	 * @param n The number which you want to check.
	 * @return Return true if n is a perfect square number. Otherwise, return false if n isn't a perfect square number.
	 */
	public static boolean isPerfectSquareNumber(int n) {
		int i = (int)Math.sqrt(n);
		return i*i == n;
	}
	
	/**
	 * 
	 * The main function, entry point of this app.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a positive integer: ");
		
		//number - The input number
		int number = scanner.nextInt();
		scanner.close();
		
		//Print out the result
		System.out.println("Is the said number perfect square? " + isPerfectSquareNumber(number));
	}
}

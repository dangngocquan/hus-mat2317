package practiceClass.week05;

import java.util.Scanner;

//Exercise 1.9

/**
 * 
 * This class is used to check the input number if it is a palindrome number or not.
 * 
 * @author Bris
 * @version 1.0
 * @since 10:25:11 PM Mar 16, 2022
 * 
 */
public class CheckPalindrome {
	/**
	 * 
	 * This function is used to get the reverse number of the number "number".
	 * 
	 * @param number This is the number that you want to get the reverse number of it.
	 * @return Return a long data type which is the reverse number of "number".
	 * 
	 */
	public static long getReverseNumber(long number) {
		long reverseNumber = 0;
		while (number > 0) {
			reverseNumber = reverseNumber*10 + (number % 10);
			number /= 10;
		}
		return reverseNumber;
	}
	
	/**
	 * 
	 * This is main function, entry point of this app.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a positive integer: ");
		
		//number - The input number
		long number = scanner.nextLong();
		scanner.close();
		
		//Print out the result
		System.out.printf("Is %d a palindrome number?\n", number);
		System.out.println(number == getReverseNumber(number));
	}
}

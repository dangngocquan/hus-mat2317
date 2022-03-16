package theoryClass.week04;

import java.util.Scanner;

//Exercise 4

/**
 * 
 * The <b>Palindrome</b> class is the class that help to check if a number n is a palindrome number or not, n is the input value
 * 
 * @author <b>BrisS</b>
 * @version 1.0
 * @since 16/03/2022
 *
 */
public class Palindrome {
	/**
	 * 
	 * This function is to check if a number is a palindrome number or not.
	 * 
	 * @param n The number that you want to check if it is a palindrome number or not.
	 * @return Return true if n is a palindrome, and otherwise, return false if n is not a palindrome number.
	 * 
	 */
	static boolean isPalindromeNumber(String n) {
		int size = n.length();
		for (int i = 0; i <= size/2; i++) {
			if (n.charAt(i) != n.charAt(size - 1 - i)) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * 
	 * The main function, retry point of this app
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Check palindrome number.");
		System.out.print("Enter the number n = ");
		
		//n - The input number as String data type.
		String n = scanner.next();
		scanner.close();
		
		// Use isPalindromeNumber() function
		if (isPalindromeNumber(n)) {
			System.out.printf("%s is a palindrome number.", n);
		}else {
			System.out.printf("%s isn't a palindrome number.", n);
		}
	}
}

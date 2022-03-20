package practiceClass.week06.homework04;

import java.util.Scanner;

//Exercise 2.7.0

/**
 * 
 * This program is used to check the input string is it is a palindrome word or not.
 * 
 * @author Bris
 * @version 1.0
 * @since 8:49:16 PM -  Mar 20, 2022
 */
public class TestPalindromicWord {
	/**
	 * 
	 * This method is used to get the reverse string of string s.
	 * 
	 * @param s is the string which you want to get the reverse.
	 * @return Return the reverse of string s.
	 */
	public static String getReverseString(String s) {
		String reverse = "";
		for (int index = 0; index < s.length(); index++) {
			reverse = s.charAt(index) + reverse;
		}
		return reverse;
	}
	
	/**
	 * 
	 * The main method - entry point of this program.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String string  = scanner.next();
		scanner.close();
		
		String string1 = string.toLowerCase();
		if (string1.equals(getReverseString(string1))) {
			System.out.printf("\"%s\" is a palindrome.", string);
		}else {
			System.out.printf("\"%s\" is not a palindrome.", string);
		}
	}
}

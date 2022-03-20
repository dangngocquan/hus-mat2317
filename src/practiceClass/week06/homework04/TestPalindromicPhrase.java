package practiceClass.week06.homework04;

import java.util.Scanner;

//Exercise 2.7.1

/**
 * 
 * This program is used to check the input string is it is a palindrome phrase or not.
 * 
 * @author Bris
 * @version 1.0
 * @since 9:00:24 PM -  Mar 20, 2022
 */
public class TestPalindromicPhrase {
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
		System.out.print("Enter a phrase: ");
		String phrase = scanner.nextLine();
		scanner.close();
		
		String string = "";
		for (int index = 0; index < phrase.length(); index++) {
			char ch = phrase.toLowerCase().charAt(index);
			if (('a' <= ch && ch <= 'z') || ('0' <= ch && ch <= '9')) {
				string += ch;
			}
		}
		
		if (string.equals(getReverseString(string))) {
			System.out.printf("\"%s\" is a palindromic phrase", phrase);
		}else {
			System.out.printf("\"%s\" is not a palindromic phrase", phrase);
		}
	}
}

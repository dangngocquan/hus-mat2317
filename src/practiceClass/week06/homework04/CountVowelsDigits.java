package practiceClass.week06.homework04;

import java.util.Scanner;

//Exercise 2.2

/**
 * 
 * This program prompts user for a String, counts the number of vowels and digits
 * contained in the string, and print the counts and the percentages (rounded to 2 decimal places).
 * 
 * @author Bris
 * @version 1.0
 * @since 6:07:48 PM -  Mar 20, 2022
 */
public class CountVowelsDigits {
	/**
	 * 
	 * This method is used to check if character c is a vowel character or not.
	 * 
	 * @param c is the character which you want to check.
	 * @return Return true if c is a vowel character.
	 * Return false if otherwise.
	 */
	public static boolean isVowelCharacter(char c) {
		switch (c) {
		case 'u':
		case 'e':
		case 'o':
		case 'a':
		case 'i':
			return true;
		default:
			return false;
		}
	}
	
	/**
	 * 
	 * This method is used to get the number of vowel character in the string s.
	 * 
	 * @param s is the string which you want to check.
	 * @return Return the number of vowel character in the string s.
	 */
	public static int getCountOfVowels(String s) {
		int counter = 0;
		for (int index = 0; index < s.length(); index++) {
			if (isVowelCharacter(s.charAt(index))) {
				counter++;
			}
		}
		return counter;
	}
	
	/**
	 * 
	 * This method is used to check if character c is a digit character or not.
	 * 
	 * @param c is the character which you want to check.
	 * @return Return true if c is a digit character.
	 * Return false if otherwise.
	 */
	public static boolean isDigitCharacter(char c) {
		return c >= '0' && c <= '9';
	}
	
	/**
	 * 
	 * This method is used to get the number of digit character in the string s.
	 * 
	 * @param s is the string which you want to check.
	 * @return Return the number of digit character in the string s.
	 */
	public static int getCountOfDigits(String s) {
		int counter = 0;
		for (int index = 0; index < s.length(); index++) {
			if (isDigitCharacter(s.charAt(index))) {
				counter++;
			}
		}
		return counter;
	}
	
	/**
	 * 
	 * The main method - entry point of this program.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String string = scanner.next().toLowerCase();
		scanner.close();
		
		int length = string.length();
		int numberVowels = getCountOfVowels(string);
		int numberDigits = getCountOfDigits(string);
		
		System.out.printf("Number of vowels: %d (%.2f%%)\n", numberVowels, numberVowels*100.0/length);
		System.out.printf("Number of digits: %d (%.2f%%)\n", numberDigits, numberDigits*100.0/length);
	}
}

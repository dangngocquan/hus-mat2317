package practiceClass.week06.homework04;

import java.util.Scanner;

//Exercise 2.1

/**
 * 
 * This program prompts user for a string, and prints the reverse of the String by 
 * extracting and processing each character
 * 
 * @author Bris
 * @version 1.0
 * @since 5:56:49 PM -  Mar 20, 2022
 */
public class ReverseString {
	/**
	 * 
	 * This method is used to get the reverse of the String 'string'.
	 * 
	 * @param string is a String which you want to get the reverse.
	 * @return Return a String - the reverse of 'string'.
	 */
	public static String getReverseString(String string) {
		String reverseString = "";
		for (int index = string.length()-1; index >= 0; index--) {
			reverseString += string.charAt(index);
		}
		return reverseString;
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
		String string = scanner.next();
		scanner.close();
		
		System.out.printf("The reverse of the String \"%s\" is \"%s\".", string, getReverseString(string));
	}
}

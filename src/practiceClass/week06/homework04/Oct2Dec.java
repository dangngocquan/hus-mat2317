package practiceClass.week06.homework04;

import java.util.Scanner;

//Exercise 2.11

/**
 * 
 * This program is used to convert an input octal string
 * into its equivalent decimal number.
 * 
 * @author Bris
 * @version 1.0
 * @since 9:53:45 PM -  Mar 20, 2022
 */
public class Oct2Dec {
	/**
	 * 
	 * This method is used to check the string s if it is a octal string or not.
	 * 
	 * @param s is the string which you want to check.
	 * @return Return true if s is a octal string.
	 * Return false if otherwise.
	 */
	public static boolean isValidInput(String s) {
		for (int index = 0; index < s.length(); index++) {
			char ch = s.charAt(index);
			if (!('0' <= ch && ch <= '7')) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * 
	 * This method is used to convert octal string to decimal.
	 * 
	 * @param s is the octal string.
	 * @return Return the decimal number.
	 */
	public static long convertOct2Dec(String s) {
		long number = 0;
		for (int index = 0; index < s.length(); index++) {
			char ch = s.charAt(index);
			int x = ch - '0';
			number = 8*number + x;
		}
		return number;
	}
	
	/**
	 * 
	 * The main method - entry point of this program.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a Octal string: ");
		String octString = scanner.next();
		scanner.close();
		
		if (!isValidInput(octString)) {
			System.out.printf("Error: invalid octal string \"%s\"", octString);
		}else {
			System.out.printf("The equivalent decimal number for octal \"%s\" is %d", octString, convertOct2Dec(octString));
		}
	}
}

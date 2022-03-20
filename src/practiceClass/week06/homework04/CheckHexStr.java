package practiceClass.week06.homework04;

import java.util.Scanner;

//Exercise 2.8

/**
 * 
 * This program is used to verify a hex string.
 * 
 * @author Bris
 * @version 1.0
 * @since 9:10:16 PM -  Mar 20, 2022
 */
public class CheckHexStr {
	/**
	 * 
	 * This method is used to check the number s if it is a hex string or not.
	 * 
	 * @param s is the string which you want to check.
	 * @return Return true if the string s is a hex string.
	 * Return false if otherwise.
	 */
	public static boolean isValidHexStr(String s) {
		for (int index = 0; index < s.length(); index++) {
			char ch = s.charAt(index);
			if (!(('0' <= ch && ch <= '9') || ('a' <= ch && ch <= 'f') || ('A' <= ch && ch <= 'F'))) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * 
	 * The main method - entry point of this program.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a hex string: ");
		String string = scanner.next();
		scanner.close();
		
		if (isValidHexStr(string)) {
			System.out.printf("\"%s\" is a hex string", string);
		} else {
			System.out.printf("\"%s\" is NOT a hex string", string);
		}
	}
}

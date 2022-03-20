package practiceClass.week06.homework04;

import java.util.Scanner;

//Exercise 2.10

/**
 * 
 * This program is used to convert an input hexadecimal string
 * into its equivalent decimal number.
 * 
 * @author Bris
 * @version 1.0
 * @since 9:44:11 PM -  Mar 20, 2022
 */
public class Hex2Dec {
	/**
	 * 
	 * This method is used to check the string s if it is a hexadecimal string or not.
	 * 
	 * @param s is the string which you want to check.
	 * @return Return true if s is a hexadecimal string.
	 * Return false if otherwise.
	 */
	public static boolean isValidInput(String s) {
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
	 * This method is used to convert hexadecimal string to decimal.
	 * 
	 * @param s is the hexadecimal string.
	 * @return Return the decimal number.
	 */
	public static long convertHex2Dec(String s) {
		long number = 0;
		for (int index = 0; index < s.length(); index++) {
			char ch = s.toUpperCase().charAt(index);
			int x;
			if ('0' <= ch && ch <= '9') {
				x = ch - '0';
			}else {
				x = 10 + ch - 'A';
			}
			number = 16*number + x;
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
		System.out.print("Enter a Hexdecimal string: ");
		String hexString = scanner.next();
		scanner.close();
		
		if (!isValidInput(hexString)) {
			System.out.printf("Error: invalid hexadecimal string \"%s\"", hexString);
		}else {
			System.out.printf("The equivalent decimal number for hexadecimal \"%s\" is %d", hexString, convertHex2Dec(hexString));
		}
	}
}

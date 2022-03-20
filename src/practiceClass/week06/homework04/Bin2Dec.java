package practiceClass.week06.homework04;

import java.util.Scanner;

//Exercise 2.9

/**
 * 
 * This program is used to convert an input binary string
 * into its equivalent decimal number.
 * 
 * @author Bris
 * @version 1.0
 * @since 9:24:01 PM -  Mar 20, 2022
 */
public class Bin2Dec {
	/**
	 * 
	 * This method is used to check the string s if it is a binary string or not.
	 * 
	 * @param s is the string which you want to check.
	 * @return Return true if s is a binary string.
	 * Return false if otherwise.
	 */
	public static boolean isValidInput(String s) {
		for (int index = 0; index < s.length(); index++) {
			if (s.charAt(index) != '0' && s.charAt(index) != '1') {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * 
	 * This method is used to convert binary string to decimal.
	 * 
	 * @param s is the binary string.
	 * @return Return the decimal number.
	 */
	public static long convertBin2Dec(String s) {
		long number = 0;
		for (int index = 0; index < s.length(); index++) {
			int x = s.charAt(index) - '0';
			number = 2*number + x;
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
		System.out.print("Enter a Binary string: ");
		String binaryString = scanner.next();
		scanner.close();
		
		if (!isValidInput(binaryString)) {
			System.out.printf("Error: invalid binary string \"%s\"", binaryString);
		}else {
			System.out.printf("The equivalent decimal number for binary \"%s\" is %d", binaryString, convertBin2Dec(binaryString));
		}
		
	}
}

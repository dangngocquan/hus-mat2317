package practiceClass.week06.arrayAndMethod01;

import java.util.Scanner;

//Exercise 1.4

/**
 * 
 * This program prompts user for a hexadecimal string and print its equivalent
 * binary string.
 * 
 * @author Bris
 * @version 1.0
 * @since 2:07:09 PM -  Mar 28, 2022
 */
public class Hex2Bin {
	/**
	 * 
	 * The main method - entry point of this program. 
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a Hexadecimal string: ");
		String hexaDecimal = scanner.next();
		scanner.close();
		
		System.out.printf("The equivalent binary for hexadecimal \"%s\" is: ", hexaDecimal);
		final String[] HEX_BITS = {
				"0000", "0001", "0010", "0011",
				"0100", "0101", "0110", "0111",
				"1000", "1001", "1010", "1011",
				"1100", "1101", "1110", "1111"
		};
		for (int i = 0; i < hexaDecimal.length(); i++) {
			char ch = hexaDecimal.toUpperCase().charAt(i);
			int value;
			if (ch >= '0' && ch <= '9') {
				value = ch - '0';
			}else {
				value = 10 + ch - 'A';
			}
			
			System.out.printf("%s ", HEX_BITS[value]);
		}
	}
}

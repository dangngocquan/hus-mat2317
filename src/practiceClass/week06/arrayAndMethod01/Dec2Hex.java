package practiceClass.week06.arrayAndMethod01;

import java.util.Scanner;

//Exercise 1.5

/**
 * 
 * This program prompts user for a positive decimal number, read as int, and
 * print its equivalent hexadecimal string.
 * 
 * @author Bris
 * @version 1.0
 * @since 2:24:22 PM -  Mar 28, 2022
 */
public class Dec2Hex {
	/**
	 * 
	 * This method is used to covert Decimal to HexaDecimal.
	 * 
	 * @param decimal is the decimal number which you want  convert to hexadecimal string.
	 * @return Return hexadecimal string.
	 */
	public static String getDec2Hex(int decimal) {
		String hexadecimal = "";
		while (decimal > 0) {
			int mod = decimal % 16;
			if (0 <= mod && mod <= 9) {
				hexadecimal = mod + hexadecimal;
			}else {
				hexadecimal = (char)('A' + mod - 10) + hexadecimal;
			}
			decimal /= 16;
		}
		return hexadecimal;
	}
	
	/**
	 * 
	 * The main method - entry point of this program.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a decimal number: ");
		int decimal = scanner.nextInt();
		scanner.close();
		
		System.out.print("The equivalent hexadecimal number is " + getDec2Hex(decimal));
		
	}
}

package practiceClass.week06.homework04;

import java.util.Scanner;

//Exercise 2.4

/**
 * 
 * This program prompt user for a plaintext string consisting of mix-case
 * letter only. compute the ciphertext, and print the ciphertext in uppercase. 
 * 
 * @author Bris
 * @version 1.0
 * @since 8:24:08 PM -  Mar 20, 2022
 */
public class CaesarCode {
	/**
	 * 
	 * The main method - entry point of this program.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a plaintext string: ");
		String string = scanner.next().toUpperCase();
		scanner.close();
		
		System.out.print("The ciphertext string is: ");
		for (int index = 0; index < string.length(); index++) {
			char ch = string.charAt(index);
			if (ch >= 'X') {
				System.out.print((char)('A' + ch - 'X'));
			}else {
				System.out.print((char)(ch + 3));
			}
		}
	}
}

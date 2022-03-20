package practiceClass.week06.homework04;

import java.util.Scanner;

//Exercise 2.5

/**
 * 
 * This program is used to decipher the Caesar's code described in the previous exercise.
 * 
 * @author Bris
 * @version 1.0
 * @since 8:34:11 PM -  Mar 20, 2022
 */
public class DecipherCaesarCode {
	/**
	 * 
	 * The main method - entry point of this program.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a ciphertext string: ");
		String ciphertext = scanner.next().toUpperCase();
		scanner.close();
		
		System.out.print("The plaintext string is: ");
		for(int index = 0; index < ciphertext.length(); index++) {
			char ch = ciphertext.charAt(index);
			if (ch <= 'C') {
				System.out.print((char)('Z' - ('C' - ch)));
			}else {
				System.out.print((char)(ch - 3));
			}
		}
	}
}

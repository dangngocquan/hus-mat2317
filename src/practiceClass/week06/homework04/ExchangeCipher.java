package practiceClass.week06.homework04;

import java.util.Scanner;

//Exercise 2.6

/**
 * 
 * This program shall compute the ciphertext, and print out it.
 * 
 * @author Bris
 * @version 1.0
 * @since 8:42:41 PM -  Mar 20, 2022
 */
public class ExchangeCipher {
	/**
	 * 
	 * The main method - entry point of this program.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a plaintext string: ");
		String plaintext = scanner.next().toUpperCase();
		scanner.close();
		
		System.out.print("The ciphertext string is: ");
		int sum = 'A' + 'Z';
		for (int index = 0; index < plaintext.length(); index++) {
			char ch = plaintext.charAt(index);
			System.out.print((char)(sum - ch));
		}
	}
}

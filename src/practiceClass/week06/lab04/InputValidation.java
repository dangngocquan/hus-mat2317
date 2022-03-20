package practiceClass.week06.lab04;

import java.util.Scanner;

//Exercise 2.7

/**
 * 
 * This program is used to validate the user's input.
 * 
 * @author Bris
 * @version 1.0
 * @since 12:02:38 PM -  Mar 20, 2022
 */
public class InputValidation {
	/**
	 * 
	 * This method is used to check if the number n in range [0-10] or [90-100] or not.
	 * 
	 * @param n is a number in range [0-100].
	 * @return Return true if n in range [0-10] or [90-100].
	 * Return false if otherwise.
	 */
	public static boolean isValid(int n) {
		return (0 <= n && n <= 10) || (90 <= n && n <= 100);
	}
	
	/**
	 * 
	 * The main method - entry point of this program.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		do {
			System.out.print("Enter a number between 0-10 or 90-100: ");
			n = scanner.nextInt();
			if (isValid(n)) {
				System.out.println("You have entered: " + n);
			}else {
				System.out.println("Invalid input, try again...");
			}
		} while (!isValid(n));
		scanner.close();
	}
}

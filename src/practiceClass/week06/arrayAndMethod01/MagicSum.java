package practiceClass.week06.arrayAndMethod01;

import java.util.Scanner;

//Exercise 2.2

/**
 * 
 * This program prompts user for integers (or -1 to end), and produce the
 * sum of numbers containing the digit 8.
 * 
 * @author Bris
 * @version 1.0
 * @since 3:01:57 PM -  Mar 28, 2022
 */
public class MagicSum {
	/**
	 * 
	 * This method is used to check a number if it contains the digit 8 or not.
	 * 
	 * @param number is a number which you want to check.
	 * @return Return true if this number contains the digit 8.
	 */
	public static boolean hasEight(int number) {
		while (number > 0) {
			int mod = number % 10;
			if (mod == 8) {
				return true;
			}
			number /= 10;
		}
		return false;
	}
	
	/**
	 * 
	 * The main method - entry point of this program.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number;
		int sum = 0;
		do {
			System.out.print("Enter a positive integer (or -1 to end): ");
			number = scanner.nextInt();
			if (hasEight(number)) {
				sum += number;
			}
		}while (number != -1);
		scanner.close();
		
		System.out.println("The magic sum is: " + sum);
	}
}

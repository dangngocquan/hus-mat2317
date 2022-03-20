package practiceClass.week06.lab04;

import java.util.Scanner;

//Exercise 2.5

/**
 * 
 * This program is used to extract each digit from an int, in the reverse order.
 * For example, if the int is 15423, the output shall be "3 2 4 5 1", with a space
 * separating the digits.
 * 
 * @author Bris
 * @version 1.0
 * @since 11:45:37 AM -  Mar 20, 2022
 */
public class ExtractDigits {
	/**
	 * 
	 * This method is used to print out each digit of the number n, in the reverse order.
	 * 
	 * @param n is the number which you want to solve.
	 */
	public static void printExtractDigits(int n) {
		System.out.print("Each digit of int " + n + " in the reverse order: " );
		while (n > 0) {
			System.out.print(n%10 + " ");
			n /= 10;
		}
	}
	
	/**
	 * 
	 * The main method - entry point of this program.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a number : ");
		int n = scanner.nextInt();
		scanner.close();
		
		printExtractDigits(n);
	}
}

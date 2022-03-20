package practiceClass.week06.lab04;

import java.util.Scanner;

//Exercise 2.6

/**
 * 
 * This program is used to print out a input positive number in the reverse order.
 * 
 * @author Bris
 * @version 1.0
 * @since 11:56:50 AM -  Mar 20, 2022
 */
public class ReverseInt {
	/**
	 * 
	 * This method is used to print out the positive number n in the reverse order.
	 * 
	 * @param n is the number which you want to solve.
	 */
	public static void printReverseInteger(int n) {
		System.out.print("The reverse is: " );
		while (n > 0) {
			System.out.print(n%10);
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
		System.out.print("Enter a positive integer: ");
		int n = scanner.nextInt();
		scanner.close();
		
		printReverseInteger(n);
	}
}

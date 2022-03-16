package practiceClass.week05;

import java.util.Scanner;

//Exercise 1.14

/**
 * 
 * This class is used to get sum of the input numbers until the input number is negative number.
 * 
 * @author Bris
 * @version 1.0
 * @since 12:19:44 AM Mar 17, 2022
 */
public class UserInputSum {
	/**
	 * 
	 * The main method - entry point of this app.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//number - The input number from keyboard.
		double number = 0.0;
		
		//sum - The sum of input numbers.
		double sum = 0.0;
		
		do {
			System.out.print("Enter a number: ");
			number = scanner.nextDouble();
			if (number >= 0) {
				sum += number;
			}
		} while (number >= 0);
		scanner.close();
		
		//Print out the result
		System.out.println("Sum = " + sum);
	}
}

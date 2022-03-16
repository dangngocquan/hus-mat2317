package practiceClass.week05;

import java.util.Scanner;

//Exercise 1.15

/**
 * 
 * This class allows to enter five input numbers from keyboard,
 * then print out the sum of all positive numbers of them.
 * 
 * @author Bris
 * @version 1.0
 * @since 11:40:19 PM Mar 16, 2022
 */
public class PositiveNumbersSum {
	/**
	 * 
	 * The main method - entry point of this app.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//sum - The sum of all positive numbers.
		double sum = 0.0;
		
		//Calculate sum
		for (int i = 1; i <= 5; i++) {
			System.out.printf("Enter number %d: ", i);
			
			//x - The input number
			double x = scanner.nextDouble();
			if (x >= 0) sum += x;
		}
		scanner.close();
		
		//Print out the result.
		System.out.println("Sum = " + sum);
	}
}

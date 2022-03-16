package practiceClass.week05;

import java.util.Scanner;

//Exercise 1.10

/**
 * 
 * This class is used to get the greatest common divisor of two input numbers.
 * 
 * @author Bris
 * @version 1.0
 * @since 10:51:43 PM Mar 16, 2022
 */
public class GreatestCommonDivisor {
	/**
	 * 
	 * This function is used to get the greatest common divisor of two numbers: n1 and n2.
	 * Note: This is a bad algorithm.
	 * 
	 * @param n1 The first number.
	 * @param n2 The second number.
	 * @return Return a Integer data type - the greatest common divisor of n1 and n2.
	 */
	public static int euclid(int n1, int n2) {
		while (n1 != n2) {
			if (n1 > n2) {
				n1 -= n2;
			}else {
				n2 -= n1;
			}
		}
		return n1;
	}
	
	/**
	 * 
	 * The main method - entry point of this app.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the first number: ");
		
		//firstNumber - The first input number.
		int firstNumber = scanner.nextInt();
		
		System.out.print("Input the second number: ");
		
		//secondNumber - The second input number.
		int secondNumber = scanner.nextInt();
		scanner.close();
		
		// Print out the result.
		System.out.printf("Greatest common divisor of two number is: %d", euclid(firstNumber, secondNumber));
	}
}

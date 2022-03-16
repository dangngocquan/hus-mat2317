package practiceClass.week05;

import java.util.Scanner;

//Exercise 1.4

/**
 * 
 * This class is used to print out the numbers in range [a, b] which is divided by c.
 * a, b, c are three input numbers from keyboard.
 * 
 * @author Bris
 * @version 1.0
 * @since 11:33:30 PM Mar 16, 2022
 */
public class NumbersInAIntervalPrinter {
	/**
	 * 
	 * The main method - entry point of this app.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input first number: ");
		
		//firstNumber - The first input number.
		int firstNumber = scanner.nextInt();
		
		System.out.print("Input second number: ");
		
		//secondNumber - The second inpu number
		int secondNumber = scanner.nextInt();
		
		System.out.print("Input third number: ");
		
		//thirdNumber - The third input number
		int thirdNumber = scanner.nextInt();
		scanner.close();
		
		//counter - The number of x, where i in range [firstNumber, secondNumber] and x is divided by thirdNumber.
		int counter = 0;
		System.out.printf("The numbers are divible by %d: ", thirdNumber);
		for (int i = firstNumber; i <= secondNumber; i++) {
			if (i % thirdNumber == 0) {
				counter++;
				System.out.print(i + " ");
			}
		}
		
		//Print out the result.
		System.out.printf("\nThere are %d numbers are divible by %d.", counter, thirdNumber);
	}
}

package practiceClass.week05;

import java.util.Scanner;

//Exercise 1.2

/**
 * 
 * This class is used to get a random number inb range [a, b], a, b are two input numbers from keyboard.
 * 
 * @author Bris
 * @version 1.0
 * @since 12:15:02 AM Mar 17, 2022
 */
public class RandomGenerator {
	/**
	 * 
	 * The main method - entry point of this app.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the starting number of the range: ");
		
		//startingNumber - The start number of the range.
		int startingNumber = scanner.nextInt();
		
		System.out.print("Input the ending number of the range: ");
		
		//endingNumber - The end number of the range.
		int endingNumber = scanner.nextInt();
		scanner.close();
		
		//randomNumber - The random number in range [startingNumber, endingNumber]
		int randomNumber = (int)Math.floor(Math.random()*(endingNumber-startingNumber) + startingNumber);
		
		//Print out the result
		System.out.print("Generated number: " + randomNumber);
	}
}

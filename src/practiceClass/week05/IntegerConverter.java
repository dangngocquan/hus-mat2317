package practiceClass.week05;

import java.util.Scanner;

//Exercise 1.1

/**
 * 
 * This class is used to convert the input String data type to the Integer data type.
 * 
 * @author Bris
 * @version 1.0
 * @since 11:11:02 PM Mar 16, 2022
 */
public class IntegerConverter {
	/**
	 * 
	 * The main method - entry point of this app.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a number (string): ");
		
		// stringNumber - The input String which you want to convert to Integer data type.
		String stringNumber = scanner.nextLine();
		scanner.close();
		
		//number - the Integer data type of stringNumber
		int number = Integer.parseInt(stringNumber);
		
		//Print out the result.
		System.out.printf("The integer value is: %d", number);
	}
}

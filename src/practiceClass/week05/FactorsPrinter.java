package practiceClass.week05;

import java.util.Scanner;

//Exercise 1.5

/**
 * 
 * This class is used to get the number of the factors of the input number.
 * 
 * @author Bris
 * @version 1.0
 * @since 10:46:52 PM Mar 16, 2022
 */
public class FactorsPrinter {
	/**
	 * 
	 * This function is used to get the number of the factors of the number "number".
	 * 
	 * @param number The number which you want to get the number of the factors.
	 * @return Return a Integer data type - the number of the factors of the number "number".
	 */
	public static int countFactors(int number) {
		int counter = 0;
		for (int i = 1; i <= Math.sqrt(number); i++) {
			if (number % i == 0 && i*i != number) {
				counter += 2;
			}else if (i*i == number) {
				counter++;
			}
		}
		return counter;
	}
	
	/**
	 * 
	 * The main method - entry point of this app.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input an integer: ");
		
		//number - The input number
		int number = scanner.nextInt();
		scanner.close();
		
		//Print out the result
		System.out.printf("Number of the factors are: %d", countFactors(number));
	}
}

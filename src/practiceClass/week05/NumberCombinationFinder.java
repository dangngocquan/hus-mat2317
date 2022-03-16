package practiceClass.week05;

import java.util.Scanner;

//Exercise 1.12 , There are some problems with the question.

/**
 * 
 * This class is used to print all combinations (a, b, c) where a, b, c greater than 0 and a + b + c = n, n is the input number.
 * Then, print out the number of the combinations.
 * 
 * @author Bris
 * @version 1.0
 * @since 11:15:09 PM Mar 16, 2022
 */
public class NumberCombinationFinder {
	/**
	 * 
	 * This function is used to print all combinations (a, b, c) where a, b, c greater than 0 and a + b + c = n, n is the input number.
	 * Then, print out the number of the combinations.
	 * 
	 * @param n The number which you want to find the combinations (a, b, c) where a, b, c greater than 0 and a + b + c = n.
	 */
	public static void findCombinations(int n) {
		int counter = 0;
		System.out.print("Combinations of a, b, c: ");
		for (int a = 1; a < n; a++) {
			for (int b = 1; b < n-a; b++) {
				System.out.printf("(%d, %d, %d) ", a, b, n-a-b);
				counter++;
			}
		}
		System.out.printf("\nNumber of combinations of a, b and c: %d", counter);
	}
	
	/**
	 * 
	 * The main method - entry point of this app.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the number(n): ");
		
		//n - The input number
		int n = scanner.nextInt();
		scanner.close();
		
		//Excute method findCombinations().
		findCombinations(n);
	}
}

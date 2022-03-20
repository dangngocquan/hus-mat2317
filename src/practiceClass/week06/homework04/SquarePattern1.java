package practiceClass.week06.homework04;

import java.util.Scanner;

//Exercise 1.1.1 (exercise 1.1, try 1)

/**
 * 
 * This program prompts user for the size and prints the following 
 * square pattern using two nested while-do loops.
 * 
 * @author Bris
 * @version 1.0
 * @since 3:55:54 PM -  Mar 20, 2022
 */
public class SquarePattern1 {
	/**
	 * 
	 * The main method - entry point of this program.
	 * 
	 * @param args Unused.
	 */ 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int size = scanner.nextInt();
		scanner.close();
		
		int numberRows = size;
		while (numberRows-->0) {
			int numberColums = size;
			while (numberColums-->0) {
				System.out.print("# ");
			}
			System.out.println();
		}
	}
}

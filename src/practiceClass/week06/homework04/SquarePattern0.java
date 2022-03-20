package practiceClass.week06.homework04;

import java.util.Scanner;

//Exercise 1.1.0

/**
 * 
 * This program prompts user for the size and prints the following 
 * square pattern using two nested for-loops.
 * 
 * @author Bris
 * @version 1.0
 * @since 3:49:08 PM -  Mar 20, 2022
 */
public class SquarePattern0 {
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
		
		for (int row = 1; row <= size; row++) {
			for (int column = 1; column <= size; column++) {
				System.out.print("# ");
			}
			System.out.println();
		}
	}
}

package practiceClass.week06.homework04;

import java.util.Scanner;

//Exercise 1.2

/**
 * 
 * This program prompts user for the size, and prints the following checkerboard pattern.
 * 
 * @author Bris
 * @version 1.0
 * @since 4:03:26 PM -  Mar 20, 2022
 */
public class CheckerPattern {
	/**
	 * 
	 * The main method - entry point of this program.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int size = scanner.nextInt();
		scanner.close();
		
		for (int row = 1; row <= size; row++) {
			for (int column = 1; column <= size; column++) {
				if (row % 2 == 0) {
					System.out.print(" #");
				}else {
					System.out.print("# ");
				}
			}
			System.out.println();
		}
	}
}

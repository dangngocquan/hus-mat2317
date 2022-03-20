package practiceClass.week06.homework04;

import java.util.Scanner;

//Exercise 1.4

/**
 * 
 * This program prompts user for the size, and prints the pattern as shown.
 * 
 * @author Bris
 * @version 1.0
 * @since 4:37:39 PM -  Mar 20, 2022
 */
public class BoxPattern {
	/**
	 * 
	 * This method is used to print the first pattern.
	 * 
	 * @param size is the size of pattern.
	 */
	public static void printFirstPattern(int size) {
		for (int row = 1; row <= size; row++) {
			if (row == 1 || row == size) {
				for (int column = 1; column <= size; column++) {
					System.out.print("# ");
				}
				System.out.println();
			}else {
				for (int column = 1; column <= size; column++) {
					if (column == 1 || column == size) {
						System.out.print("# ");
					}else {
						System.out.print("  ");
					}
				}
				System.out.println();
			}
		}
	}
	
	/**
	 * 
	 * This method is used to print the second pattern.
	 * 
	 * @param size is the size of pattern.
	 */
	public static void printSecondPattern(int size) {
		for (int row = 1; row <= size; row++) {
			if (row == 1 || row == size) {
				for (int column = 1; column <= size; column++) {
					System.out.print("# ");
				}
				System.out.println();
			}else {
				for (int column = 1; column <= size; column++) {
					if (column == row) {
						System.out.print("# ");
					}else {
						System.out.print("  ");
					}
				}
				System.out.println();
			}
		}
	}
	
	/**
	 * 
	 * This method is used to print the third pattern.
	 * 
	 * @param size is the size of pattern.
	 */
	public static void printThirdPattern(int size) {
		for (int row = 1; row <= size; row++) {
			if (row == 1 || row == size) {
				for (int column = 1; column <= size; column++) {
					System.out.print("# ");
				}
				System.out.println();
			}else {
				for (int column = 1; column <= size; column++) {
					if (column == size + 1 - row) {
						System.out.print("# ");
					}else {
						System.out.print("  ");
					}
				}
				System.out.println();
			}
		}
	}
	
	/**
	 * 
	 * This method is used to print the fourth pattern.
	 * 
	 * @param size is the size of pattern.
	 */
	public static void printFourthPattern(int size) {
		for (int row = 1; row <= size; row++) {
			if (row == 1 || row == size) {
				for (int column = 1; column <= size; column++) {
					System.out.print("# ");
				}
				System.out.println();
			}else {
				for (int column = 1; column <= size; column++) {
					if (column == row || column == size + 1 - row) {
						System.out.print("# ");
					}else {
						System.out.print("  ");
					}
				}
				System.out.println();
			}
		}
	}
	
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
		
		System.out.println("\na)");
		printFirstPattern(size);
		
		System.out.println("\nb)");
		printSecondPattern(size);
		
		System.out.println("\nc)");
		printThirdPattern(size);
		
		System.out.println("\nd)");
		printFourthPattern(size);
	}
}

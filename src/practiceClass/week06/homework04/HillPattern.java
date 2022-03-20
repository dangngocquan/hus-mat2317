package practiceClass.week06.homework04;

import java.util.Scanner;

//Exercise 1.5

/**
 * 
 * This program prompts user for the size, and prints the pattern as shown.
 * 
 * @author Bris
 * @version 1.0
 * @since 5:03:24 PM -  Mar 20, 2022
 */
public class HillPattern {
	/**
	 * 
	 * This method is used to print the first pattern.
	 * 
	 * @param size is the size of the pattern.
	 */
	public static void printFirstPattern(int size) {
		int MAX_COLUMN = 2*size-1;
		for (int row = 1; row <= size; row++) {
			int start = (MAX_COLUMN - 2*row + 1) / 2 + 1;
			int end = start + (2*row-1) - 1;
			for (int column = 1; column <= MAX_COLUMN; column++) {
				if (column >= start && column <= end) {
					System.out.print("# ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	/**
	 * 
	 * This method is used to print the second pattern.
	 * 
	 * @param size is the size of the pattern.
	 */
	public static void printSecondPattern(int size) {
		int MAX_COLUMN = 2*size-1;
		for (int row = 1; row <= size; row++) {
			int start = (MAX_COLUMN - 2*(size + 1 - row) + 1) / 2 + 1;
			int end = start + (2*(size + 1 - row) -1) - 1;
			for (int column = 1; column <= MAX_COLUMN; column++) {
				if (column >= start && column <= end) {
					System.out.print("# ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	/**
	 * 
	 * This method is used to print the third pattern.
	 * 
	 * @param size is the size of the pattern.
	 */
	public static void printThirdPattern(int size) {
		int MAX_COLUMN = 2*size-1;
		
		//print the size-first lines
		for (int row = 1; row <= size; row++) {
			int start = (MAX_COLUMN - 2*row + 1) / 2 + 1;
			int end = start + (2*row-1) - 1;
			for (int column = 1; column <= MAX_COLUMN; column++) {
				if (column >= start && column <= end) {
					System.out.print("# ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		//continue print (size-1) lines
		for (int row = 2; row <= size; row++) {
			int start = (MAX_COLUMN - 2*(size + 1 - row) + 1) / 2 + 1;
			int end = start + (2*(size + 1 - row) -1) - 1;
			for (int column = 1; column <= MAX_COLUMN; column++) {
				if (column >= start && column <= end) {
					System.out.print("# ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	/**
	 * 
	 * This method is used to print the fourth pattern.
	 * 
	 * @param size is the size of the pattern.
	 */
	public static void printFourthPattern(int size) {
		int MAX_COLUMN = 2*size - 1;
		
		//print size-first lines
		for (int row = 1; row <= size; row++) {
			int start = (MAX_COLUMN - 2*(row-1) + 1)/2 + 1;
			int end = start + 2*(row-1) - 1 - 1;
			for (int column = 1; column <= MAX_COLUMN; column++) {
				if (column >= start && column <= end) {
					System.out.print("  ");
				}else {
					System.out.print("# ");
				}
			}
			System.out.println();
		}
		
		//continue print (size-1) lines
		for (int row = 2; row <= size; row++) {
			int start = (MAX_COLUMN - 2*(size + 1 - row -1) + 1)/2 + 1;
			int end = start + 2*(size + 1 - row -1) - 1 - 1;
			for (int column = 1; column <= MAX_COLUMN; column++) {
				if (column >= start && column <= end) {
					System.out.print("  ");
				}else {
					System.out.print("# ");
				}
			}
			System.out.println();
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

package practiceClass.week06.homework04;

import java.util.Scanner;

//Exercise 1.3

/**
 * 
 * This program prompts user for the size, and print each of the patterns as shown.
 * 
 * @author Bris
 * @version 1.0
 * @since 4:12:49 PM -  Mar 20, 2022
 */
public class TriangularPattern {
	/**
	 * 
	 * This method is used to print the first pattern.
	 * 
	 * @param size is the size of pattern.
	 */
	public static void printFirstPattern(int size) {
		for (int row = 1; row <= size; row++) {
			for (int colum = 1; colum <= row; colum++) {
				System.out.print("# ");
			}
			System.out.println();
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
			for (int colum = 1; colum <= size + 1 - row; colum++) {
				System.out.print("# ");
			}
			System.out.println();
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
			for (int colum = 1; colum <= size; colum++) {
				if (colum >= row) {
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
	 * @param size is the size of pattern.
	 */
	public static void printFourthPattern(int size) {
		for (int row = 1; row <= size; row++) {
			for (int colum = 1; colum <= size; colum++) {
				if (colum >= size + 1 - row) {
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
	 * The main method - entry point of this program
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int size = scanner.nextInt();
		scanner.close();
		
		//Print the first pattern
		System.out.println("\na)");
		printFirstPattern(size);
		
		//Print the second pattern
		System.out.println("\nb)");
		printSecondPattern(size);
		
		//Print the third pattern
		System.out.println("\nc)");
		printThirdPattern(size);
		
		//Print the fourth pattern
		System.out.println("\nd)");
		printFourthPattern(size);
	}
}

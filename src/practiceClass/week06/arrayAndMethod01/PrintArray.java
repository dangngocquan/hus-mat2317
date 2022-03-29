package practiceClass.week06.arrayAndMethod01;

import java.util.Scanner;

//Exercise 1.1

/**
 * 
 * This program prompts user for the number of items in an array, and saves it in an int variable called NUM_ITEMS.
 * It then prompts user for the values of all the items and saves them in an int array called items. 
 * The program shall then print the contents of the array in the form of [x1, x2, ..., xn].
 * 
 * @author Bris
 * @version 1.0
 * @since 1:32:17 PM -  Mar 28, 2022
 */
public class PrintArray {
	/**
	 * 
	 * The main method - entry point of this program.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of items: ");
		int NUM_ITEMS = scanner.nextInt();
		System.out.print("Enter the value of all items (separated by space): ");
		int[] items = new int[NUM_ITEMS];
		for (int i = 0; i < NUM_ITEMS; i++) {
			items[i] = scanner.nextInt();
		}
		scanner.close();
		
		System.out.print("The values are: [");
		for (int i = 0; i < NUM_ITEMS - 1; i++) {
			System.out.print(items[i] + ", ");
		}
		System.out.print(items[NUM_ITEMS-1] + "]");
	}
}

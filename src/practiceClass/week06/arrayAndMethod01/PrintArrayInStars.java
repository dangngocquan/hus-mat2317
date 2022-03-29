package practiceClass.week06.arrayAndMethod01;

import java.util.Scanner;

//Exercise 1.2

/**
 * 
 * This program prompts user for the number of items in an array 
 * (a non-negative integer), and saves it in an int variable called NUM_ITEMS. It then prompts user for 
 * the values of all the items (non-negative integers) and saves them in an int array called items. The 
 * program shall then print the contents of the array in a graphical form, with the array index and values 
 * represented by number of stars.
 * 
 * @author Bris
 * @version 1.0
 * @since 1:40:54 PM -  Mar 28, 2022
 */
public class PrintArrayInStars {
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
		
		for (int i = 0; i < NUM_ITEMS; i++) {
			System.out.printf("%d: ", i);
			for (int j = 1; j <= items[i]; j++) {
				System.out.print("*");
			}
			System.out.printf("(%d)\n", items[i]);
		}
	}
}

package practiceClass.week06.homework04;

import java.util.Scanner;

//Exercise 1.6

/**
 * 
 * This program prompts user for the size, and print the
 * multiplication table as shown.
 * 
 * @author Bris
 * @version 1.0
 * @since 5:38:19 PM -  Mar 20, 2022
 */
public class TimeTable {
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
		System.out.println();
		
		for (int row = -1; row <= size; row++) {
			if (row == -1) {
				for (int column = 0; column <= size; column++) {
					if (column == 0) {
						System.out.printf("%2s |", "*");
					}else {
						System.out.printf("%4d", column);
					}
				}
			}else if (row == 0) {
				for (int column = 0; column <= size; column++) {
					System.out.printf("%4s", "----");
				}
			}else {
				for (int column = 0; column <= size; column++) {
					if (column == 0) {
						System.out.printf("%2d |", row);
					}else {
						System.out.printf("%4d", row*column);
					}
				}
			}
			System.out.println();
		}
	}
}

package theoryClass.week0506.homework;

import java.util.Scanner;

/**
 * 
 * This program is used to compute and print the sum of two input array.
 * 
 * @author Bris
 * @version 1.0
 * @since 12:50:34 AM -  Mar 23, 2022
 */
public class SumOfTwoArray {
	/**
	 * 
	 * The main method - entry point of this program.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a positive number n - the length of array: ");
		int n = scanner.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.printf("a[%d] = ", i);
			a[i] = scanner.nextInt();
		}
		for (int i = 0; i < n; i++) {
			System.out.printf("b[%d] = ", i);
			b[i] = scanner.nextInt();
		}
		scanner.close();
		
		int[] c = new int[n];
		System.out.print("Array c:   ");
		for (int i = 0; i < n; i++) {
			c[i] = a[i] + b[i];
			System.out.printf("%-5d",c[i]);
		}
	}
}

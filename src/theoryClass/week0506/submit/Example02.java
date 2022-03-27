package theoryClass.week0506.submit;

import java.util.Scanner;

/**
 * 
 * This program is used to find and print out the minimum value and the index of this element in the input array.
 * 
 * @author Bris
 * @version 1.0
 * @since 10:45:10 AM -  Mar 27, 2022
 */
public class Example02 {
	
	/**
	 * 
	 * This method is used to print the minimum number and index of it in the array.
	 * 
	 * @param array is a integer array.
	 */
	public static void printMinimumNumber(int[] array) {
		int min = array[0];
		int indexOfMin = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
				indexOfMin = i;
			}
		}
		System.out.println("The minimum element is: " + min);
		System.out.println("The index of the minimum element is: " + indexOfMin);
	}
	
	/**
	 * 
	 * The main method - entry point of this program.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a positive number n - the length of array a: ");
		int n = scanner.nextInt();
		int[] a = new int[n];
		for (int index = 0; index < n; index++) {
			System.out.printf("a[%d] = ", index);
			a[index] = scanner.nextInt();
		}
		scanner.close();
		
		printMinimumNumber(a);
	}
}

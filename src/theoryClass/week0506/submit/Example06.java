package theoryClass.week0506.submit;

import java.util.Scanner;

/**
 * 
 * This program is used to calculate and print out a array c that c[i] = a[i] + b[i], a and b are two input array.
 * 
 * @author Bris
 * @version 1.0
 * @since 11:29:04 AM -  Mar 27, 2022
 */
public class Example06 {
	/**
	 * 
	 * This method is used to print out the elements of a array.
	 * 
	 * @param array is the array which you want to print.
	 */
	public static void printArray(int[] array) {
		for (int element : array) {
			System.out.printf("%4d",element);
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
		System.out.print("Enter a positive number n - the length of array a, b: ");
		int n = scanner.nextInt();
		int[] a = new int[n];
		for (int index = 0; index < n; index++) {
			System.out.printf("a[%d] = ", index);
			a[index] = scanner.nextInt();
		}
		int[] b = new int[n];
		for (int index = 0; index < n; index++) {
			System.out.printf("b[%d] = ", index);
			b[index] = scanner.nextInt();
		}
		int[] c = new int[n];
		for (int index = 0; index < n; index++) {
			c[index] = a[index] + b[index];
		}
		scanner.close();
		
		System.out.print("Array a: ");
		printArray(a);
		System.out.println();
		System.out.print("Array b: ");
		printArray(b);
		System.out.println();
		System.out.print("Array c: ");
		printArray(c);
	}
}

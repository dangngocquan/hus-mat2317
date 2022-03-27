package theoryClass.week0506.submit;

import java.util.Scanner;

/**
 * 
 * This program is used to print out the input array in ascending order and descending order.
 * 
 * @author Bris
 * @version 1.0
 * @since 11:13:26 AM -  Mar 27, 2022
 */
public class Example05 {
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
	 * This method is used to sort array (ascending order), used bubble sort
	 * 
	 * @param array is the array which you want to sort.
	 */
	public static void bubbleSortASC(int[] array) {
		for (int turn = 1; turn <= array.length; turn++) {
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i+1]) {
					int temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
				}
			}
		}
	}
	
	/**
	 * 
	 * This method is used to sort array (descending order), used bubble sort
	 * 
	 * @param array is the array which you want to sort.
	 */
	public static void bubbleSortDESC(int[] array) {
		for (int turn = 1; turn <= array.length; turn++) {
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] < array[i+1]) {
					int temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
				}
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
		System.out.print("Enter a positive number n - the length of array a: ");
		int n = scanner.nextInt();
		int[] a = new int[n];
		for (int index = 0; index < n; index++) {
			System.out.printf("a[%d] = ", index);
			a[index] = scanner.nextInt();
		}
		scanner.close();
		
		System.out.println("Your array:");
		printArray(a);
		System.out.println();
		
		bubbleSortASC(a);
		System.out.println("Your array in Ascending order:");
		printArray(a);
		System.out.println();
		
		bubbleSortDESC(a);
		System.out.println("Your array in Descending order:");
		printArray(a);
		
	}
}

package theoryClass.week0506.submit;

import java.util.Scanner;

/**
 * 
 * This program is used to remove the third element of the input array, then print out the array.
 * 
 * @author Bris
 * @version 1.0
 * @since 11:04:43 AM -  Mar 27, 2022
 */
public class Example04 {
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
	 * This method is used to remove a element in array.
	 * 
	 * @param arr is the array which you want to remove element.
	 * @param index is the index of element which you want to remove.
	 * @return Return a new array after remove a element.
	 */
	public static int[] removeElementInIndex(int[] arr, int index) {
		int[] newArray = new int[arr.length - 1];
		for (int i = 0; i < index; i++) {
			newArray[i] = arr[i];
		}
		for (int i = index + 1; i < arr.length; i++) {
			newArray[i-1] = arr[i];
		}
		return newArray;
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
		
		System.out.println("Array before remove 3-th element:");
		printArray(a);
		System.out.println();
		
		a = removeElementInIndex(a, 2);
		
		System.out.println("Array after revomed 3-th element:");
		printArray(a);
	}
}

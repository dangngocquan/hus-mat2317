package theoryClass.week0506.submit;

import java.util.Scanner;

/**
 * 
 * This program is used to check the input array if its is a increase array or not.
 * 
 * @author Bris
 * @version 1.0
 * @since 10:53:02 AM -  Mar 27, 2022
 */
public class Example03 {
	/**
	 * 
	 * This method is used to check if a array is a increase array or not.
	 * 
	 * @param array is the array which you want to check.
	 * @return Return true if it is a increase array.
	 * Return false if otherwise.
	 */
	public static boolean isIncreaseArray(int[] array) {
		int tempElement = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < tempElement) {
				return false;
			}
			tempElement = array[i];
		}
		return true;
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
		
		//Check increase array
		if (isIncreaseArray(a)) {
			System.out.println("This array is a increase array.");
		}else {
			System.out.println("This array is not a increase array.");
		}
	}
}

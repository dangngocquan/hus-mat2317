package practiceClass.week08.homework06;

/**
 * Exercise 2.5
 * @author Bris
 * @version 1.0
 * @since 3:06:46 PM -  Apr 5, 2022
 */
public class InsertionSort {
	/**
	 * Print array
	 * @param array .
	 */
	public static void printArray(int[] array) {
		for (int element: array) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
	
	/**
	 * Insertion sort.
	 * @param array .
	 */
	public static void insertionSort(int[] array) {
		for (int index = 1; index < array.length; index++) {
			int indexChecking = index;
			for (int i = index - 1; i >= 0; i--) {
				if (array[indexChecking] < array[i]) {
					int temp = array[i];
					array[i] = array[indexChecking];
					array[indexChecking] = temp;
					indexChecking = i;
				}
			}
		}
	}
	
	/**
	 * The main method.
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		int[] array = {1, 6, 3, 2, 4, 1, 9, 0, 5};
		System.out.print("Before sort array: ");
		printArray(array);
		insertionSort(array);
		System.out.print("After sorted array: ");
		printArray(array);
	}
}

package practiceClass.week08.homework06;

/**
 * Exercise 2.3
 * @author Bris
 * @version 1.0
 * @since 9:45:22 AM -  Apr 5, 2022
 */
public class SelectionSort {
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
	 * Selection sort.
	 * @param array .
	 */
	public static void selectionSort(int[] array) {
		for (int index = 0; index < array.length; index++) {
			int minValue = array[index];
			int indexOfMinValue = index;
			for (int i = index; i < array.length; i++) {
				if (array[i] < minValue) {
					minValue = array[i];
					indexOfMinValue = i;
				}
			}
			
			int temp = array[index];
			array[index] = array[indexOfMinValue];
			array[indexOfMinValue] = temp;
		}
	}
	
	/**
	 * The main method. 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		int[] array = {1, 3, 2, 8, 5, 4, 0, 8, 9, 3};
		System.out.print("Before sort array: ");
		printArray(array);
		selectionSort(array);
		System.out.print("After sorted array: ");
		printArray(array);
	}
}

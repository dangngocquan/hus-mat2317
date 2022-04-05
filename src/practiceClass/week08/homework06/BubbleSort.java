package practiceClass.week08.homework06;

/**
 * Bubble sort.
 * @author Bris
 * @version 1.0
 * @since 10:51:52 AM -  Apr 5, 2022
 */
public class BubbleSort {
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
	 * Bubble sort.
	 * @param array .
	 */
	public static void bubbleSort(int[] array) {
		for (int turn = 1; turn <= array.length; turn++) {
			for (int i = 1; i < array.length; i++) {
				if (array[i-1] > array[i]) {
					int temp = array[i-1];
					array[i-1] = array[i];
					array[i] = temp;
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
		bubbleSort(array);
		System.out.print("After sorted array: ");
		printArray(array);
	}
}

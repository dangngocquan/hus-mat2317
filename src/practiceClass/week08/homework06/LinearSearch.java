package practiceClass.week08.homework06;

/**
 * Exercise 2.1
 * @author Bris
 * @version 1.0
 * @since 9:12:08 AM -  Apr 5, 2022
 */
public class LinearSearch {
	/**
	 * Linear search index 
	 * @param array .
	 * @param key .
	 * @return Return the array index, if key is found, or -1 otherwise
	 */
	public static int linearSearchIndex(int[] array, int key) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == key) {
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * The main method
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5};
		int key1 = 2;
		int key2 = 6;
		System.out.printf("Index of element %d in array: %d\n", key1, linearSearchIndex(array, key1));
		System.out.printf("Index of element %d in array: %d\n", key2, linearSearchIndex(array, key2));
	}
}

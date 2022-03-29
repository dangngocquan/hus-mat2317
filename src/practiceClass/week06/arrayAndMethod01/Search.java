package practiceClass.week06.arrayAndMethod01;

//Exercise 2.6

/**
 * 
 * This program write a method called test search(), which takes an array of int and an int; and returns the array
 * index if the array contains the given int; or -1 otherwise.
 * 
 * @author Bris
 * @version 1.0
 * @since 9:35:17 AM -  Mar 29, 2022
 */
public class Search {
	/**
	 * 
	 * This method takes an array of int and an int; and returns the array
	 * index if the array contains the given int; or -1 otherwise.
	 * 
	 * @param array .
	 * @param key .
	 * @return Returns the array
	 * index if the array contains the given int; or -1 otherwise.
	 */
	public static int search(int[] array, int key) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == key) {
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * 
	 * The main method - entry point of this program.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7};
		int key1 = 4;
		int key2 = 8;
		System.out.printf("The array index of %d is %d\n", key1, search(array, key1));
		System.out.printf("The array index of %d is %d\n", key2, search(array, key2));
	}
}

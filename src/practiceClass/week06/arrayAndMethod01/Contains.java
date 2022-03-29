package practiceClass.week06.arrayAndMethod01;

//Exercise 2.5

/**
 * 
 * This program write a boolean method called contains(), which takes an array of int and an int; and returns true if
 * the array contains the given int.
 * 
 * @author Bris
 * @version 1.0
 * @since 9:28:33 AM -  Mar 29, 2022
 */
public class Contains {
	/**
	 * 
	 * This method takes an array of int and an int; and returns true if
	 * the array contains the given int.
	 * 
	 * @param array .
	 * @param key . 
	 * @return .
	 */
	public static boolean contains(int[] array, int key) {
		for (int element : array) {
			if (element == key) {
				return true;
			}
		}
		return false;
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
		System.out.printf("The array contains %d? %s\n", key1, contains(array, key1));
		System.out.printf("The array contains %d? %s\n", key2, contains(array, key2));
	}
}

package practiceClass.week06.arrayAndMethod01;

//Exercise 2.7

/**
 * 
 * This program write a boolean method called equals(), which takes two arrays of int and returns true if the two arrays
 * are exactly the same (i.e., same length and same contents).
 * 
 * @author Bris
 * @version 1.0
 * @since 9:41:24 AM -  Mar 29, 2022
 */
public class Equals {
	/**
	 * 
	 * This method takes two arrays of int and returns true if the two arrays
	 * are exactly the same (i.e., same length and same contents).
	 * 
	 * @param array1 .
	 * @param array2 .
	 * @return Returns true if the two arrays
	 * are exactly the same (i.e., same length and same contents).
	 */
	public static boolean equals(int[] array1, int[] array2) {
		if (array1.length != array2.length) {
			return false;
		}
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] != array2[i]) {
				return false;
			}
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
		int[] array1 = {1, 2, 3, 4, 5};
		int[] array2 = {1, 2, 3, 4, 5};
		int[] array3 = {1, 2, 3, 4, 5, 6};
		int[] array4 = {1, 3, 3, 4, 5};
		System.out.println("array1 is equals array2? " + equals(array1, array2));
		System.out.println("array1 is equals array3? " + equals(array1, array3));
		System.out.println("array1 is equals array4? " + equals(array1, array4));
	}
}

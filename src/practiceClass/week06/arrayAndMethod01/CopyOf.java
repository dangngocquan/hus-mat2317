package practiceClass.week06.arrayAndMethod01;

//Exercise 2.8

/**
 * 
 * This program write a boolean method called copyOf(), which takes an int Array and returns a copy of the given
 * array.
 * 
 * @author Bris
 * @version 1.0
 * @since 9:49:02 AM -  Mar 29, 2022
 */
public class CopyOf {
	/**
	 * 
	 * This method is used to print array.
	 * 
	 * @param array .
	 */
	public static void printArray(int[] array) {
		for (int element : array) {
			System.out.print(element + " ");
		}
	}
	
	/**
	 * 
	 * This method takes an int Array and returns a copy of the given
	 * array.
	 * 
	 * @param array.
	 * @return Return a copy of the given array.
	 */
	public static int[] copyOf(int[] array) {
		int[] arrayCopy = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			arrayCopy[i] = array[i];
		}
		return arrayCopy;
	}
	
	/**
	 * 
	 * This method takes an int Array and returns a copy of the given
	 * array with new length.
	 * 
	 * @param array.
	 * @return Return a copy of the given array.
	 */
	public static int[] copyOf(int[] array, int newLength) {
		int[] newArray = new int[newLength];
		if (newLength >= array.length) {
			for (int i = 0; i < array.length; i++) {
				newArray[i] = array[i];
			}
		}else {
			for (int i = 0; i < newLength; i++) {
				newArray[i] = array[i];
			}
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
		int[] array1 = {1, 2, 3, 4, 5, 6};
		int[] array2 = copyOf(array1);
		int[] array3 = copyOf(array1, 4);
		int[] array4 = copyOf(array1, 8);
		System.out.printf("%-45s","Array1: ");
		printArray(array1);
		System.out.println();
		System.out.printf("%-45s","Array2 (copy of Array1): ");
		printArray(array2);
		System.out.println();
		System.out.printf("%-45s","Array3 (copy of Array1 with length = 4): ");
		printArray(array3);
		System.out.println();
		System.out.printf("%-45s","Array4 (copy of Array1 with length = 8): ");
		printArray(array4);
		System.out.println();
	}
}

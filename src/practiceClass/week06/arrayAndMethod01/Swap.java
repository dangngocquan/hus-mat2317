package practiceClass.week06.arrayAndMethod01;

//Exercise 2.9

/**
 * 
 * This program write a method called swap(), which takes two arrays of int and swap their contents if they have the
 * same length. It shall return true if the contents are successfully swapped.
 * 
 * @author Bris
 * @version 1.0
 * @since 10:08:54 AM -  Mar 29, 2022
 */
public class Swap {
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
	 * This method takes two arrays of int and swap their contents if they have the
	 * same length. It shall return true if the contents are successfully swapped.
	 * 
	 * @param array1 .
	 * @param array2 .
	 * @return Return true if the contents are successfully swapped.
	 */
	public static boolean swap(int[] array1, int[] array2) {
		if (array1.length != array2.length) {
			return false;
		}
		
		int[] tempArray = new int[array1.length];
		for (int i = 0; i < array1.length; i++) {
			tempArray[i] = array1[i];
		}
		for (int i = 0; i < array1.length; i++) {
			array1[i] = array2[i];
		}
		for (int i = 0; i < array1.length; i++) {
			array2[i] = tempArray[i];
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
		int[] array1 = {1, 2, 3, 4};
		int[] array2 = {5, 6, 7, 8};
		int[] array3 = {1, 2, 3, 4, 5};
		int[] array4 = {5, 6, 7};
		System.out.print("array1: ");
		printArray(array1);
		System.out.println();
		System.out.print("array2: ");
		printArray(array2);
		System.out.println();
		System.out.print("array3: ");
		printArray(array3);
		System.out.println();
		System.out.print("array4: ");
		printArray(array4);
		System.out.println();
		System.out.println("======================================");
		
		//swap array1 and array2
		System.out.println("Swap array1 and array2:");
		if (swap(array1, array2)) {
			System.out.print("array1: ");
			printArray(array1);
			System.out.println();
			System.out.print("array2: ");
			printArray(array2);
			System.out.println();
			System.out.println("Successfully swapped.");
		}else {
			System.out.print("array1: ");
			printArray(array1);
			System.out.println();
			System.out.print("array2: ");
			printArray(array2);
			System.out.println();
			System.out.println("Failed swap.");
		}
		
		//swap array3 and array4
		System.out.println("======================================");
		System.out.println("Swap array3 and array4:");
		if (swap(array3, array4)) {
			System.out.print("array3: ");
			printArray(array3);
			System.out.println();
			System.out.print("array4: ");
			printArray(array4);
			System.out.println();
			System.out.println("Successfully swapped.");
		}else {
			System.out.print("array3: ");
			printArray(array3);
			System.out.println();
			System.out.print("array4: ");
			printArray(array4);
			System.out.println();
			System.out.println("Failed swap.");
		}
	}
}

package practiceClass.week06.arrayAndMethod01;

//Exercise 2.10

/**
 * 
 * This program Write a method called reverse(), which takes an array of int and reverse its contents. For example, the
 * reverse of [1, 2, 3, 4] is [4, 3, 2, 1].
 * 
 * @author Bris
 * @version 1.0
 * @since 9:41:04 PM -  Mar 29, 2022
 */
public class Reverse {
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
	 * This method takes an array of int and reverse its contents.
	 * 
	 * @param array .
	 */
	public static void reverse(int[] array) {
		for (int i = 0; i <= (array.length-1)/2; i++) {
			int tempValue = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = tempValue;
		}
	}
	
	/**
	 * 
	 * The main method - entry point of this program.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		int[] array1 = {1, 2, 3, 4, 5, 6};
		int[] array2 = {1, 2, 3, 4, 5, 6, 7};
		System.out.print("array1: ");
		printArray(array1);
		System.out.println();
		System.out.print("array2: ");
		printArray(array2);
		System.out.println();
		System.out.println("=============================");
		
		//reverse array1
		System.out.println("Reverse array1.");
		reverse(array1);
		System.out.print("array1: ");
		printArray(array1);
		System.out.println();
		System.out.println("=============================");
		
		//reverse array2
		System.out.println("Reverse array2.");
		reverse(array2);
		System.out.print("array2: ");
		printArray(array2);
		System.out.println();
	}
}

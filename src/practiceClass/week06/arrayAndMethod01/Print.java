package practiceClass.week06.arrayAndMethod01;

//Exercise 2.3

/**
 * 
 * This program write a method called print(), which takes an int array and print its contents in the form of [a1, a2, . . . , an].
 * Take note that there is no comma after the last element.
 * 
 * @author Bris
 * @version 1.0
 * @since 3:24:24 PM -  Mar 28, 2022
 */
public class Print {
	/**
	 * 
	 * This method is used to print all elements of a int array.
	 * 
	 * @param array is a int array
	 */
	public static void print(int[] array) {
		System.out.print("[");
		for (int i = 0; i < array.length - 1; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.print(array[array.length-1] + "]");
	}
	
	/**
	 * 
	 * This method is used to print all elements of a double array.
	 * 
	 * @param array is a double array
	 */
	public static void print(double[] array) {
		System.out.print("[");
		for (int i = 0; i < array.length - 1; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.print(array[array.length-1] + "]");
	}
	
	/**
	 * 
	 * This method is used to print all elements of a float array.
	 * 
	 * @param array is a float array
	 */
	public static void print(float[] array) {
		System.out.print("[");
		for (int i = 0; i < array.length - 1; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.print(array[array.length-1] + "]");
	}
	
	/**
	 * 
	 * The main method - entry point of this program.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4};
		print(array);
	}
}

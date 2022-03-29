package practiceClass.week06.arrayAndMethod01;

//Exercise 2.4

/**
 * 
 * This program write a method called arrayT oString(), which takes an int array and return a String in the form of
 * [a1, a2, . . . , an].
 * 
 * @author Bris
 * @version 1.0
 * @since 3:30:56 PM -  Mar 28, 2022
 */
public class ArrayToString {
	/**
	 * 
	 * This method takes an int array and return a String in the form of
	 * [a1, a2, . . . , an].
	 * 
	 * @param array
	 * @return
	 */
	public static String arrayToString(int[] array) {
		String ans = "[";
		for (int i = 0; i < array.length - 1; i++) {
			ans += array[i] + ", ";
		}
		ans += array[array.length-1] + "]";
		return ans;
	}
	
	/**
	 * 
	 * The main method - entry point of this program.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4};
		System.out.println(arrayToString(array));
	}
}

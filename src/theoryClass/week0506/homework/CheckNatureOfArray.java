package theoryClass.week0506.homework;

/**
 * 
 * This program is used to check a array if it is a icrease array or not.
 * 
 * @author Bris
 * @version 1.0
 * @since 2:04:20 PM -  Mar 22, 2022
 */
public class CheckNatureOfArray {
	/**
	 * 
	 * This method is used to get a random number in range [startingNumber, endingNumber]
	 * 
	 * @param startingNumber is the start number.
	 * @param endingNumber is the end number.
	 * @return Return a random number.
	 */
	public static int getRandomNumber(int startingNumber, int endingNumber) {
		int randomNumber = (int)Math.floor(Math.random()*(endingNumber - startingNumber) + startingNumber);
		return randomNumber;
	}
	
	/**
	 * 
	 * This method is used to print out the elements of a array.
	 * 
	 * @param array is the array which you want to print.
	 */
	public static void printArray(int[] array) {
		for (int element : array) {
			System.out.printf("%4d",element);
		}
	}
	
	/**
	 * 
	 * This method is used to check if a array is a increase array or not.
	 * 
	 * @param array is the array which you want to check.
	 * @return Return true if it is a increase array.
	 * Return false if otherwise.
	 */
	public static boolean isIncreaseArray(int[] array) {
		int tempElement = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < tempElement) {
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
		//Create the array
//		int length = 20;
//		int[] array = new int[length];
//		for (int i = 0; i < length; i++) {
//			array[i] = getRandomNumber(0, 100);
//		}
		
		int[] array = {1, 3, 6, 9, 11, 13, 14, 17, 19};
		
		//Print array
		System.out.println("Your array: ");
		printArray(array);
		System.out.println();
		
		//Check increase array
		if (isIncreaseArray(array)) {
			System.out.println("This array is a increase array.");
		}else {
			System.out.println("This array is not a increase array.");
		}
		
	} 
}

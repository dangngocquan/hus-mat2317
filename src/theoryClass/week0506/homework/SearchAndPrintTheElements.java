package theoryClass.week0506.homework;

/**
 * 
 * This program is used to search and print the elements of array, this array is created random.
 * 
 * @author Bris
 * @version 1.0
 * @since 1:56:37 PM -  Mar 22, 2022
 */
public class SearchAndPrintTheElements {
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
	 * This method is used to check a number if it is a prime number or not.
	 * 
	 * @param number is the number which you want to check.
	 * @return Return true if it is a prime number.
	 * Return false if otherwise.
	 */
	public static boolean isPrime(int number) {
		if (number < 2) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
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
	 * This method is used to print the elements which is a prime number in array.
	 * 
	 * @param array is a integer array.
	 */
	public static void printPrimeNumbers(int[] array) {
		for (int element : array) {
			if (isPrime(element)) {
				System.out.printf("%4d",element);
			}
		}
	}
	
	
	/**
	 * 
	 * This method is used to print the minimum number and index of it in the array.
	 * 
	 * @param array is a integer array.
	 */
	public static void printMinimumNumber(int[] array) {
		int min = array[0];
		int indexOfMin = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
				indexOfMin = i;
			}
		}
		System.out.println("The minimum element is: " + min);
		System.out.println("The index of the minimum element is: " + indexOfMin);
	}
	
	/**
	 * 
	 * This method is used to print a 2-dimensional array.
	 * 
	 * @param matrix is a 2-dimensional array.
	 */
	public static void printMatrix(int[][] matrix) {
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				System.out.printf("%4d", matrix[row][column]);
			}
			System.out.println();
		}
	}
	
	/**
	 * 
	 * The main method - entry point of this program.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		// 1-dimensional aray
		//Create a integer array
		int length = 20;
		int[] values = new int[length];
		for (int i = 0; i < length; i++) {
			values[i] = getRandomNumber(0, 100);
		}
		
		//Print all the elements of array
		System.out.println("Print all the elements of array: ");
		printArray(values);
		System.out.println();
		System.out.println();
		
		//Print all prime number in the array
		System.out.println("Print all prime numbers in the array: ");
		printPrimeNumbers(values);
		System.out.println();
		System.out.println();
		
		//Print the minimum value and the index of it in array
		System.out.println("Print the minimum value and the index of it in array: ");
		printMinimumNumber(values);
		System.out.println();
		
		
		//2-dimensional array
		//Create a 2-dimensional array
		int numberOfRows = 10;
		int numberOfColumns = 10;
		int[][] matrix = new int[numberOfRows][numberOfColumns];
		for (int row = 0; row < numberOfRows; row++) {
			for (int column = 0; column < numberOfColumns; column++) {
				matrix[row][column] = getRandomNumber(0, 100);
			}
		}
		
		//Print 2-dimensional array
		System.out.println("=============================================================");
		System.out.println("Print 2-dimensional array: ");
		printMatrix(matrix);
		System.out.println();
	}
}

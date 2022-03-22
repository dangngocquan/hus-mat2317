package theoryClass.week0506.homework;

/**
 * 
 * This c]program is used to sort array with 3 way: Bubble sort, Insertion sort, Selection sort
 * 
 * @author Bris
 * @version 1.0
 * @since 11:47:48 PM -  Mar 22, 2022
 */
public class SortArray {
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
	 * This method is used to sort array, used bubble sort
	 * 
	 * @param array is the array which you want to sort.
	 */
	public static void bubbleSort(int[] array) {
		System.out.printf("Turn %-2d: ", 0);
		printArray(array);
		System.out.println();
		for (int turn = 1; turn <= array.length; turn++) {
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i+1]) {
					int temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
				}
			}
			System.out.printf("Turn %-2d: ", turn);
			printArray(array);
			System.out.println();
		}
	}
	
	/**
	 * 
	 * This method is used to sort array, used insertion sort
	 * 
	 * @param array is the array which you want to sort.
	 */
	public static void insertionSort(int[] array) {
		System.out.printf("Turn %-2d: ", 0);
		printArray(array);
		System.out.println();
		for (int turn = 1; turn < array.length; turn++) {
			int tempIndex = turn;
			for (int i = turn - 1; i >= 0; i--) {
				if (array[tempIndex] < array[i]) {
					int tempValue = array[tempIndex];
					array[tempIndex] = array[i];
					array[i] = tempValue;
					tempIndex = i;
				}
			}
			System.out.printf("Turn %-2d: ", turn);
			printArray(array);
			System.out.println();
		}
	}
	
	/**
	 * 
	 * This method is used to sort array, used selection sort
	 * 
	 * @param array is the array which you want to sort.
	 */
	public static void selectionSort(int[] array) {
		System.out.printf("Turn %-2d: ", 0);
		printArray(array);
		System.out.println();
		for (int turn = 1; turn <= array.length; turn++) {
			int selectingIndex = turn - 1;
			int minValue = array[selectingIndex];
			int indexOfMinValue = selectingIndex;
			
			for (int i = selectingIndex; i < array.length; i++) {
				if (array[i] < minValue) {
					minValue = array[i];
					indexOfMinValue = i;
				}
			}
			
			array[indexOfMinValue] = array[selectingIndex];
			array[selectingIndex] = minValue;
			
			System.out.printf("Turn %-2d: ", turn);
			printArray(array);
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
		//Bubble sort
		int[] a = {1, 5, 8, 2, 3, 9, 4, 7, 6};
		System.out.println("Bubble sort: ");
		bubbleSort(a);
		System.out.println();
		System.out.println();
		
		//Insertion sort
		int[] b = {1, 5, 8, 2, 3, 9, 4, 7, 6};
		System.out.println("Insertion sort");
		insertionSort(b);
		System.out.println();
		System.out.println();
		
		//Selection sort
		int[] c = {1, 5, 8, 2, 3, 9, 4, 7, 6};
		System.out.println("Selection sort");
		selectionSort(c);
		System.out.println();
		System.out.println();
	}
}

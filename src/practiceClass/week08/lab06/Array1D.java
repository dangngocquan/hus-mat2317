package practiceClass.week08.lab06;

import java.util.Random;

//Exercise 1.1

/**
 * ...
 * @author Bris
 * @version 1.0
 * @since 10:37:49 AM -  Apr 4, 2022
 */
public class Array1D {
	/**
	 * Get random input.
	 * @param array .
	 */
	public static void input(int[] array) {
		Random randomGenerator = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = randomGenerator.nextInt() % 1000;
		}
	}
	
	/**
	 * Read and print elements of array
	 * @param array .
	 */
	public static void printElementsOfArray(int[] array) {
		if (array == null) {
			return;
		}
		for (int element : array) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
	
	/**
	 * Print all negative elements of array.
	 * @param array .
	 */
	public static void printNegativeElementsOfArray(int[] array) {
		if (array == null) {
			return;
		}
		for (int element : array) {
			if (element < 0) {
				System.out.print(element + " ");
			}
			
		}
		System.out.println();
	}
	
	/**
	 * Get sum of elements of array.
	 * @param array .
	 * @return .
	 */
	public static long sumElementsOfArray(int[] array) {
		long sum = 0;
		for (int element: array) {
			sum += element;
		}
		return sum;
	}
	
	/**
	 * Find maximum element.
	 * @param array .
	 * @return .
	 */
	public static int maximumElement(int[] array) {
		int max = array[0];
		for (int element: array) {
			max = Math.max(element, max);
		}
		return max;
	}
	
	/**
	 * Find minimum element.
	 * @param array .
	 * @return .
	 */
	public static int minimumElement(int[] array) {
		int min = array[0];
		for (int element: array) {
			min = Math.min(element, min);
		}
		return min;
	}
	
	/**
	 * Find second largest element.
	 * @param array .
	 * @return .
	 */
	public static int secondLargestElement(int[] array) {
		int maxElement = maximumElement(array);
		int secondLargestElement = maxElement;
		for (int element : array) {
			if (element != maxElement) {
				secondLargestElement = element;
				break;
			}
		}
		for (int element: array) {
			if (element != maxElement) {
				secondLargestElement = Math.max(element, secondLargestElement);
			}
		}
		return secondLargestElement;
	}
	
	/**
	 * Get count of odd elements.
	 * @param array .
	 * @return .
	 */
	public static int countOddElements(int[] array) {
		int count = 0;
		for (int elememt: array) {
			if (elememt % 2 != 0) {
				count++;
			}
		}
		return count;
	}
	
	/**
	 * Get count of even elements.
	 * @param array .
	 * @return .
	 */
	public static int countEvenElements(int[] array) {
		int count = 0;
		for (int elememt: array) {
			if (elememt % 2 == 0) {
				count++;
			}
		}
		return count;
	}
	
	/**
	 * Copy all elements from an array to another array.
	 * @param oldArray .
	 * @return .
	 */
	public static int[] copyArray(int[] oldArray) {
		int[] newArray = new int[oldArray.length];
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = oldArray[i];
		}
		return newArray;
	}
	
	/**
	 * Insert an element.
	 * @param array .
	 * @param position .
	 * @param value .
	 * @return .
	 */
	public static int[] insertElement(int[] array, int position, int value) {
		int[] newArray = new int[array.length + 1];
		for (int i = 0; i < position; i++) {
			newArray[i] = array[i];
		}
		newArray[position] = value;
		for (int i = position+1; i < newArray.length; i++) {
			newArray[i] = array[i-1];
		}
		return newArray;
	}
	
	/**
	 * Delete an element.
	 * @param array .
	 * @param position .
	 * @return .
	 */
	public static int[] deleteElement(int[] array, int position) {
		int[] newArray = new int[array.length - 1];
		for (int i = 0; i < position; i++) {
			newArray[i] = array[i];
		}
		for (int i = position + 1; i < array.length; i++) {
			newArray[i-1] = array[i];
		}
		return newArray;
	}
	
	/**
	 * count frequency of each element in array.
	 * @param array .
	 * @param value .
	 * @return .
	 */
	public static int countFrequency(int[] array, int value) {
		int count = 0;
		for (int element: array) {
			if (element == value) {
				count++;
			}
		}
		return count;
	}
	
	/**
	 * Reverse array.
	 * @param array .
	 * @return .
	 */
	public static int[] getReverseArray(int[] array) {
		int[] reverseArr = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			reverseArr[i] = array[array.length-1-i];
		}
		return reverseArr;
	}
	
	/**
	 * Get even elements array.
	 * @param array .
	 * @return .
	 */
	public static int[] getEvenArray(int[] array) {
		int[] evenArray = new int[countEvenElements(array)];
		int index = 0;
		for (int element: array) {
			if (element % 2 == 0) {
				evenArray[index] = element;
				index++;
			}
		}
		return evenArray;
	}
	
	/**
	 * Get odd elements array.
	 * @param array .
	 * @return .
	 */
	public static int[] getOddArray(int[] array) {
		int[] oddArray = new int[countOddElements(array)];
		int index = 0;
		for (int element: array) {
			if (element % 2 != 0) {
				oddArray[index] = element;
				index++;
			}
		}
		return oddArray;
	}
	/**
	 * Search element.
	 * @param array .
	 * @param value .
	 * @return .
	 */
	public static int searchElement(int[] array, int value) {
		int index = -1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == value) {
				return i;
			}
		}
		return index;
	}
	
	/**
	 * Sort ascending order.
	 * @param array .
	 */
	public static void sortAscendingOrder(int[] array) {
		for (int turn = 1; turn <= array.length; turn++) {
			for (int i = 1; i < array.length; i++) {
				if (array[i-1] > array[i]) {
					int temp = array[i];
					array[i] = array[i-1];
					array[i-1] = temp;
				}
			}
		}
	}
	
	/**
	 * Sort descending order.
	 * @param array .
	 */
	public static void sortDescendingOrder(int[] array) {
		for (int turn = 1; turn <= array.length; turn++) {
			for (int i = 1; i < array.length; i++) {
				if (array[i-1] < array[i]) {
					int temp = array[i];
					array[i] = array[i-1];
					array[i-1] = temp;
				}
			}
		}
	}
	
	/**
	 * Left rotate array.
	 * @param array .
	 * @param time .
	 */
	public static void leftRotate(int[] array, int time) {
		int length = array.length;
		int[] tempArray = new int[length];
		for (int i = 0; i < length; i++) {
			int index = i - time;
			if (index < 0) {
				index += length;
			}
			tempArray[index] = array[i];
		}
		for (int i = 0; i < length; i++) {
			array[i] = tempArray[i];
		}
	}
	
	/**
	 * Right rotate array.
	 * @param array .
	 * @param time .
	 */
	public static void rightRotate(int[] array, int time) {
		int length = array.length;
		int[] tempArray = new int[length];
		for (int i = 0; i < length; i++) {
			int index = i + time;
			if (index > length-1) {
				index -= length;
			}
			tempArray[index] = array[i];
		}
		for (int i = 0; i < length; i++) {
			array[i] = tempArray[i];
		}
	}
	
	/**
	 * The main method.
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		//Create data
		int length = 10;
		int[] array = new int[length];
		input(array);
		
		//1.1.1
		System.out.print("All elements of array: ");
		printElementsOfArray(array);
		System.out.println();
		
		//1.1.2
		System.out.print("All negative elements of array: ");
		printNegativeElementsOfArray(array);
		System.out.println();
		
		//1.1.3
		System.out.println("Sum of all elements of array: " + sumElementsOfArray(array));
		System.out.println();
		
		//1.1.4
		System.out.println("Maximum element: " + maximumElement(array));
		System.out.println("Minimum element: " + minimumElement(array));
		System.out.println();
		
		//1.1.5
		System.out.println("Second largest element in array: " + secondLargestElement(array));
		System.out.println();
		
		//1.1.6
		System.out.println("Count total number of even elements: " + countEvenElements(array));
		System.out.println("Count total number of odd elements: " + countOddElements(array));
		System.out.println();
		
		//1.1.7
		int[] newArray = copyArray(array);
		System.out.print("New array: ");
		printElementsOfArray(newArray);
		System.out.println();
		
		//1.1.8
		int positionInsert = 0;
		int valueInsert = 10;
		newArray = insertElement(array, positionInsert, valueInsert);
		System.out.printf("Array after insert an element %d at index %d: ", valueInsert, positionInsert);
		printElementsOfArray(newArray);
		System.out.println();
		
		//1.1.9
		int positionDelete = 0;
		newArray = deleteElement(newArray, positionDelete);
		System.out.printf("Array after delete an element at index %d: ", positionDelete);
		printElementsOfArray(newArray);
		System.out.println();
		
		//1.1.10
		System.out.printf("%-15s", "Elements:");
		for (int element: array) {
			System.out.printf("%5d", element);
		}
		System.out.println();
		System.out.printf("%-15s", "Count:");
		for (int element: array) {
			System.out.printf("%5d", countFrequency(array, element));
		}
		System.out.println();
		System.out.println();
		
		//1.1.11
		int[] reverseArray = getReverseArray(array);
		System.out.print("Reverse array: ");
		printElementsOfArray(reverseArray);
		System.out.println();
		
		//1.1.12
		int[] evenArray = getEvenArray(array);
		int[] oddArray = getOddArray(array);
		System.out.print("Even elements array: ");
		printElementsOfArray(evenArray);
		System.out.print("Odd elements array: ");
		printElementsOfArray(oddArray);
		System.out.println();
		
		//1.1.13
		int searchValue = 789;
		System.out.printf("Index of element %d in array: %d\n", searchValue, searchElement(array, searchValue));
		System.out.println();
		
		//1.1.14
		sortAscendingOrder(array);
		System.out.print("Array in ascending order: ");
		printElementsOfArray(array);
		sortDescendingOrder(array);
		System.out.print("Array in dexcending order: ");
		printElementsOfArray(array);
		System.out.println();
		
		//1.1.15
		int leftRotateTimes = 1;
		leftRotate(array, leftRotateTimes);
		System.out.printf("Array after %d time left rotate: ", leftRotateTimes);
		printElementsOfArray(array);
		
		//1.1.16
		int rightRotateTimes = 1;
		rightRotate(array, rightRotateTimes);
		System.out.printf("Array after %d time right rotate: ", rightRotateTimes);
		printElementsOfArray(array);
	}
}

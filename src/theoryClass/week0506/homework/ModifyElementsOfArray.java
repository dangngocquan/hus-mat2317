package theoryClass.week0506.homework;

/**
 * 
 * This program is used to insert, remove of modify the element of array.
 * 
 * @author Bris
 * @version 1.0
 * @since 2:14:23 PM -  Mar 22, 2022
 */
public class ModifyElementsOfArray {
	
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
	 * This method is used to insert a element to a index of array.
	 * 
	 * @param array is a old array.
	 * @param index is the index where you want to insert a new element.
	 * @param value is the value of the new element.
	 * @return Return a integer array after insert new element.
	 */
	public static int[] insertElement(int[] array, int value, int index) {
		int[] newArray = new int[array.length + 1];
		for (int i = 0; i < index; i++) {
			newArray[i] = array[i];
		}
		newArray[index] = value;
		for (int i = index + 1; i < newArray.length; i++) {
			newArray[i] = array[i-1];
		}
		return newArray;
	}
	
	/**
	 * 
	 * This method is used to remove a element in array.
	 * 
	 * @param arr is the array which you want to remove element.
	 * @param index is the index of element which you want to remove.
	 * @return Return a new array after remove a element.
	 */
	public static int[] removeElementInIndex(int[] arr, int index) {
		int[] newArray = new int[arr.length - 1];
		for (int i = 0; i < index; i++) {
			newArray[i] = arr[i];
		}
		for (int i = index + 1; i < arr.length; i++) {
			newArray[i-1] = arr[i];
		}
		return newArray;
	}
	
	/**
	 * 
	 * This method is used to modify a element in the array.
	 * 
	 * @param array is the array which you want to modify.
	 * @param indexModify is the index of the element which you want to modify.
	 * @param valueModify is the value of the new element.
	 */
	public static void modyfyElementAtIndex(int[] array, int indexModify, int valueModify) {
		array[indexModify] = valueModify;
	}
	
	/**
	 * 
	 * The main method - entry point of this program.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		//Create a array
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		//Print the array
		System.out.println("Array now: ");
		printArray(array);
		System.out.println();
		
		//Insert a element
		int valueInsert = 13;
		int indexInsert = 3;
		array = insertElement(array, valueInsert, indexInsert);
		System.out.println("Array after insert element " + valueInsert + " to index " + indexInsert + " of array: ");
		printArray(array);
		System.out.println();
		System.out.println();
		
		//Remove a element
		System.out.println("Array now: ");
		printArray(array);
		System.out.println();
		int indexRemove = 2;
		array = removeElementInIndex(array, indexRemove);
		System.out.println("Array after remove element which has index " + indexRemove + ": ");
		printArray(array);
		System.out.println();
		System.out.println();
		
		//Remove a element
		System.out.println("Array now: ");
		printArray(array);
		System.out.println();
		int indexModify = 1;
		int valueModify = 100;
		modyfyElementAtIndex(array, indexModify, valueModify);
		System.out.println("Array after modified element at index " + indexModify + " into " + valueModify + ": ");
		printArray(array);	
	}
}

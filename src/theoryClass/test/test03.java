package theoryClass.test;

public class test03 {
	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void printPrimeNumbers(int[] arr) {
		for (int element : arr) {
			if (isPrime(element)) {
				System.out.print(element + " ");
			}
		}
	}
	
	public static void printMinimumNumber(int[] arr) {
		int min = arr[0];
		int index = 0;
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
				index = i;
			}
		}
		System.out.println("Minumum number: " + min);
		System.out.println("Index: " + index);
	}
	
	public static void printArray(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
	
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 5, 7, 9, 11, 0, 13};
		
		
		System.out.println("Array:");
		printArray(array);
		System.out.println();
		
		System.out.println("Prime numbers:");
		printPrimeNumbers(array);
		System.out.println();
		
		printMinimumNumber(array);
	}
}

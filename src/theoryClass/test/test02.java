package theoryClass.test;

public class test02 {
	public static void modifyArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] *= 2;
		}
	}
	
	public static void modifyElement(int value) {
		value *= 2;
	}
	
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		
		modifyArray(a);
		for (int element : a) {
			System.out.print(element + " ");
		}
		
		System.out.println("=====================");
		modifyElement(a[0]);
		for (int element : a) {
			System.out.print(element + " ");
		}
	}
}

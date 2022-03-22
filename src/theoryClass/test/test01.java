package theoryClass.test;

public class test01 {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		//for
		for (int i = 0; i < a.length; i++) {
			a[i] *= 2;
			System.out.println(a[i]);
		}
		
		//while
		System.out.println("=========================");
		int index = 0;
		while (index < a.length) {
			System.out.println(a[index]);
			index++;
		}
		
		//for 
		System.out.println("=========================");
		for (int element : a) {
			System.out.println(element);
		}
	}
}

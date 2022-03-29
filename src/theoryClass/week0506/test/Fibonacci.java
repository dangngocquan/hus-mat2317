package theoryClass.week0506.test;

public class Fibonacci {
	public static int fibonacci(int k) {
		if (k == 0) {
			return 0;
		}
		if (k == 1) {
			return 1;
		}
		return fibonacci(k-1) + fibonacci(k-2);
	}
	
	public static int fibonacci1(int n) {
		int fnMinus2 = 0;
		int fnMinus1 = 1;
		int fn = fnMinus1 + fnMinus2;
		for (int i = 3; i <= n; i++) {
			fnMinus2 = fnMinus1;
			fnMinus1 = fn;
			fn = fnMinus1 + fnMinus2;
		}
		return fn;
	}
	
	public static void main(String[] args) {
		int n = 5;
		//using loops
		System.out.printf("fibonacci(%d) = %d\n", n, fibonacci1(n));
		
		//using recursive
		System.out.printf("fibonacci(%d) = %d", n, fibonacci(n));
	}
}

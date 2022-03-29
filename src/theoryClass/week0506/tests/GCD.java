package theoryClass.week0506.tests;

public class GCD {
	public static int gcd1(int n1, int n2) {
		if (n2 == 0) {
			return n1;
		}
		return gcd1(n2,n1%n2);
	}
	
	public static void main(String[] args) {
		//using recursive
		System.out.printf("gcd(%d,%d) = %d", 4, 10, gcd1(4, 10));
	}
}

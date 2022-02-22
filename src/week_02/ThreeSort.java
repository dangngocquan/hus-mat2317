package week_02;

public class ThreeSort {
	public static void main(String[] args) {
		long a = Long.parseLong(args[0]);
		long b = Long.parseLong(args[1]);
		long c = Long.parseLong(args[2]);
		long x1 = Math.min(Math.min(a, b),c);
		long x2;
		long x3 = Math.max(Math.max(a, b),c);
		x2 = (x1==a)? (x3==b? c:b) : (x1==b? (x3==a? c:a) : (x3==a? b:a));
		System.out.println(x1+ " " + x2 + " " + x3);
	}
}

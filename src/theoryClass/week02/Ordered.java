package theoryClass.week02;

public class Ordered {
	public static void main(String[] args) {
		long x = Long.parseLong(args[0]);
		long y = Long.parseLong(args[1]);
		long z = Long.parseLong(args[2]);
		boolean ans = (x <= y && y <= z) || (x >= y && y >= z);
		System.out.println(ans);
	}
}

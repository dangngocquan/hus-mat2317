package theory_week_02;

public class Distance {
	public static void main(String[] args) {
		long x = Long.parseLong(args[0]);
		long y = Long.parseLong(args[1]);
		double ans = Math.sqrt(x*x + y*y);
		System.out.println(ans);
	}
}

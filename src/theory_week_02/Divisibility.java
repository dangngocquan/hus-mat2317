package theory_week_02;

public class Divisibility {
	public static void main(String[] args) {
		long a = Long.parseLong(args[0]);
		long b = Long.parseLong(args[1]);
		boolean ans = (a%7 == 0) && (b%7 == 0);
		System.out.println(ans);
	}
}

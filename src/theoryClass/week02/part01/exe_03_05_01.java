package theoryClass.week02.part01;

public class exe_03_05_01 {
	public static void main(String[] args) {
		long a = Long.parseLong(args[0]);
		long b = Long.parseLong(args[1]);
		long c = Long.parseLong(args[2]);
		boolean ans = (a==b && b== c);
		System.out.println(ans);
	}
}

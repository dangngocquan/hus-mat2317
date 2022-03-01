package theoryClass.week02.part01;

public class DistanceOfTwoPoint {
	public static void main(String[] args) {
		long x1 = Long.parseLong(args[0]);
		long x2 = Long.parseLong(args[1]);
		long y1 = Long.parseLong(args[2]);
		long y2 = Long.parseLong(args[3]);
		double ans = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2,2));
		System.out.println(ans);
	}
}

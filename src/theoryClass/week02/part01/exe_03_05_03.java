package theoryClass.week02.part01;

public class exe_03_05_03 {
	public static void main(String[] args) {
		double x1 = Double.parseDouble(args[0]);
		double x2 = Double.parseDouble(args[1]);
		double y1 = Double.parseDouble(args[2]);
		double y2 = Double.parseDouble(args[3]);
		double ans = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2,2));
		System.out.println(ans);
	}
}

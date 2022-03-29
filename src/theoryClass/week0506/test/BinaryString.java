package theoryClass.week0506.test;

public class BinaryString {
	public static String getBinaryString1(int n) {
		String ans = "";
		while (n > 0) {
			ans = n%2 + ans;
			n /= 2;
		}
		return ans;
	}
	
	public static String getBinaryString2(int n) {
		if (n == 0) {
			return "";
		}
		return getBinaryString2(n/2) + n%2;
	}
	
	public static void main(String[] args) {
		System.out.println(getBinaryString1(2));
		System.out.println(getBinaryString2(4));
	}
}

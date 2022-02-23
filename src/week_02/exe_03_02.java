package week_02;

import java.util.Scanner;

public class exe_03_02 {
	static int counter(String s) {
		int ans = 0;
		char[] c = s.toCharArray();
		for (char i : c) ans++;
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the input characte string:	");
		String s = scanner.nextLine();
		while (s.isEmpty()) {
			System.out.print("Enter the input characte string:	");
			s = scanner.nextLine();
		}
		System.out.println(s + " has " + counter(s) + " characters." );
	}
}

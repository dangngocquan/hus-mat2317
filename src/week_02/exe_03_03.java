package week_02;

import java.util.Scanner;

public class exe_03_03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		System.out.print("Người phát ngôn?	");
		String name = scanner.nextLine();
		System.out.println(name + " nói, " + "\"" + s + "\"");
		scanner.close();
	}
}

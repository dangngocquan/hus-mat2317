package theory_week_02;

import java.util.Scanner;

public class exe_03_04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập danh từ: ");
		String s1 = scanner.nextLine();
		System.out.print("Nhập động từ: ");
		String s2 = scanner.nextLine();
		System.out.print("Nhập tính từ: ");
		String s3 = scanner.nextLine();
		System.out.print("Nhập trạng từ: ");
		String s4 = scanner.nextLine();
		scanner.close();
		System.out.println("Vào một ngày đẹp tr�?i, " + s1 + " đi chơi và " + s2 + ". Có thể nói, đó là một buổi đi chơi rất vui và " + s3 + ". Nhưng nó " + s4 + " quá...");
	}
}

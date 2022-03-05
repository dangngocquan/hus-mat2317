package practiceClass.week03;

import java.util.Scanner;

//Exercise 1.1
public class CheckPassFail {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input your mart: ");
		int mark = scanner.nextInt();
		scanner.close();
		//Solve + Output
		if (mark >= 50) {
			System.out.println("PASS");
		}else {
			System.out.println("FAIL");
		}
		System.out.println("DONE");
	}
}

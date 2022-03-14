package practiceClass.week05;

import java.util.Scanner;

//Exercise 1.13
public class CheckUglyNumber {
	static boolean isUglyNumber(int n) {
		if (n <= 0) return false;
		while (n != 1) {
			if (n % 5 == 0) {
				n /= 5;
			}else if (n % 3 == 0) {
				n /= 3;
			}else if (n % 2 == 0) {
				n /= 2;
			}else {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input an integer number: ");
		int n = scanner.nextInt();
		scanner.close();
		if (isUglyNumber(n)) {
			System.out.println("It is an ugly number.");
		}else {
			System.out.println("It is not an ugly number.");
		}
	}
}

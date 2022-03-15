package theoryClass.week04;

import java.util.Scanner;

//Exercise 3
public class PerfectNumber {
	static boolean isPerfectNumber(long n) {
		if (n < 0) {
			return false;
		}
		long i = (long)Math.sqrt(n);
		if (n == i*i) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Check perfect number.");
		System.out.print("Enter the number n = ");
		long n = scanner.nextLong();
		scanner.close();
		
		if (isPerfectNumber(n)) {
			System.out.printf("%d is a perfect number.", n);
		}else {
			System.out.printf("%d isn't a perfect number.", n);
		}
	}
}

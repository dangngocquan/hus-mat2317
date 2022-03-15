package theoryClass.week04;

import java.util.Scanner;

//Exercise 2
public class PrimeNumber {
	static boolean isPrime(long n) {
		if (n <= 1) {
			return false;
		}
		for (long i = 2; i <= Math.sqrt(n); i++) {
			if (n%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Check prime number.");
		System.out.print("Enter the number n = ");
		long n = scanner.nextLong();
		scanner.close();
		
		if (isPrime(n)) {
			System.out.printf("%d is a prime number.", n);
		}else {
			System.out.printf("%d isn't a prime number.", n);
		}
	}
}

package practiceClass.week05;

import java.util.Arrays;
import java.util.Scanner;

//Exercise 1.7
public class PrimesFinder {
	static int getNumberOfPrimesLessThanOrEqual(int number) {
		if (number <= 1) {
			return 0;
		}
		int counter = 0;
		boolean[] isPrime = new boolean[number+1];
		Arrays.fill(isPrime, true);
		isPrime[0] = false;
		isPrime[1] = false;
		for (int i = 2; i <= number; i++) {
			if (isPrime[i]) {
				counter++;
				for (int j = 2*i; j <= number; j += i) isPrime[j] = false;
			}
		}
		return counter;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a number: ");
		int number = scanner.nextInt();
		scanner.close();
		
		System.out.printf("Number of prime numbers which are less than or equal to %d: %d", number, getNumberOfPrimesLessThanOrEqual(number));
	}
}

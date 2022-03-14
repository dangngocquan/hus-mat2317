package practiceClass.week05;

import java.util.Arrays;
import java.util.Scanner;

//Exercise 1.8
public class PrimesSum {
	static long getPrimesSum(int number) {
		long sum = 0;
		boolean[] isPrime = new boolean[110000];
		Arrays.fill(isPrime, true);
		isPrime[0] = false;
		isPrime[1] = false;
		for (int i = 2; i < 110000; i++) {
			if (isPrime[i]) {
				sum += (long)i;
				number--;
				if (number == 0) break;
				for (int j = 2*i; j < 110000; j += i) isPrime[j] = false;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a number (n <= 10000) to compute the sum: ");
		int number = scanner.nextInt();
		scanner.close();
		
		System.out.printf("Sum of first %d prime numbers: %d", number, getPrimesSum(number));
	}
}

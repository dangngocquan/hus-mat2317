package practiceClass.week05;

import java.util.Scanner;

//Exercise 1.6
public class CheckPrimeNumber {
	static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	static int getPrimePosition(int number) {
		if (!isPrime(number)) {
			return 0;
		}
		int counter = 0;
		for (int i = 2; i <= number; i++) {
			if (isPrime(i)) {
				counter++;
			}
		}
		return counter;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a number: ");
		int number = scanner.nextInt();
		scanner.close();
		
		System.out.println("The given number is a prime number: " + isPrime(number));
		System.out.println("Position of the said prime number: " + getPrimePosition(number));
	}
}

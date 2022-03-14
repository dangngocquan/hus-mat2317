package practiceClass.week05;

import java.util.Scanner;

//Exercise 1.9
public class CheckPalindrome {
	static long getReverseNumber(long number) {
		long reverseNumber = 0;
		while (number > 0) {
			reverseNumber = reverseNumber*10 + (number % 10);
			number /= 10;
		}
		return reverseNumber;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a positive integer: ");
		long number = scanner.nextLong();
		scanner.close();
		
		System.out.printf("Is %d a palindrome number?\n", number);
		System.out.println(number == getReverseNumber(number));
	}
}

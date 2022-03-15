package theoryClass.week04;

import java.util.Scanner;

//Exercise 4
public class Palindrome {
	static boolean isPalindromeNumber(String n) {
		int size = n.length();
		for (int i = 0; i <= size/2; i++) {
			if (n.charAt(i) != n.charAt(size - 1 - i)) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Check palindrome number.");
		System.out.print("Enter the number n = ");
		String n = scanner.next();
		scanner.close();
		
		if (isPalindromeNumber(n)) {
			System.out.printf("%s is a palindrome number.", n);
		}else {
			System.out.printf("%s isn't a palindrome number.", n);
		}
	}
}

package practiceClass.week05;

import java.util.Scanner;

//Exercise 1.11
public class CheckPerfectSquareNumber {
	static boolean isPerfectSquareNumber(int n) {
		int i = (int)Math.sqrt(n);
		return i*i == n;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a positive integer: ");
		int number = scanner.nextInt();
		scanner.close();
		
		System.out.println("Is the said number perfect square? " + isPerfectSquareNumber(number));
	}
}

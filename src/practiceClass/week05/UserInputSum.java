package practiceClass.week05;

import java.util.Scanner;

//Exercise 1.14
public class UserInputSum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double number = 0.0;
		double sum = 0.0;
		do {
			System.out.print("Enter a number: ");
			number = scanner.nextDouble();
			if (number >= 0) sum += number;
		} while (number >= 0);
		scanner.close();
		System.out.println("Sum = " + sum);
	}
}

package practiceClass.week05;

import java.util.Scanner;

//Exercise 1.15
public class PositiveNumbersSum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double sum = 0.0;
		for (int i = 1; i <= 5; i++) {
			System.out.printf("Enter number %d: ", i);
			double x = scanner.nextDouble();
			if (x >= 0) sum += x;
		}
		scanner.close();
		System.out.println("Sum = " + sum);
	}
}

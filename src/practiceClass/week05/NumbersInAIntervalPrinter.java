package practiceClass.week05;

import java.util.Scanner;

//Exercise 1.4
public class NumbersInAIntervalPrinter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input first number: ");
		int firstNumber = scanner.nextInt();
		System.out.print("Input second number: ");
		int secondNumber = scanner.nextInt();
		System.out.print("Input third number: ");
		int thirdNumber = scanner.nextInt();
		scanner.close();
		
		int counter = 0;
		System.out.printf("The numbers are divible by %d: ", thirdNumber);
		for (int i = firstNumber; i <= secondNumber; i++) {
			if (i % thirdNumber == 0) {
				counter++;
				System.out.print(i + " ");
			}
		}
		
		System.out.printf("\nThere are %d numbers are divible by %d.", counter, thirdNumber);
	}
}

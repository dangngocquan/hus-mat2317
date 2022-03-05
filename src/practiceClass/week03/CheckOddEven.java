package practiceClass.week03;

import java.util.Scanner;

//Exercise 1.2
public class CheckOddEven {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input number: ");
		int number = scanner.nextInt();
		scanner.close();
		System.out.println("The number is " + number);
		//Solve + Output
		if (number % 2 == 0) {
			System.out.println("Even number.");
		}else {
			System.out.println("Odd number.");
		}
		System.out.println("Bye!!!!");
	}
}

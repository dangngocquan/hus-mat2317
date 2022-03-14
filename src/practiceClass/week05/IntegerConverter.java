package practiceClass.week05;

import java.util.Scanner;

//Exercise 1.1
public class IntegerConverter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a number (string): ");
		String stringNumber = scanner.nextLine();
		scanner.close();
		
		int number = Integer.parseInt(stringNumber);
		System.out.printf("The integer value is: %d", number);
	}
}

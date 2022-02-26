package practice_week_02;

import java.util.Scanner;

public class exe_01_09_ModulesCalculator {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the first number: ");
		int number1 = scanner.nextInt();
		System.out.print("Input the second number: ");
		int number2 = scanner.nextInt();
		scanner.close();
		//Solve
		int divided = number1 / number2;
		int module = number1 - number2 * divided;
		//Output
		System.out.printf("%d module %d give %d", number1, number2, module);
	}
}

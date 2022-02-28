package practiceClass.week02;

import java.util.Scanner;

//Exercise 1.9
public class ModulesCalculator {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the first number: ");
		int firstNumber = scanner.nextInt();
		System.out.print("Input the second number: ");
		int secondNumber = scanner.nextInt();
		scanner.close();
		//Solve
		int divided = firstNumber / secondNumber;
		int module = firstNumber - secondNumber * divided;
		//Output
		System.out.printf("%d module %d give %d", firstNumber, secondNumber, module);
	}
}

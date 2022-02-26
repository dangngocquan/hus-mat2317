package practice_week_02;

import java.util.Scanner;

public class exe_01_04_Operations {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input first number: ");
		int number1 = scanner.nextInt();
		System.out.print("Input second number: ");
		int number2 = scanner.nextInt();
		scanner.close();
		//Output
		System.out.printf("%d %s %d %s %d",number1,"+",number2,"=",number1 + number2);
		System.out.println();
		System.out.printf("%d %s %d %s %d",number1,"-",number2,"=",number1 - number2);
		System.out.println();
		System.out.printf("%d %s %d %s %d",number1,"*",number2,"=",number1 * number2);
		System.out.println();
		System.out.printf("%d %s %d %s %d",number1,"/",number2,"=",number1 / number2);
		System.out.println();
		System.out.printf("%d %s %d %s %d",number1,"mod",number2,"=",number1 % number2);
	}
}

package practiceClass.week05;

import java.util.Scanner;

//Exercise 1.10
public class GreatestCommonDivisor {
	static int euclid(int n1, int n2) {
		while (n1 != n2) {
			if (n1 > n2) {
				n1 -= n2;
			}else {
				n2 -= n1;
			}
		}
		return n1;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the first number: ");
		int firstNumber = scanner.nextInt();
		System.out.print("Input the second number: ");
		int secondNumber = scanner.nextInt();
		scanner.close();
		
		System.out.printf("Greatest common divisor of two number is: %d", euclid(firstNumber, secondNumber));
	}
}

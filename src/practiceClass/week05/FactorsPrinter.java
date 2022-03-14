package practiceClass.week05;

import java.util.Scanner;

//Exercise 1.5
public class FactorsPrinter {
	static int countFactors(int number) {
		int counter = 0;
		for (int i = 1; i <= Math.sqrt(number); i++) {
			if (number % i == 0 && i*i != number) {
				counter += 2;
			}else if (i*i == number) {
				counter++;
			}
		}
		return counter;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input an integer: ");
		int number = scanner.nextInt();
		scanner.close();
		
		System.out.printf("Number of the factors are: %d", countFactors(number));
	}
}

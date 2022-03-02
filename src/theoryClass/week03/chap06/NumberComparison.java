package theoryClass.week03.chap06;

import java.util.Scanner;
import java.util.regex.Pattern;

//Exercise 6.8
public class NumberComparison {
	static boolean isValidNumber(String number) {
		if (Pattern.matches("[-]{0,2}[0-9]{1,}", number) || Pattern.matches("[-]{0,2}[0-9]{1,}.[0-9]{1,}", number)) {
			return true;
		}else {
			return false;
		}
	}
	
	static boolean isValidInput(String firstNumber, String secondNumber, String thirdNumber) {
		if (isValidNumber(firstNumber) && isValidNumber(secondNumber) && isValidNumber(thirdNumber)) {
			return true;
		}else {
			System.out.println();
			System.out.println("Those numbers are invalid. Please try again !");
			System.out.println();
			return false;
		}
	}
	
	static boolean isCompareNumbers(String firstNumber, String secondNumber, String thirdNumber) {
		return (firstNumber.equals(secondNumber) && secondNumber.equals(thirdNumber)); 
	}
	
	static void printInAscendingOrder(String firstNumber1, String secondNumber1, String thirdNumber1) {
		double firstNumber = Double.parseDouble(firstNumber1);
		double secondNumber = Double.parseDouble(secondNumber1);
		double thirdNumber = Double.parseDouble(thirdNumber1);
		System.out.print("Those numbers in ascending order: ");
		if (firstNumber < secondNumber) {
			if (secondNumber < thirdNumber) {
				System.out.print(firstNumber + " " + secondNumber + " " + thirdNumber);
			}else {
				if (firstNumber < thirdNumber) {
					System.out.print(firstNumber + " " + thirdNumber + " " + secondNumber);
				}else {
					System.out.print(thirdNumber + " " + firstNumber + " " + secondNumber);
				}
			}
		}else {
			if (firstNumber < thirdNumber) {
				System.out.print(secondNumber + " " + firstNumber + " " + thirdNumber);
			}else {
				if (secondNumber < thirdNumber) {
					System.out.print(secondNumber + " " + thirdNumber + " " + firstNumber);
				}else {
					System.out.print(thirdNumber + " " + secondNumber + " " + firstNumber);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		String firstNumber, secondNumber, thirdNumber;
		do {
			System.out.print("Input the first number: ");
			firstNumber = scanner.nextLine();
			System.out.print("Input the second number: ");
			secondNumber = scanner.nextLine();
			System.out.print("Input the third number: ");
			thirdNumber = scanner.nextLine();
		}while (!isValidInput(firstNumber, secondNumber, thirdNumber));
		scanner.close();
		
		//Output
		if (isCompareNumbers(firstNumber, secondNumber, thirdNumber)) {
			System.out.println("Those numbers are compare.");
		}else {
			System.out.println("Those numbers aren't compare.");
		}
		printInAscendingOrder(firstNumber, secondNumber, thirdNumber);
	}
}

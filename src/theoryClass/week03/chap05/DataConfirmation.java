package theoryClass.week03.chap05;

import java.util.Scanner;
import java.util.regex.Pattern;

//Exercise 5.4
public class DataConfirmation {
	static boolean isValidLastName(String lastName) {
		return Pattern.matches("[a-zA-Z\s]{2,}", lastName);
	}
	
	static boolean isValidFirstName(String firstName) {
		return Pattern.matches("[a-zA-Z\s]{2,}", firstName);
	}
	
	static boolean isValidZipCode(String zipCode) {
		return Pattern.matches("[0-9]{1,}", zipCode);
	}
	
	static boolean isValidEmployeeCode(String employeeCode) {
		return Pattern.matches("[A-Z]{2}-[0-9]{4}", employeeCode);
	}
	
	static void validateInput(String lastName, String firstName, String zipCode, String employeeCode) {
		int errorCount = 0;
		if (lastName.isEmpty()) {
			System.out.println("The last name can't be empty!");
			errorCount++;
		}else if (!isValidLastName(lastName)) {
			System.out.println("The last name is invalid!");
			errorCount++;
		}
		if (firstName.isEmpty()) {
			System.out.println("The first name can't be empty!");
			errorCount++;
		}else if (!isValidFirstName(firstName)) {
			System.out.println("The first name is invalid!");
			errorCount++;
		}
		if (!isValidZipCode(zipCode)) {
			System.out.println("The ZIP code is invalid!");
			errorCount++;
		}
		if (!isValidEmployeeCode(employeeCode)) {
			System.out.println("The employee code is invalid!");
			errorCount++;
		}
		if (errorCount == 0) {
			System.out.println("No errors found.");
		}
	}
	
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the last name [A-Za-z]: ");
		String lastName = scanner.nextLine();
		System.out.print("Input the first name [A-Za-z]: ");
		String firstName = scanner.nextLine();
		System.out.print("Input the ZIP code [0-9]: ");
		String zipCode = scanner.nextLine();
		System.out.print("Input the employee code (AA-1234): ");
		String employeeCode = scanner.nextLine();
		scanner.close();
		//Output
		System.out.println();
		validateInput(lastName, firstName, zipCode, employeeCode);
	}
}

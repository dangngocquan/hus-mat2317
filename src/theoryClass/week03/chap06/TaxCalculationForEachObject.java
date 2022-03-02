package theoryClass.week03.chap06;

import java.util.Scanner;
import java.util.regex.Pattern;

//Exercise 6.7
public class TaxCalculationForEachObject {
	static boolean isValidValue(String value) {
		if (Pattern.matches("[0-9]{1,}", value) || Pattern.matches("[0-9]{1,}.[0-9]{1,}", value)) {
			return true;
		}else {
			System.out.println();
			System.out.println("This value is invalid. Please try again !!");
			System.out.println();
			return false;
		}
	}
	
	static boolean isValidDistrictOfWisconsin(String district) {
		if (!district.equals("eau claire") && !district.equals("dunn")) {
			System.out.println();
			System.out.println("This district is invalid. Please try again !");
			System.out.println();
			return false;
		}else {
			return true;
		}
	}
	
	static double getTax(String initialMoney1, double taxRate) {
		double initialMoney = Double.parseDouble(initialMoney1);
		return initialMoney*taxRate/100;
	}
	
	static double getTotal(String initialMoney1, double taxRate) {
		double initialMoney = Double.parseDouble(initialMoney1);
		return initialMoney*(100+taxRate)/100;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String initialMoney = "";
		do {
			System.out.print("Input the initial money: $");
			initialMoney = scanner.nextLine();
		}while (!isValidValue(initialMoney));
		
		System.out.print("Input the state (Wisconsin, Illinois or other): ");
		String state = scanner.nextLine().toLowerCase();
		
		switch (state) {
		case "wisconsin":
			String district = "";
			do {
				System.out.print("Input the district (Eau Claire/ Dunn): ");
				district = scanner.nextLine().toLowerCase();
			}while (!isValidDistrictOfWisconsin(district));
			switch (district) {
			case "eau claire":
				System.out.println("The tax is $" + getTax(initialMoney, 5));
				System.out.println("The total is $" + getTotal(initialMoney, 5));
				break;
			case "dunn":
				System.out.println("The tax is $" + getTax(initialMoney, 4));
				System.out.println("The total is $" + getTotal(initialMoney, 4));
				break;
			}
			break;
		case "illinois":
			System.out.println("The tax is $" + getTax(initialMoney, 8));
			System.out.println("The total is $" + getTotal(initialMoney, 8));
			break;
		default:
			System.out.println("The tax is $" + getTax(initialMoney, 0));
			System.out.println("The total is $" + getTotal(initialMoney, 0));
			break;
		}
		scanner.close();
	}
}

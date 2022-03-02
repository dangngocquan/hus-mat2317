package theoryClass.week03.chap06;

import java.util.Scanner;
import java.util.regex.Pattern;

//Exercise 6.3
public class BloodAlcoholConcentrationCalculator {
	
	
	
	
	static boolean isValidWeight(String weight) {
		return Pattern.matches("[0-9]{1,}.{1}[0-9]{1,}", weight) || Pattern.matches("[0-9]{1,}", weight);
	}
	
	static boolean isValidGender(String gender) {
		return gender.equals("Male") || gender.equals("Female");
	}
	
	static boolean isValidNumberOfBottles(String numberOfBottles) {
		return Pattern.matches("[1-9]{1}[0-9]{0,}", numberOfBottles);
	}
	
	static boolean isValidACOfDrink(String ACOfdrink) {
		return Pattern.matches("[0-9]{1,}.{1}[0-9]{1,}", ACOfdrink) || Pattern.matches("[0-9]{1,}", ACOfdrink);
	}
	
	static boolean isValidTimeSinceLastDrink(String timeSinceLastDrink) {
		return Pattern.matches("[0-9]{1,}.{1}[0-9]{1,}", timeSinceLastDrink) || Pattern.matches("[0-9]{1,}", timeSinceLastDrink);
	}
	
	static boolean isValidInput(String weight, String gender, String numberOfBottles, String ACOfDrink, String timeSinceLastDrink) {
		int errorCount = 0;
		System.out.println();
		if (!isValidWeight(weight)) {
			errorCount++;
			System.out.println("The weight is invalid !");
		}
		if (!isValidGender(gender)) {
			errorCount++;
			System.out.println("The gender is invalid !");
		}
		if (!isValidNumberOfBottles(numberOfBottles)) {
			errorCount++;
			System.out.println("The number of bottles is invalid !");
		}
		if (!isValidACOfDrink(ACOfDrink)) {
			errorCount++;
			System.out.println("The alcohol concentration of drink is invalid !");
		}
		if (!isValidTimeSinceLastDrink(timeSinceLastDrink)) {
			errorCount++;
			System.out.println("The number of hours since last drink is invalid!");
		}
		if (errorCount == 0) {
			return true;
		}else {
			System.out.println("Please try again !");
			System.out.println();
			return false;
		}
	}
	
	static double getBAC(String weight1, String gender, String numberOfBottles1, String ACOfDrink1, String timeSinceLastDrink1) {
		double W = Double.parseDouble(weight1);
		int numberOfBottles = Integer.parseInt(numberOfBottles1);
		double ACOfDrink = Double.parseDouble(ACOfDrink1);
		double timeSinceLastDrink = Double.parseDouble(timeSinceLastDrink1);
		double r;
		if (gender.equals("Male")) {
			r = 0.73;
		}else {
			r = 0.66;
		}
		double A = numberOfBottles*ACOfDrink;
		double BAC = (A*(5.14/W)*r) - 0.15*timeSinceLastDrink;
		return BAC;
	}
	
	static boolean canDrive(double BAC) {
		if (BAC < 0.08) return true;
		return false;
	}
	
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		String weight, gender, numberOfBottles, ACOfDrink, timeSinceLastDrink;
		do {
			System.out.print("Input your weight (pound): ");
			weight = scanner.nextLine();
			System.out.print("Input your gender (Male/Female): ");
			gender = scanner.nextLine();
			System.out.print("Input the number of bottles of drink: ");
			numberOfBottles = scanner.nextLine();
			System.out.print("Input the alcohol concentration of a bottle of drink: ");
			ACOfDrink = scanner.nextLine();
			System.out.print("Input the number of hours since last drink: ");
			timeSinceLastDrink = scanner.nextLine();
		} while (!isValidInput(weight, gender, numberOfBottles, ACOfDrink, timeSinceLastDrink));
		scanner.close();
		//Output
		double BAC = getBAC(weight, gender, numberOfBottles, ACOfDrink, timeSinceLastDrink);
		System.out.println("Your blood alcohol concentration is " + BAC);
		if (canDrive(BAC)) {
			System.out.println("You are allowed to drive.");
		}else {
			System.out.println("You aren't allowed to drive.");
		}
	}
}

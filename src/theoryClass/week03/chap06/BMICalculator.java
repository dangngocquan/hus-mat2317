package theoryClass.week03.chap06;

import java.util.Scanner;
import java.util.regex.Pattern;

//Exercise 6.5
public class BMICalculator {
	static boolean isValidWeight(String weight) {
		return Pattern.matches("[0-9]{1,}", weight) || Pattern.matches("[0-9]{1,}.[0-9]{1,}", weight);
	}
	
	static boolean isValidHeight(String height) {
		return Pattern.matches("[0-9]{1,}", height) || Pattern.matches("[0-9]{1,}.[0-9]{1,}", height);
	}
	
	static boolean isValidInput(String weight, String height) {
		System.out.println();
		int errorCount = 0;
		if (!isValidWeight(weight)) {
			errorCount++;
			System.out.println("The weight is invalid !");
		}
		if (!isValidHeight(height)) {
			errorCount++;
			System.out.println("The height is invalid !");
		}
		if (errorCount == 0) {
			return true;
		}else {
			System.out.println("Please try again !");
			System.out.println();
			return false;
		}
	}
	
	static double getBMI(String weight1, String height1) {
		double weight = Double.parseDouble(weight1);
		double height = Double.parseDouble(height1);
		double BMI = (weight/(height*height))*703;
		return BMI;
	}
	
	static void comment(double BMI) {
		System.out.println("Your BMI is " + BMI);
		if (18.5 <= BMI && BMI <= 25) {
			System.out.println("You have a normal health.");
		}else if (BMI < 18.5) {
			System.out.println("You are underweight. You should consult your doctor.");
		}else {
			System.out.println("You are overweight. You should consult your doctor.");
		}
	}
	public static void main(String[] args) {
		//Input
		Scanner scanner =new Scanner(System.in);
		String weight, height;
		do {
			System.out.print("Input your weight (pound): ");
			weight = scanner.nextLine();
			System.out.print("Input your height (inch): ");
			height = scanner.nextLine();
		}while (!isValidInput(weight, height));
		scanner.close();
		//Output
		double BMI = getBMI(weight, height);
		comment(BMI);
	}
}

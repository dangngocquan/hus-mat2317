package theoryClass.week03.chap06;

import java.util.Scanner;
import java.util.regex.Pattern;

//Exercise 6.4
public class TemperatureUnitConversion {
	static boolean isValidCharInput(char charInput) {
		if (Pattern.matches("[CcFf]{1}", charInput+"")) {
			return true;
		}else {
			System.out.println();
			System.out.println("Your choice is invalid. Please try again !");
			System.out.println();
			return false;
		}
	}
	
	static boolean isValidValue(String degree) {
		if (Pattern.matches("[-]{0,2}[0-9]{1,}", degree) || Pattern.matches("[-]{0,2}[0-9]{1,}.[0-9]{1,}", degree)) {
			return true;
		}else {
			System.out.println();
			System.out.println("Your value is invalid. Please try again !");
			System.out.println();
			return false;
		}
	}
	
	static double CelsiusToFahrenheit(String celsius1) {
		double celsius = Double.parseDouble(celsius1);
		double fahrenheit = celsius*9.0/5 + 32;
		return fahrenheit;
	}
	
	static double FahrenheitToCelsius(String fahrenheit1) {
		double fahrenheit = Double.parseDouble(fahrenheit1);
		double celsius = (fahrenheit-32)*5.0/9;
		return celsius;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		char charInput;
		do {
			System.out.println("Press 'C' or 'c' if you want to convert Fahrenheit to Celsius.");
			System.out.println("Press 'F' or 'f' if you want to convert Celsius to Fahrenheit.");
			System.out.print("Input yout choice: ");
			charInput = scanner.nextLine().toUpperCase().charAt(0);
		}while(!isValidCharInput(charInput));
		
		switch (charInput) {
		case 'C':
			String fahrenheit;
			do {
				System.out.print("Input the degree Fahrenheit: ");
				fahrenheit = scanner.nextLine();
			}while (!isValidValue(fahrenheit));
			System.out.println("The temperature in degree Celsius is " + FahrenheitToCelsius(fahrenheit));
			break;
		case 'F':
			String celsius;
			do {
				System.out.print("Input the degree Celsius: ");
				celsius = scanner.nextLine();
			}while (!isValidValue(celsius));
			System.out.println("The temperature in degree Fahrenheit is " + CelsiusToFahrenheit(celsius));
			break;
		}
		scanner.close();
	}
}

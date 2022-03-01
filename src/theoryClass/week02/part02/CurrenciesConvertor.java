package theoryClass.week02.part02;

import java.util.Scanner;

//Exercise 4.4
public class CurrenciesConvertor {
	static double toDollars(double euros, double conversionRate) {
		return euros*conversionRate;
	}
	
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the number of Euros you want to convert: ");
		double euros = scanner.nextDouble();
		System.out.print("Input the conversion rate (Euros to Dollars): ");
		double conversionRate = scanner.nextDouble();
		scanner.close();
		//Output
		System.out.printf("%s Euros with a conversion rate of %s is %.2f Dollars",euros, conversionRate, toDollars(euros, conversionRate));
	}
}

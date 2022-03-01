package theoryClass.week02.part02;

import java.util.Scanner;

//Exercise 4.5
public class InterestMoneyCalculator {
	static double getProceeds(double initialMoney, double interestRate, long year) {
		return initialMoney*(1+ interestRate*year/100);
	}
	
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the initial money (millions VND): ");
		double initialMoney = scanner.nextDouble();
		System.out.print("Input the interest rate as percentage per year: ");
		double interestRate = scanner.nextDouble();
		System.out.print("Input the number of year which you want to deposits saving: ");
		long year = scanner.nextLong();
		scanner.close();
		//Output
		System.out.printf("After %d years, with an interest rate of %s%s, the total proceeds is %s millions VND.", year, interestRate,"% per year", getProceeds(initialMoney, interestRate, year));
	}
}

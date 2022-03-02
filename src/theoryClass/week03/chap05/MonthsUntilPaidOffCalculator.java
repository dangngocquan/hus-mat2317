package theoryClass.week03.chap05;

import java.util.Scanner;

//Exercise 5.3
public class MonthsUntilPaidOffCalculator {
	static long notifyMonthsUntilPaidOff(double debitBalance, double interestRate, double amountPaidPerMonth) {
		double i = interestRate/365;
		double b = debitBalance;
		double p = amountPaidPerMonth;
		double numberMonth = - (Math.log(1+(b/p)*(1-(1-Math.pow(1+i, 30)))))/(30*Math.log(1+i));
		return (long)Math.ceil(numberMonth);
	}
	
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input your credit debit balance: ");
		double debitBalance = scanner.nextDouble();
		System.out.print("Input the interest rate as percentage per year: ");
		double interestRate = scanner.nextDouble();
		System.out.print("Input the amount that you can paid per month: ");
		double amountPaidPerMonth = scanner.nextDouble();
		scanner.close();
		//Output
		System.out.printf("You need %d month to pay off your credit debit balance.", notifyMonthsUntilPaidOff(debitBalance, interestRate, amountPaidPerMonth));
	}
}

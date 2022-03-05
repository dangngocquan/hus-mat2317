package practiceClass.week03;

import java.util.Scanner;

//Exercise 1.6
public class LeapYear {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the year: ");
		int year = scanner.nextInt();
		scanner.close();
		//Solve + Output
		boolean isDivisibleBy4 = (year%4) == 0;
		boolean isDivisibleBy100 = (year%100) == 0;
		boolean isDivisibleBy400 = (year%400) == 0;
		if (isDivisibleBy400 || (isDivisibleBy4 && !isDivisibleBy100)) {
			System.out.println(year + " is a leap year.");
		}else {
			System.out.println(year + " is not a leap year.");
		}
	}
}

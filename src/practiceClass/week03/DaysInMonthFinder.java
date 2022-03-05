package practiceClass.week03;

import java.util.Scanner;

//Exercise 1.7
public class DaysInMonthFinder {
	static boolean isLeapYear(int year) {
		return (year%400 == 0) || (year%4==0 && !(year%100 == 0));
	}
	
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a month number: ");
		int month = scanner.nextInt();
		System.out.print("Input a year: ");
		int year = scanner.nextInt();
		scanner.close();
		//Solve
		int numberOfDaysInMonth = 0;
		String nameOfMonth = "Unknown";
		switch (month) {
		case 1:
			nameOfMonth = "January";
			numberOfDaysInMonth = 31;
			break;
		case 2:
			nameOfMonth = "February";
			if (isLeapYear(year)) {
				numberOfDaysInMonth = 29;
			}else {
				numberOfDaysInMonth = 28;
			}
			break;
		case 3:
			nameOfMonth = "March";
			numberOfDaysInMonth = 31;
			break;
		case 4:
			nameOfMonth = "April";
			numberOfDaysInMonth = 30;
			break;
		case 5:
			nameOfMonth = "May";
			numberOfDaysInMonth = 31;
			break;
		case 6:
			nameOfMonth = "June";
			numberOfDaysInMonth = 30;
			break;
		case 7:
			nameOfMonth = "July";
			numberOfDaysInMonth = 31;
			break;
		case 8:
			nameOfMonth = "August";
			numberOfDaysInMonth = 31;
			break;
		case 9:
			nameOfMonth = "September";
			numberOfDaysInMonth = 30;
			break;
		case 10:
			nameOfMonth = "October";
			numberOfDaysInMonth = 31;
			break;
		case 11:
			nameOfMonth = "November";
			numberOfDaysInMonth = 30;
			break;
		case 12:
			nameOfMonth = "December";
			numberOfDaysInMonth = 31;
			break;
		}
		//Output
		System.out.println(nameOfMonth + " " + year + " has " + numberOfDaysInMonth + " days.");
	}
}

package theoryClass.week02.part02;

import java.util.Scanner;

//Exercise 4.7
public class DayOfWeek {
	static boolean isLeapYear(int year) {
		if (year % 400 == 0 || (year % 4 == 0) && (year % 100 != 0)) return true;
		return false;
	}
	
	static boolean isValid(int month, int day, int year) {
		if (month < 1 || month > 12) return false;
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			if (day > 31 || day < 0) return false;
		}else if (month == 4 || month == 6 || month == 9 || month == 11) {
			if (day > 30 || day < 0) return false;
		}else {
			if (isLeapYear(year)) {
				if (day > 29 || day < 0) return false;
			}else {
				if (day > 28 || day < 0) return false;
			}
		}
		return true;
	}
	
	static String getDayOfWeek(int month, int day, int year) {
		String dayOfWeek = "";
		int y0 = year - (14-month)/12;
		int x = y0 + y0/4 - y0/100 + y0/400;
		int m0 = month + 12*((14-month)/12) - 2;
		int d0 = (day + x + 31*m0/12) % 7;
		switch (d0) {
		case 0:
			dayOfWeek = "Sunday";
			break;
		case 1:
			dayOfWeek = "Monday";
			break;
		case 2:
			dayOfWeek = "Tuesday";
			break;
		case 3:
			dayOfWeek = "Wednesday";
			break;
		case 4:
			dayOfWeek = "Thursday";
			break;
		case 5:
			dayOfWeek = "Friday";
			break;
		case 6:
			dayOfWeek = "Saturday";
			break;
		}
		return dayOfWeek;
	}
	
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		int month, day, year;
		do {
			System.out.print("Input the month: ");
			month = scanner.nextInt();
			System.out.print("Input the day: ");
			day = scanner.nextInt();
			System.out.print("Input the year: ");
			year = scanner.nextInt();
			if (!isValid(month, day, year)) System.out.println("The data is invalid. Please try again !!!");
		} while (!isValid(month, day, year));
		scanner.close();
		//Output
		System.out.printf("%d/%d/%d (mm/dd/yyyy) is %s.",month, day, year, getDayOfWeek(month, day, year));
	}
}

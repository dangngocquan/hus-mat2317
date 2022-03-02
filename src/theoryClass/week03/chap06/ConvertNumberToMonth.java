package theoryClass.week03.chap06;

import java.util.Scanner;
import java.util.regex.Pattern;

//Exercise 6.6.3
public class ConvertNumberToMonth {
	static boolean isValidNumber(String month) {
		if (Pattern.matches("[1-9]{1}", month) || Pattern.matches("1[0-2]{1}", month)) {
			return true;
		}else {
			System.out.println();
			System.out.println("This number is invalid. Please try again !");
			System.out.println();
			return false;
		}
	}
	
	static String convertNumberToMonth(String n1) {
		int n = Integer.parseInt(n1);
		String month = "";
		switch (n) {
		case 1:
			month = "January";
			break;
		case 2:
			month = "February";
			break;
		case 3:
			month = "March";
			break;
		case 4:
			month = "April";
			break;
		case 5:
			month = "May";
			break;
		case 6:
			month = "June";
			break;
		case 7:
			month = "July";
			break;
		case 8:
			month = "August";
			break;
		case 9:
			month = "September";
			break;
		case 10:
			month = "October";
			break;
		case 11:
			month = "November";
			break;
		case 12:
			month = "December";
			break;
		}
		return month;
	}
	
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		String month = "";
		do {
			System.out.print("Input the number of month (1-12): ");
			month = scanner.nextLine();
		}while (!isValidNumber(month));
		scanner.close();
		//Output
		System.out.println("The corresponding month is " + convertNumberToMonth(month));
		
	}
}

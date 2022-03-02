package theoryClass.week03.chap06;

import java.util.Scanner;
import java.util.regex.Pattern;

//Exercise 6.6.2
public class ConvertNumberToDayOfWeek {
	static boolean isValidNumber(String n) {
		if (Pattern.matches("[1-7]{1}", n)) {
			return true;
		}else {
			System.out.println();
			System.out.println("This number is invalid. Please try again !");
			System.out.println();
			return false;
		}
	}
	
	static String getDayOfWeek(String n1) {
		int n = Integer.parseInt(n1);
		String dayOfWeek = "";
		switch (n) {
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
		case 7:
			dayOfWeek = "Sunday";
			break;
		}
		return dayOfWeek;
	}
	
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		String n;
		do {
			System.out.print("Input number (1-7): ");
			n = scanner.nextLine();
		}while(!isValidNumber(n));
		scanner.close();
		//Output
		System.out.println("Today is " + getDayOfWeek(n));
		
	}
}

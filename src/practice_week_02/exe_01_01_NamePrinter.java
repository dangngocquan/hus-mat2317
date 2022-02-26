package practice_week_02;

import java.util.Scanner;

public class exe_01_01_NamePrinter {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input your first name: ");
		String firstName = scanner.next();
		System.out.print("Input your last name: ");
		String lastName = scanner.next();
		scanner.close();
		//Output
		System.out.println();
		System.out.println("Hello \n" + firstName + " " + lastName);
	}
}

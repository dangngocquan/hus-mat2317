package practiceClass.week02;

import java.util.Scanner;

//Exercise 1.1
public class NamePrinter {
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

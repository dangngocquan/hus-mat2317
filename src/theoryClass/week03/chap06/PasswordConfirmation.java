package theoryClass.week03.chap06;

import java.util.Scanner;

//Exercise 6.1
public class PasswordConfirmation {
	public static void main(String[] args) {
		String defaultUserID = "BrisS";
		String defaultPassword = "bris104";
		//Input
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input userID: ");
		String userID = scanner.next();
		System.out.printf("Input password for \"%s\": ",userID);
		String password = scanner.next();
		scanner.close();
		//Output
		if (userID.equals(defaultUserID)) {
			if (password.equals(defaultPassword)) {
				System.out.println("Hello, my master :3");
			}else {
				System.out.println("The password is incorrect !!");
			}
		}else {
			System.out.println("I don't know you >.< ");
		}
	}
}

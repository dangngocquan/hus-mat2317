package other.file01;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		AccountManager accountmanager = new AccountManager();
		int choice = -1;
		while (choice != 0) {
			accountmanager.showMenu();
			System.out.println("Your choice (0-7):	");
			choice = scanner.nextInt();
			switch (choice) {
				case 1:
					accountmanager.addNewAccount(scanner);
					break;
				case 2:
					accountmanager.showListAccount();
					break;
				case 3:
					accountmanager.sortBySoDuTK();
					break;
				case 4:
					accountmanager.findAccountBySoDuTK(scanner);
					break;
				case 5:
					accountmanager.renameAccountByMaTK(scanner);
					break;
				case 6:
					accountmanager.removeAccountByMaTK(scanner);
					break;
				case 7:
					accountmanager.insertNewAccount(scanner);
					break;
			}
		}
		scanner.close();
	}
}

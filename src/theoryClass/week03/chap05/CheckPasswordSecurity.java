package theoryClass.week03.chap05;

import java.util.Scanner;

//Exercise 5.2
public class CheckPasswordSecurity {
	static boolean isSpecialCharacter(char c) {
		if (c >= '0' && c <= '9') return false;
		if (c >= 'A' && c <= 'Z') return false;
		if (c >= 'a' && c <= 'z') return false;
		return true;
	}
	
	static boolean isDigitCharacter(char c) {
		if (c >= '0' && c <= '9') return true;
		return false;
	}
	
	static boolean isAlphabetCharacter(char c) {
		if (c >= 'A' && c <= 'Z') return true;
		if (c >= 'a' && c <= 'z') return true;
		return false;
	}
	
	static String passwordValidator(String password) {
		String securityLevel = "Medium";
		if (password.length() < 8) {
			securityLevel = "Very weak";
			for (int i = 0; i < password.length(); i++) {
				if (!isDigitCharacter(password.charAt(i))) {
					securityLevel = "Weak";
					break;
				}
			}
		}else {
			boolean hasAlphaBetCharacter = false;
			boolean hasDigitCharacter = false;
			boolean hasSpecialCharacter = false;
			for (int i = 0; i < password.length(); i++) {
				char c = password.charAt(i);
				if (isAlphabetCharacter(c)) {
					hasAlphaBetCharacter = true;
				}else if (isDigitCharacter(c)) {
					hasDigitCharacter = true;
				}else {
					hasSpecialCharacter = true;
				}
			}
			if(hasAlphaBetCharacter && hasDigitCharacter && hasSpecialCharacter) {
				securityLevel = "Very safe";
			}else if (hasAlphaBetCharacter && hasDigitCharacter) {
				securityLevel = "Safe";
			}
		}
		return securityLevel;
	}
	
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the password which you want to check security level: ");
		String password = scanner.next();
		scanner.close();
		//Output
		System.out.printf("Password \'%s\' is a %s password.", password, passwordValidator(password));
	}
}

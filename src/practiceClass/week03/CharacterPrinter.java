package practiceClass.week03;

import java.util.Scanner;

//Exercise 1.8
public class CharacterPrinter {
	static boolean isUpperCase(char ch) {
		return (ch >= 'A' && ch <= 'Z');
	}
	
	static boolean isLowerCase(char ch) {
		return (ch >= 'a' && ch <= 'z');
	}
	
	static boolean isVowels(char ch) {
		switch (ch) {
		case 'a':
		case 'A':
		case 'o':
		case 'O':
		case 'i':
		case 'I':
		case 'e':
		case 'E':
		case 'u':
		case 'U':
			return true;
		default:
			return false;
		}
	}
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input an alphabet: ");
		String stringInput = scanner.next();
		scanner.close();
		//Solve + Output
		if (stringInput.length() <= 0 || stringInput.length() > 1) {
			System.out.println("Error. Not a single character.");
			return;
		}
		char charInput = stringInput.charAt(0);
		if (!isLowerCase(charInput) && !isUpperCase(charInput)) {
			System.out.println("Error. Not a letter. Enter uppercase or lowercase letter.");
			return;
		}
		if (isVowels(charInput)) {
			System.out.println("Input letter is Vowel.");
		}else {
			System.out.println("Input letter is Consonant.");
		}
	}
}

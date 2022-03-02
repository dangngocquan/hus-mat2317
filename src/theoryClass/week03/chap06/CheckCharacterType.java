package theoryClass.week03.chap06;

import java.util.Scanner;

//Exercise 6.6.1
public class CheckCharacterType {
	static boolean isDigitCharacter(char charInput) {
		if ('0' <= charInput && charInput <= '9') return true;
		return false;
	}
	
	static boolean isAlphabetCharacter(char charInput) {
		if ('a' <= charInput && charInput <= 'z') return true;
		if ('A' <= charInput && charInput <= 'Z') return true;
		return false;
	}
	
	static boolean isSpecialCharacter(char charInput) {
		return (!isDigitCharacter(charInput) && !isAlphabetCharacter(charInput));
	}
	
	static String getCharacterType(char charInput) {
		if (isDigitCharacter(charInput)) {
			return "Digit character";
		}else if (isAlphabetCharacter(charInput)) {
			return "Alphabet character";
		}else {
			return "Special character";
		}
	}
	
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a character: ");
		String stringInput = scanner.nextLine();
		scanner.close();
		//Output
		if (stringInput.isEmpty()) {
			System.out.println("This is null.");
		}else {
			char charInput = stringInput.charAt(0);
			System.out.println("This is a " + getCharacterType(charInput));
		}
	}
}

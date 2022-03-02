package theoryClass.week03.chap05;

import java.util.Arrays;
import java.util.Scanner;

//Exercise 5.1
public class CheckAnagramString {
	static boolean isAnagrams(String firstString, String secondString) {
		if (firstString.length() != secondString.length()) return false;
		char[] firstArrayCharacter = firstString.toCharArray();
		char[] secondArrayCharacter = secondString.toCharArray();
		Arrays.sort(firstArrayCharacter);
		Arrays.sort(secondArrayCharacter);
		return Arrays.equals(firstArrayCharacter,secondArrayCharacter);
	}
	
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two strings that you want to determine if they are Anagrams of each other.");
		System.out.print("Input the first string: ");
		String firstString = scanner.next();
		System.out.print("Input the second string: ");
		String secondString = scanner.next();
		scanner.close();
		//Output
		if (isAnagrams(firstString, secondString)) {
			System.out.printf("\"%s\" and \"%s\" are Anagrams.",firstString, secondString);
		}else {
			System.out.printf("\"%s\" and \"%s\" aren't Anagrams.", firstString, secondString);
		}
	}
}

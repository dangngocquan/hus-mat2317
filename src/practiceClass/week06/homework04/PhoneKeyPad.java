package practiceClass.week06.homework04;

import java.util.Scanner;

//Exercise 2.3

/**
 * 
 * This program prompts user for a String (case insensitive), and converts to 
 * a sequence of keypad digits 
 * 
 * @author Bris
 * @version 1.0
 * @since 6:28:40 PM -  Mar 20, 2022
 */
public class PhoneKeyPad {
	/**
	 * 
	 * The main method - entry point of this program.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String string = scanner.next().toLowerCase();
		scanner.close();
		
		System.out.print("Convert to a sequence of keypad digits: ");
		for (int index = 0; index < string.length(); index++) {
			switch (string.charAt(index)) {
			case 'a':
			case 'b':
			case 'c':
				System.out.print(2);
				break;
			case 'd':
			case 'e':
			case 'f':
				System.out.print(3);
				break;
			case 'g':
			case 'h':
			case 'i':
				System.out.print(4);
				break;
			case 'j':
			case 'k':
			case 'l':
				System.out.print(5);
				break;
			case 'm':
			case 'n':
			case 'o':
				System.out.print(6);
				break;
			case 'p':
			case 'q':
			case 'r':
			case 's':
				System.out.print(7);
				break;
			case 't':
			case 'u':
			case 'v':
				System.out.print(8);
				break;
			case 'w':
			case 'x':
			case 'y':
			case 'z':
				System.out.print(9);
				break;
			}
		}
	}
}

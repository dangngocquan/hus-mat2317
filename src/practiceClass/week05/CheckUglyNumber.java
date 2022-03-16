package practiceClass.week05;

import java.util.Scanner;

//Exercise 1.13

/**
 * 
 * This class is used to check the input number if it is a Ugly number or not.
 * 
 * @author Bris
 * @version 1.0
 * @since 10:39:52 PM Mar 16, 2022
 */
public class CheckUglyNumber {
	/**
	 * 
	 * This function is used to check the number n if it is a ugly number or not.
	 * 
	 * @param n The number which you want to check.
	 * @return Return true if n is a ugly number. Otherwise, return false if n isn't a ugly number.
	 */
	public static boolean isUglyNumber(int n) {
		if (n <= 0) {
			return false;
		}
		while (n != 1) {
			if (n % 5 == 0) {
				n /= 5;
			}else if (n % 3 == 0) {
				n /= 3;
			}else if (n % 2 == 0) {
				n /= 2;
			}else {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * 
	 * The main function - entry point of this app.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input an integer number: ");
		
		//n - The input number
		int n = scanner.nextInt();
		scanner.close();
		
		//Use isUglyNumber() function and print out the result
		if (isUglyNumber(n)) {
			System.out.println("It is an ugly number.");
		}else {
			System.out.println("It is not an ugly number.");
		}
	}
}

package practiceClass.week06.lab04;

import java.util.Scanner;

//Exercie 2.8

/**
 * 
 * This program prompts user for mark (between 0-100 in int) of 3 students,
 * computes the average (in double) and prints the result rounded to 2 decimal places.
 * 
 * @author Bris
 * @version 1.0
 * @since 12:14:32 PM -  Mar 20, 2022
 */
public class AverageWithInputValidation {
	/**
	 * 
	 * This method is used to check if the number n is in range [0-10] or [90-100] or not.
	 * 
	 * @param n is the number which you want to check.
	 * @return Return true if n is in range [0-10] or [90-100].
	 * Return false if otherwise.
	 */
	public static boolean isValid(int n) {
		return 0 <= n && n <= 100;
	}
	
	/**
	 * 
	 * The main method - entry point of this program.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scaner = new Scanner(System.in);
		int NUMBER_STUDENTS = 3;
		int sum = 0;
		double average;
		int numberIn;
		
		for (int studentNo = 1; studentNo <= NUMBER_STUDENTS; studentNo++) {
			do {
				System.out.printf("Enter the mark (0-100) for student %d: ", studentNo);
				numberIn = scaner.nextInt();
				if (isValid(numberIn)) {
					sum += numberIn;
				}else {
					System.out.println("Invalid input, try again ...");
				}
			} while (!isValid(numberIn));
		}
		scaner.close();
		
		average = sum * 1.0 / NUMBER_STUDENTS;
		System.out.printf("The average is: %.2f" , average);
	}
}

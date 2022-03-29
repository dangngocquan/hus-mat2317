package practiceClass.week06.arrayAndMethod01;

import java.util.Scanner;

//Exercise 1.3

/**
 * 
 * This program prompts user for the number of students in a class (a non-negative integer),
 * and saves it in an int variable called numStudents. It then prompts user for the grade of each of the
 * students (integer between 0 to 100) and saves them in an int array called grades. The program shall
 * then compute and print the average (in double rounded to 2 decimal places) and minimum/maximum
 * (in int).
 * 
 * @author Bris
 * @version 1.0
 * @since 1:48:25 PM -  Mar 28, 2022
 */
public class GradesStatistics {
	/**
	 * 
	 * This method is used to get minimum value in array.
	 * 
	 * @param array is the array which you want to get the minimum value.
	 * @return Return the minimum value in array.
	 */
	public static int getMinimum(int[] array) {
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}
	
	/**
	 * 
	 * This method is used to get maximum value in array.
	 * 
	 * @param array is the array which you want to get the maximum value.
	 * @return Return the maximum value in array.
	 */
	public static int getMaximum(int[] array) {
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}
	
	/**
	 * 
	 * This method is used to get the average value of all elements in the array
	 * 
	 * @param array is the array which you want to get average.
	 * @return Return the average value.
	 */
	public static double getAverage(int[] array) {
		double sum = 0.0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum/array.length;
	}
	
	/**
	 * 
	 * The main method - entry point of this program.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int numStudents = scanner.nextInt();
		int[] grades = new int[numStudents];
		for (int i = 0; i < numStudents; i++) {
			System.out.printf("Enter the grade for student %d: ", i+1);
			grades[i] = scanner.nextInt();
		}
		scanner.close();
		
		System.out.printf("The average is: %.2f\n", getAverage(grades));
		System.out.printf("The minimum is: %d\n", getMinimum(grades));
		System.out.printf("The maximum is: %d\n", getMaximum(grades));
	}
}

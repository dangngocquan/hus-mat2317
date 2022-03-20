package practiceClass.week06.lab04;

// Exercise 2.1.1

/**
 * 
 * This program is used to produce the sum of 1, 2, 3, ... , 100. (using 'while-do' loop)
 * 
 * @author Bris
 * @version 1.0
 * @since 8:05:40 AM -  Mar 20, 2022
 */
public class SumAverageRunningInt1 {
	/**
	 * 
	 * The main method - entry point of this program.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		int sum = 0;
		double average;
		final int LOWERBOUND = 1;
		final int UPPERBOUND = 100;
		int number = LOWERBOUND;
		
		while (number <= UPPERBOUND) {
			sum += number;
			number++;
		}
		
		average = sum*1.0 / (UPPERBOUND - LOWERBOUND + 1);
		
		System.out.println("The sum of " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
		System.out.println("The average is " + average);
	}
}

package practiceClass.week06.lab04;

// Exercise 2.1.0

/**
 * 
 * This program is used to produce the sum of 1, 2, 3, ... , 100. (using 'for' loop)
 * 
 * @author Bris
 * @version 1.0
 * @since 7:51:11 AM -  Mar 20, 2022
 */
public class SumAverageRunningInt0 {
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
		
		for (int number = LOWERBOUND; number <= UPPERBOUND; number++) {
			sum += number;
		}
		
		average = sum*1.0 / (UPPERBOUND - LOWERBOUND + 1);
		
		System.out.println("The sum of " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
		System.out.println("The average is " + average);
	}
}

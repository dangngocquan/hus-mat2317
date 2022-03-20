package practiceClass.week06.lab04;

// Exercise 2.1.5

/**
 * 
 * This program is used to find the sum of the squares of all the numbers from 1 to 100.
 * 
 * @author Bris
 * @version 1.0
 * @since 8:54:52 AM -  Mar 20, 2022
 */
public class SumAverageRunningInt5 {
	/**
	 * 
	 * The main method - entry point of this program.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		int sum = 0;
		final int LOWERBOUND = 1;
		final int UPPERBOUND = 100;
		
		for (int number = LOWERBOUND; number <= UPPERBOUND; number++) {
			sum += number*number;
		}
		
		System.out.println("The sum of the squares of all numbers from " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
	}
}

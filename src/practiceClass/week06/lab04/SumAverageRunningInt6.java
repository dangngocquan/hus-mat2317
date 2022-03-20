package practiceClass.week06.lab04;

// Exercise 2.1.6

/**
 * 
 * This program is used to produce two sums: sum of odd numbers and sum of
 * even numbers from 1 to 100.
 * 
 * @author Bris
 * @version 1.0
 * @since 9:02:32 AM -  Mar 20, 2022
 */
public class SumAverageRunningInt6 {
	/**
	 * 
	 * The main method - entry point of this program.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		int sumOdd = 0;
		int sumEven = 0;
		final int LOWERBOUND = 1;
		final int UPPERBOUND = 100;
		int absDiff;
		
		for (int number = LOWERBOUND; number <= UPPERBOUND; number++) {
			if (number % 2 == 0) {
				sumEven += number;
			}else {
				sumOdd += number;
			}
		}
		
		absDiff = (sumOdd > sumEven)? sumOdd - sumEven : sumEven - sumOdd;
		
		System.out.println("The sum of odd numbers from " + LOWERBOUND + " to " + UPPERBOUND + " is " + sumOdd);
		System.out.println("The sum of even numbers from " + LOWERBOUND + " to " + UPPERBOUND + " is " + sumEven);
		System.out.println("Their absolute diffirence is " + absDiff);
	}
}

package practiceClass.week06.lab04;

// Exercise 2.3.1

/**
 * 
 * This program is used to the value of PI, using the following series expansion.
 * (using MAX_TERM as the terminating condition)
 * 
 * @author Bris
 * @version 1.0
 * @since 10:25:46 AM -  Mar 20, 2022
 */
public class ComputePI1 {
	/**
	 * 
	 * The main method - entry point of this program.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		double sum = 0.0;
		int MAX_TERM = 10000;
		for (int term = 1; term <= MAX_TERM; term++) {
			if (term % 2 == 0) {
				sum -= 1.0 / (2*term - 1);
			}else {
				sum += 1.0 / (2*term - 1);
			}
		}
		
		System.out.println("MAX_TERM = " + MAX_TERM);
		System.out.println("The value of PI is " + 4*sum);
	}
}

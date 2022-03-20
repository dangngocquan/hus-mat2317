package practiceClass.week06.lab04;

// Exercise 2.3.0

/**
 * 
 * This program is used to the value of PI, using the following series expansion.
 * (using MAX_DENOMINATOR as the terminating condition)
 * 
 * @author Bris
 * @version 1.0
 * @since 10:01:13 AM -  Mar 20, 2022
 */
public class ComputePI0 {
	/**
	 * 
	 * The main method - entry point of this program.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		//Try MAX_DENOMINATOR = 1000
		double sum = 0.0;
		int MAX_DENOMINATOR = 1000;
		for (int denominator = 1; denominator <= MAX_DENOMINATOR; denominator += 2) {
			if (denominator % 4 == 1) {
				sum += 1.0/denominator;
			}else if (denominator % 4 == 3) {
				sum -= 1.0/denominator;
			}
		}
		System.out.println("MAX_DENOMINATOR = " + MAX_DENOMINATOR);
		System.out.println("The value of PI is " + 4*sum);
		System.out.println();
		
		//Try MAX_DENOMINATOR = 10000
		sum = 0.0;
		MAX_DENOMINATOR = 10000;
		for (int denominator = 1; denominator <= MAX_DENOMINATOR; denominator += 2) {
			if (denominator % 4 == 1) {
				sum += 1.0/denominator;
			}else if (denominator % 4 == 3) {
				sum -= 1.0/denominator;
			}
		}
		
		System.out.println("MAX_DENOMINATOR = " + MAX_DENOMINATOR);
		System.out.println("The value of PI is " + 4*sum);
		System.out.println();
		
		//Try MAX_DENOMINATOR = 100000
		sum = 0.0;
		MAX_DENOMINATOR = 100000;
		for (int denominator = 1; denominator <= MAX_DENOMINATOR; denominator += 2) {
			if (denominator % 4 == 1) {
				sum += 1.0/denominator;
			}else if (denominator % 4 == 3) {
				sum -= 1.0/denominator;
			}
		}
		
		System.out.println("MAX_DENOMINATOR = " + MAX_DENOMINATOR);
		System.out.println("The value of PI is " + 4*sum);
		System.out.println();
		
		//Try MAX_DENOMINATOR = 1000000
		sum = 0.0;
		MAX_DENOMINATOR = 1000000;
		for (int denominator = 1; denominator <= MAX_DENOMINATOR; denominator += 2) {
			if (denominator % 4 == 1) {
				sum += 1.0/denominator;
			}else if (denominator % 4 == 3) {
				sum -= 1.0/denominator;
			}
		}
		
		System.out.println("MAX_DENOMINATOR = " + MAX_DENOMINATOR);
		System.out.println("The value of PI is " + 4*sum);
		System.out.println();
		
		/*
		 * The larger the number MAX_DENOMINATOR, the higher the precision of the value
		 * of PI, so out of 4 numbers 1000, 10000, 100000, 1000000, we should choose
		 * MAX_DENOMINATOR = 1000000
		 * 
		 */
	}
}

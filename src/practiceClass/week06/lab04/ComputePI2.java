package practiceClass.week06.lab04;

// Exercise 2.3.2

/**
 * 
 *  This program is used to the value of PI, using the following series expansion.
 *  Then, compare the values obtained and the Math.PI, in percents of Math.PI
 * 
 * @author Bris
 * @version 1.0
 * @since 10:34:39 AM -  Mar 20, 2022
 */
public class ComputePI2 {
	/**
	 * 
	 * The main method - entry point of this program.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		double sum = 0.0;
		double MAX_DENOMINATOR = 1000000;
		for (int denominator = 1; denominator <= MAX_DENOMINATOR; denominator += 2) {
			if (denominator % 4 == 1) {
				sum += 1.0/denominator;
			}else if (denominator % 4 == 3) {
				sum -= 1.0/denominator;
			}
		}
		
		System.out.println("The value of PI is " + 4*sum);
		System.out.printf("Compare the values obtained and the Math.PI (int percents of Math.PI): %s %s", (4*sum/Math.PI)*100, "%");
	}
}

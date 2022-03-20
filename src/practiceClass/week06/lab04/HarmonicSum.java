package practiceClass.week06.lab04;

// Exercise 2.2

/**
 * 
 * This program is used to compute the sum of a harmonic series, as shown below, where n = 50000.
 * harmonic(n) = 1 + 1/2 + 1/3 + ... + 1/n
 * 
 * @author Bris
 * @version 1.0
 * @since 9:11:09 AM -  Mar 20, 2022
 */
public class HarmonicSum {
	/**
	 * 
	 * The main method - entry point of this program.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		final int MAX_DENOMINATOR = 50000;
		
		double sumL2R = 0.0;
		for (int denominator = 1; denominator <= MAX_DENOMINATOR; denominator++) {
			sumL2R += 1.0/denominator;
		}
		System.out.println("The sum from left-to-right is " + sumL2R);
		
		double sumR2L = 0.0;
		for (int denominator = MAX_DENOMINATOR; denominator >= 1; denominator--) {
			sumR2L += 1.0/denominator;
		}
		System.out.println("The sum from right-to-left is " + sumR2L);
		
		double absDiff = Math.abs(sumL2R - sumR2L); 
		System.out.println("The absolute difference between the two sums is " + absDiff);
	}
}

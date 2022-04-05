package practiceClass.week08.homework06;

/**
 * Exercise 1.3
 * @author Bris
 * @version 1.0
 * @since 12:18:50 AM -  Apr 5, 2022
 */
public class LengthOfARunningNumberSequence {
	/**
	 * Get length of S(n)
	 * @param n .
	 * @return .
	 */
	public static int getLengthOfSn(int n) {
		if (n == 1) {
			return 1;
		}
		return (n + "").length() + getLengthOfSn(n-1);
	}
	
	/**
	 * The main method.
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		int n = 12;
		System.out.printf("The length of S(%d) is %d", n, getLengthOfSn(n));
	}
}

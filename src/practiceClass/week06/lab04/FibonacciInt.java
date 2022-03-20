package practiceClass.week06.lab04;

//Exercise 2.11.0

/**
 * 
 * This program is used to list all the Fibonacci numbers, which can
 * be expressed as an int.
 * 
 * @author Bris
 * @version 1.0
 * @since 3:04:35 PM -  Mar 20, 2022
 */
public class FibonacciInt {
	/**
	 * 
	 * The main method - entry point of this program.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		int n = 3;
		int fnMinus1 = 1;
		int fnMinus2 = 1;
		int fn = fnMinus1 + fnMinus2;
		System.out.printf("F(%d) = %d\n", 1, fnMinus2);
		System.out.printf("F(%d) = %d\n", 2, fnMinus1);
		
		while (fn <= Integer.MAX_VALUE && fn  > fnMinus1) {
			System.out.printf("F(%d) = %d\n", n, fn);
			n++;
			fnMinus2 = fnMinus1;
			fnMinus1 = fn;
			fn = fnMinus1 + fnMinus2;
		}
		System.out.printf("F(%d) is out of the range of int.", n);
	}
}

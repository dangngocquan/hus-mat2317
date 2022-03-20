package practiceClass.week06.lab04;

//Exercise 2.11.1

/**
 * 
 * This program is used to list all the Tribonacci numbers, which can
 * be expressed as an int.
 * 
 * @author Bris
 * @version 1.0
 * @since 3:14:44 PM -  Mar 20, 2022
 */
public class TribonacciInt {
	/**
	 * 
	 * The main method - entry point of this program.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		int n = 4;
		int fnMinus1 = 2;
		int fnMinus2 = 1;
		int fnMinus3 = 1;
		int fn = fnMinus1 + fnMinus2 + fnMinus3;
		System.out.printf("F(%d) = %d\n", 1, fnMinus3);
		System.out.printf("F(%d) = %d\n", 2, fnMinus2);
		System.out.printf("F(%d) = %d\n", 1, fnMinus1);
		
		while (fn <= Integer.MAX_VALUE && fn  > fnMinus1) {
			System.out.printf("F(%d) = %d\n", n, fn);
			n++;
			fnMinus3 = fnMinus2;
			fnMinus2 = fnMinus1;
			fnMinus1 = fn;
			fn = fnMinus1 + fnMinus2 + fnMinus3;
		}
		System.out.printf("F(%d) is out of the range of int.", n);
	}
}

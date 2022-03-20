package practiceClass.week06.lab04;

//Exercise 2.10.0

/**
 * 
 * This program is used to list all the factorials that can be
 * expressed as an int.
 * 
 * @author Bris
 * @version 1.0
 * @since 2:00:41 PM -  Mar 20, 2022
 */
public class FactorialInt {
	/**
	 * 
	 * The main method - entry point of this program. 
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		int n = 1;
		int fn = 1;
		while (fn <= Integer.MAX_VALUE && fn*(n+1) > fn) {
			System.out.printf("The factorial of %d is %d\n", n, fn);
			n++;
			fn *= n;
		}
		System.out.printf("The factorial of %d is out of range", n);
	}
}

package practiceClass.week06.lab04;

//Exercise 2.4.1 (exercise 2.4 , try 1)

/**
 * 
 * This program is used to produce the first 20 Tribonacci numbers.
 * 
 * @author Bris
 * @version 1.0
 * @since 11:41:22 AM -  Mar 20, 2022
 */
public class Tribonacci {
	/**
	 * 
	 * The main method - entry point of this program.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		int n = 4;
		int fn;
		int fnMinus1 = 2;
		int fnMinus2 = 1;
		int fnMinus3 = 1;
		int nMax = 20;
		int sum = fnMinus1 + fnMinus2 + fnMinus3;
		double average;
		
		//Print out the first 20 Fibonacci numbers
		System.out.println("The first " + nMax + " Fibonacci numbers are:");
		System.out.print(fnMinus3 + " " + fnMinus2 + " " + fnMinus1 + " " );
		while (n <= nMax) {
			fn = fnMinus1 + fnMinus2 + fnMinus3;
			fnMinus3 = fnMinus2;
			fnMinus2 = fnMinus1;
			fnMinus1 = fn;
			System.out.print(fn + " ");
			sum += fn;
			n++;
		}
		System.out.println();
		
		//Compute and print out the average of them
		average = sum*1.0 / nMax;
		System.out.println("The average is " + average);
	}
}

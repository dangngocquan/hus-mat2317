package practiceClass.week06.arrayAndMethod01;

import java.util.Scanner;

//Exercise 2.1

/**
 * 
 * This program is used to write a method called exponent(int base, int exp) that returns an int value of base raises to the power
 * of exp.
 * 
 * @author Bris
 * @version 1.0
 * @since 2:37:19 PM -  Mar 28, 2022
 */
public class Exponent {
	/**
	 * 
	 * This method is used to calculate the value of base raises to the power of exp.
	 * 
	 * @param base .
	 * @param exp .
	 * @return Returns an int value of base raises to the power
	 * of exp.
	 */
	public static int exponent(int base, int exp) {
		return (int)Math.pow(base, exp);
	}
	
	/**
	 * 
	 * The main method - entry point of this program.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the base: ");
		int base = scanner.nextInt();
		System.out.print("Enter the exponent: ");
		int exp = scanner.nextInt();
		scanner.close();
		
		System.out.printf("%d raises to the power of %d is: %d", base, exp, exponent(base, exp));
	}
}

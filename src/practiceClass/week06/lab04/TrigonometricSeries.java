package practiceClass.week06.lab04;

import java.util.Scanner;

//Exercise 2.9

/**
 * 
 * This program is used to compute sin(x) and cos(x).
 * 
 * @author Bris
 * @version 1.0
 * @since 2:21:29 PM -  Mar 20, 2022
 */
public class TrigonometricSeries {
	/**
	 * 
	 * This method is used to compute sin(x).
	 * 
	 * @param x is a value in radiant unit.
	 * @param numTerms is the number of term in series expansion.
	 * @return Return sin(x).
	 */
	public static double sin(double x, int numTerms) {
		double sum = 0.0;
		
		while (Math.abs(x) >= 2*Math.PI) {
			x -= (x >= 0)? 2*Math.PI : -2*Math.PI;
		}
		
		double tempValue = x;
		for (int term = 1; term <= numTerms; term++) {
			sum += tempValue;
			tempValue = (-1) * tempValue * x * x / ((term * 2) * (term * 2 + 1));
		}
		return sum;
	}
	
	/**
	 * 
	 * This method is used to compute cos(x)
	 * 
	 * @param x is a value in radiant unit.
	 * @param numTerms is the number of term in series expansion.
	 * @return Return cos(x).
	 */
	public static double cos(double x, int numTerms) {
		double sum = 0.0;
		
		while (Math.abs(x) >= 2*Math.PI) {
			x -= (x >= 0)? 2*Math.PI : -2*Math.PI;
		}
		
		double tempValue = 1.0;
		for (int term = 1; term <= numTerms; term++) {
			sum += tempValue;
			tempValue = (-1) * tempValue * x * x / ((term * 2 - 1) * (term * 2));
		}
		return sum;
	}
	
	/**
	 * 
	 * The main method - entry point of this program.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Sin(x) and Cos(x)
		System.out.println("Calculate sin(x) and cos(x).");
		System.out.print("Enter the value of x (radiant): ");
		double x = scanner.nextDouble();
		scanner.close();
		
		System.out.println("sin(x) = " + sin(x, 67));
		System.out.println("cos(x) = " + cos(x, 67));
		
		//Compare the values computed using the series with the JDK method Math.sin(), Math.cos()
		System.out.println("=========================================");
		System.out.println("Compare the values computed using the series with the JDK method Math.sin(), Math.cos()\n");
		//At x = 0
		System.out.println("At x = 0:");
		System.out.printf("sin(x) = %-25s Math.sin(x) = %-15s\n", sin(0, 67), Math.sin(0));
		System.out.printf("cos(x) = %-25s Math.cos(x) = %-15s\n\n", cos(0, 67), Math.cos(0));
		
		//At x = PI/6
		System.out.println("At x = PI/6:");
		System.out.printf("sin(x) = %-25s Math.sin(x) = %-15s\n", sin(Math.PI/6, 67), Math.sin(Math.PI/6));
		System.out.printf("cos(x) = %-25s Math.cos(x) = %-15s\n\n", cos(Math.PI/6, 67), Math.cos(Math.PI/6));
		
		//At x = PI/4
		System.out.println("At x = PI/4:");
		System.out.printf("sin(x) = %-25s Math.sin(x) = %-15s\n", sin(Math.PI/4, 67), Math.sin(Math.PI/4));
		System.out.printf("cos(x) = %-25s Math.cos(x) = %-15s\n\n", cos(Math.PI/4, 67), Math.cos(Math.PI/4));
		
		//At x = PI/3
		System.out.println("At x = PI/3:");
		System.out.printf("sin(x) = %-25s Math.sin(x) = %-15s\n", sin(Math.PI/3, 67), Math.sin(Math.PI/3));
		System.out.printf("cos(x) = %-25s Math.cos(x) = %-15s\n\n", cos(Math.PI/3, 67), Math.cos(Math.PI/3));
		
		//At x = PI/2
		System.out.println("At x = PI/2:");
		System.out.printf("sin(x) = %-25s Math.sin(x) = %-15s\n", sin(Math.PI/2, 67), Math.sin(Math.PI/2));
		System.out.printf("cos(x) = %-25s Math.cos(x) = %-15s\n\n", cos(Math.PI/2, 67), Math.cos(Math.PI/2));
	}
}

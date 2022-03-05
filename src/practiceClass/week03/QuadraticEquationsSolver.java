package practiceClass.week03;

import java.util.Scanner;

//Exercise 1.5
public class QuadraticEquationsSolver {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a: ");
		double a = scanner.nextDouble();
		System.out.print("Input b: ");
		double b = scanner.nextDouble();
		System.out.print("Input c: ");
		double c = scanner.nextDouble();
		scanner.close();
		//Solve + output
		if (a == 0) {
			if (b == 0) {
				if (c == 0) {
					System.out.println("The equation has many real roots.");
				}else {
					System.out.println("The equation has no real roots.");
				}
			}else {
				double root1 = -c/b;
				System.out.println("The root is " + root1);
			}
		}else {
			double delta = b*b - 4*a*c;
			if (delta > 0.0) {
				double root1 = (-b - Math.sqrt(delta))/(2*a);
				double root2 = (-b + Math.sqrt(delta))/(2*a);
				System.out.println("The roots are " + root1 + " and " + root2);
			}else if (delta == 0.0) {
				double root1 = -b/(2*a);
				System.out.println("The root is " + root1);
			}else {
				System.out.println("The equation has no real roots.");
			}
		}
	}
}

package theoryClass.week02.part02;

import java.util.Scanner;

// Exercise 4.1
public class AreaOfRectangularRoom {
	static double getAreaInSquareFeets(double length, double width) {
		return length*width;
	}
	
	static double getAreaInSquareMeters(double length, double width, double conversionFactor ) {
		return length*width*conversionFactor;
	}
	
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the length of the room in feet unit? ");
		double length = scanner.nextDouble();
		System.out.print("Input the width of the room in feet unit? ");
		double width = scanner.nextDouble();
		scanner.close();
		//Output
		double conversionFactor = 0.09290304;
		System.out.println("The area of the room is :");
		System.out.printf("%s square meters\n",getAreaInSquareFeets(length, width));
		System.out.printf("%s square feets\n",getAreaInSquareMeters(length, width, conversionFactor));
	}
}

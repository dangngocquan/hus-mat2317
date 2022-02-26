package practice_week_02;

import java.util.Scanner;

public class exe_01_15_DistanceTwoPointsOnSurfaceOfEarth {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the latitude of coordinate 1: ");
		double x1 = scanner.nextDouble();
		x1 = Math.toRadians(x1);
		System.out.print("Input the longitude of coordinate 1: ");
		double y1 = scanner.nextDouble();
		y1 = Math.toRadians(y1);
		System.out.print("Input the latitude of coordinate 2: ");
		double x2 = scanner.nextDouble();
		x2 = Math.toRadians(x2);
		System.out.print("Input the longitude of coordinate 2: ");
		double y2 = scanner.nextDouble();
		y2 = Math.toRadians(y2);
		scanner.close();
		//Solve
		double r = 6371.01;
		double distance = r*Math.acos(Math.sin(x1)*Math.sin(x2) + Math.cos(x1)*Math.cos(x2)*Math.cos(y1-y2));
		//Output
		System.out.println("The distance between those points is: " + distance + " km");
	}
}

package practiceClass.week02;

import java.util.Scanner;

//Exercise 1.15
public class DistanceTwoPointsOnSurfaceOfEarth {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the latitude of coordinate 1: ");
		double lat1 = scanner.nextDouble();
		lat1 = Math.toRadians(lat1);
		System.out.print("Input the longitude of coordinate 1: ");
		double long1 = scanner.nextDouble();
		long1 = Math.toRadians(long1);
		System.out.print("Input the latitude of coordinate 2: ");
		double lat2 = scanner.nextDouble();
		lat2 = Math.toRadians(lat2);
		System.out.print("Input the longitude of coordinate 2: ");
		double long2 = scanner.nextDouble();
		long2 = Math.toRadians(long2);
		scanner.close();
		//Solve
		double radius = 6371.01;
		double distance = radius*Math.acos(Math.sin(lat1)*Math.sin(lat2) + Math.cos(lat1)*Math.cos(lat2)*Math.cos(long1-long2));
		//Output
		System.out.println("The distance between those points is: " + distance + " km");
	}
}

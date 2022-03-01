package theoryClass.week02.part02;

import java.util.Scanner;

//Exercise 4.2
public class PaintBucketsCalculator {
	static double getArea(double length, double width) {
		return length*width;
	}
	
	static long getNumberOfPaintBucket(double area, double capacityOfPaintBucket) {
		return (long)Math.ceil(area/capacityOfPaintBucket);
	}
	
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the length of the room (in feet unit): ");
		double length = scanner.nextDouble();
		System.out.print("Input the width of the room (in feet unit): ");
		double width = scanner.nextDouble();
		scanner.close();
		//Output
		double area = getArea(length, width);
		System.out.printf("You need %d paint buckets to paint %s square feets.",getNumberOfPaintBucket(area, 350),area);
	}
}

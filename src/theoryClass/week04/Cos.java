package theoryClass.week04;

import java.util.Scanner;

//Exercise 1, cos(x)
public class Cos {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Cos(x) calculator.");
		System.out.print("Input the value of x: ");
		double x = scanner.nextDouble();
		scanner.close();
		
		double y = x;
		double cos = 0.0;
		while (Math.abs(y) >= 2*Math.PI) {
			y -= (y>0)? 2*Math.PI : -2*Math.PI;
		}
		double temp = 1;
		
		for (int i = 0; i <= 68; i += 2) {
			cos += temp;
			temp = (-1)*temp*y*y / ((i+1)*(i+2));
		}
		
		System.out.printf("Cos(%s) = %s", x, cos);
		
	}
}

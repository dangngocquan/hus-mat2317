package theoryClass.week04;

import java.util.Scanner;

//Exercise 1, sin(x)
public class Sin {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sin(x) calculator.");
		System.out.print("Input the value of x: ");
		double x = scanner.nextDouble();
		scanner.close();
		
		double y = x;
		double sin = 0.0;
		while (Math.abs(y) >= 2*Math.PI) {
			y -= (y>0)? 2*Math.PI : -2*Math.PI;
		}
		double temp = y;
		
		for (int i = 1; i <= 69; i += 2) {
			sin += temp;
			temp = (-1)*temp*y*y / ((i+1)*(i+2));
		}
		
		System.out.printf("Sin(%s) = %s", x, sin);
	}
}

package theoryClass.week04;

import java.util.Scanner;

//Exercise 1, sin(x)
/**
 * The <b>Sin</b> is the class that help to calculator the value of sin(x), x is the input value.
 * 
 * @author <b>BrisS</b>
 * @version 1.0
 * @since 16/03/2022
 *
 */
public class Sin {
	/**
	 * The main function, entry point of this app.
	 * @param args Unused in this method.
	 * 
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sin(x) calculator.");
		System.out.print("Input the value of x: ");
		
		//x - The input value, to calculator sin(x)
		double x = scanner.nextDouble();
		scanner.close();
		
		//y - The value that sin(y) = sin(x) and y is a value in range [-2PI, 2PI]
		double y = x;
		
		//sin - The value of sin(x)
		double sin = 0.0;
		while (Math.abs(y) >= 2*Math.PI) {
			y -= (y>0)? 2*Math.PI : -2*Math.PI;
		}
		
		//temp - The temporary value, store the value y, -y^3/(3!), y^5/(5!), ...
		double temp = y;
		
		//Calculator the value of sin(y)
		for (int i = 1; i <= 69; i += 2) {
			sin += temp;
			temp = (-1)*temp*y*y / ((i+1)*(i+2));
		}
		
		//Print out the value of sin(x)
		System.out.printf("Sin(%s) = %s", x, sin);
	}
}

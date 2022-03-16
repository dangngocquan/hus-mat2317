package theoryClass.week04;

import java.util.Scanner;

//Exercise 1, cos(x)

/**
 * 
 * The <b>Cos</b> class is the class that help to calculate the value of cos(x), x is the input value.
 * 
 * @author <b>BrisS</b>
 * @version 1.0
 * @since 16/03/2022
 *
 */
public class Cos {
	/**
	 * 
	 * The main function, entry point of this app.
	 * 
	 * @param args Unused in this app.
	 * 
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Cos(x) calculator.");
		System.out.print("Input the value of x: ");
		
		//x - Input value
		double x = scanner.nextDouble();
		scanner.close();
		
		// y - The value that cos(y) = cos(x) and y in range [-2PI, 2PI]
 		double y = x;
 		
 		//cos - The value of cos(x)
		double cos = 0.0;
		
		//Calculate y
		while (Math.abs(y) >= 2*Math.PI) {
			y -= (y>0)? 2*Math.PI : -2*Math.PI;
		}
		
		//temp - The temporary value, store the value 1, -x^2/(2!), x^4/(4!), ...
		double temp = 1;
		
		//Calculate cos(y)
		for (int i = 0; i <= 68; i += 2) {
			cos += temp;
			temp = (-1)*temp*y*y / ((i+1)*(i+2));
		}
		
		//Print out the value of cos(x)
		System.out.printf("Cos(%s) = %s", x, cos);
		
	}
}

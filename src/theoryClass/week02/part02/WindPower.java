package theoryClass.week02.part02;

import java.util.Scanner;

//Exercise 4.6
public class WindPower {
	static double getWindPower(double temperature, double windSpeed) {
		double windPower = 35.74 + 0.6215*temperature + (0.4275*temperature - 35.75)*Math.pow(windSpeed, 0.16);
		return windPower;
	}
	
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the temperature in degree Fahrenheit: ");
		double temperature = scanner.nextDouble();
		System.out.print("Input the speed of the wind (mile/hour): ");
		double windSpeed = scanner.nextDouble();
		scanner.close();
		//Output
		System.out.printf("The value of wind power: %s",getWindPower(temperature, windSpeed));
	}
}

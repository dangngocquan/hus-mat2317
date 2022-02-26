package practice_week_02;

import java.util.Scanner;

public class exe_01_08_SortNumbers {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the number x: ");
		int x = scanner.nextInt();
		System.out.print("Input the number y: ");
		int y = scanner.nextInt();
		System.out.print("Input the number z: ");
		int z = scanner.nextInt();
		scanner.close();
		//Solve
		int minNumber = Math.min(Math.min(x, y), z);
		int maxNumber = Math.max(Math.max(x, y), z);
		int midNumber = (x + y + z) - (minNumber + maxNumber);
		//Output
		System.out.printf("Number in increasing order: %d %d %d", minNumber, midNumber, maxNumber);
	}
}

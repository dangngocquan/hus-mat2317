package theoryClass.week02.part01;

import java.util.Scanner;

public class exe_03_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("What's your name?	");
		String name = scanner.next();
		System.out.println("Hello "+ name + ", nice to meet you!");
		scanner.close();
	}
}

package theoryClass.week03.chap06;

import java.util.Scanner;

//Exercise 6.2
public class LegalDrivingAge {
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input your age: ");
		int age = scanner.nextInt();
		scanner.close();
		//Output
		if (age < 18) {
			System.out.println("You aren't old enough to drive.");
		}else {
			System.out.println("You are old enough to drive. (But you don't have a driver's license, good luck, hehe =)) )");
		}
	}
}

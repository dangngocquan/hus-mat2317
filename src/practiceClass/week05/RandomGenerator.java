package practiceClass.week05;

import java.util.Scanner;

//Exercise 1.2
public class RandomGenerator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the starting number of the range: ");
		int startingNumber = scanner.nextInt();
		System.out.print("Input the ending number of the range: ");
		int endingNumber = scanner.nextInt();
		scanner.close();
		
		
		int randomNumber = (int)Math.floor(Math.random()*(endingNumber-startingNumber) + startingNumber);
		System.out.print("Generated number: " + randomNumber);
	}
}

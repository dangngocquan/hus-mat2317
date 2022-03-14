package practiceClass.week05;

import java.util.Scanner;

//Exercise 1.12 , Đề bài có vấn đề
public class NumberCombinationFinder {
	static void findCombinations(int n) {
		int counter = 0;
		System.out.print("Combinations of a, b, c: ");
		for (int a = 1; a < n; a++) {
			for (int b = 1; b < n-a; b++) {
				System.out.printf("(%d, %d, %d) ", a, b, n-a-b);
				counter++;
			}
		}
		System.out.printf("\nNumber of combinations of a, b and c: %d", counter);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the number(n): ");
		int n = scanner.nextInt();
		scanner.close();
		
		findCombinations(n);
	}
}

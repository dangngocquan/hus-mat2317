package theoryClass.week02.part02;

import java.util.Scanner;

//Exercise 4.3
public class CheckBill {
	static double getTotalBill(double firstPrice, long firstNumber, double secondPrice, long secondNumber, double thirdPrice, long thirdNumber) {
		return firstPrice*firstNumber + secondPrice*secondNumber + thirdNumber*thirdPrice;
	}
	
	static double getTax(double totalBill, double taxRate) {
		return taxRate*totalBill/100;
	}
	
	public static void main(String[] args) {
		//Input
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the price of the first product: $");
		double firstPrice = scanner.nextDouble();
		System.out.print("Input the number of first product: ");
		long firstNumber = scanner.nextLong();
		System.out.print("Input the price of the second product: $");
		double secondPrice = scanner.nextDouble();
		System.out.print("Input the number of second product: ");
		long secondNumber = scanner.nextLong();
		System.out.print("Input the price of the third product: $");
		double thirdPrice = scanner.nextDouble();
		System.out.print("Input the number of third product: ");
		long thirdNumber = scanner.nextLong();
		scanner.close();
		//Output
		double totalBill = getTotalBill(firstPrice, firstNumber, secondPrice, secondNumber, thirdPrice, thirdNumber);
		System.out.printf("The total bill before tax: $%s\n",totalBill);
		double tax = getTax(totalBill, 5.5);
		System.out.printf("Tax: $%s\n",tax);
		System.out.printf("The total bill after tax: $%s\n",totalBill+tax);
	}
}

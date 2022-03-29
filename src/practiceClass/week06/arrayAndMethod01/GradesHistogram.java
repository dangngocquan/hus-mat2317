package practiceClass.week06.arrayAndMethod01;

import java.util.Scanner;

//Exercise 2.12

/**
 * 
 * This program reads in n grades (as in the previous exercise), and
 * displays the horizontal and vertical histograms.
 * 
 * @author Bris
 * @version 1.0
 * @since 10:43:18 PM -  Mar 29, 2022
 */
public class GradesHistogram {
	/**
	 * 
	 * This method is used to print the first grades histogram with an array data.
	 * 
	 * @param counter is an array data.
	 */
	public static void printFirstGradesHistogram(int[] counter) {
		for (int i = 0; i < 9; i++) {
			System.out.printf("%3d - %3d: ", i*10, i*10 + 9);
			for (int j = 1; j <= counter[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.printf("%3d - %3d: ", 90, 100);
		for (int j = 1; j <= counter[9]; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	/**
	 * 
	 * This method is used to print the second grades histogram with an array data.
	 * 
	 * @param counter is an array data.
	 */
	public static void printSecondGradesHistogram(int[] counter) {
		//get max
		int maxValue = counter[0];
		for (int element: counter) {
			if (element > maxValue) {
				maxValue = element;
			}
		}
		
		//print
		for (int value = maxValue; value >= 1; value--) {
			for (int i = 0; i < 10; i++) {
				if (counter[i] >= value) {
					System.out.print("   *   ");
				}else {
					System.out.print("       ");
				}
			}
			System.out.println();
		}
		
		for (int i = 0; i < 9; i++) {
			System.out.printf("%3d-%-3d", i*10, i*10+9);
		}
		System.out.println(" 90-100");
	}
	
	/**
	 * 
	 * The main method - entry point of this program.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		//get grades
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int numberStudents = scanner.nextInt();
		
		int[] grades = new int[numberStudents];
		for (int i = 0; i < numberStudents; i++) {
			System.out.printf("Enter the grade for student %d: ", i+1);
			grades[i] = scanner.nextInt();
		}
		scanner.close();
		
		//counter is an array which store the number of students has grade 0-9, 10- 19, ..., 90-100
		int[] counter = new int[10];
		for (int element: grades) {
			if (element == 100) {
				counter[9]++;
				continue;
			}
			counter[element/10]++;
		}
		
		//print the first grades histogram
		System.out.println();
		printFirstGradesHistogram(counter);
		System.out.println();
		
		//print the second grades histogram
		printSecondGradesHistogram(counter);
	}
}

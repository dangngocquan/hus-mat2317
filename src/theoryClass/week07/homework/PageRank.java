package theoryClass.week07.homework;

import java.util.Scanner;

/**
 * 
 * This program is used to get rank of n web after m moves.
 * 
 * @author Bris
 * @version 1.0
 * @since 12:30:49 AM -  Mar 30, 2022
 */
public class PageRank {
	/**
	 * Static variable
	 */
	public static int n;
	
	/**
	 * Static variable
	 */
	public static int[][] linkCounts;
	
	/**
	 * Static variable
	 */
	public static int[] outDegrees;
	
	/**
	 * Static variable
	 */
	public static int m;
	
	/**
	 * Static variable
	 */
	public static double[][] leapProbabilities;
	
	/**
	 * Static variable
	 */
	public static double[][] linkProbabilities;
	
	/**
	 * Static variable
	 */
	public static double[][] transitionMatrix;
	
	/**
	 * Static variable
	 */
	public static double[] ranks;
	
	/**
	 * This method is used to get value of number n - the number of webs.
	 * @param scanner .
	 */
	public static void createN(Scanner scanner) {
		System.out.print("# Enter a positive number n - the number of webs: ");
		n = scanner.nextInt();
	}
	
	/**
	 * This method is used to create linkCounts.
	 * linkCounts[i][j] is the number of links from web i to web j.
	 * @param scanner .
	 */
	public static void createLinkCounts(Scanner scanner) {
		System.out.printf("# Enter pairs of numbers a, b in range [0, %d].\n", n-1);
		System.out.println("   a is the serial number of the website containing the link.");
		System.out.println("   b is the serial number of the linked website.");
		System.out.println("# Enter \"-1 -1\" when you want to finish your input.");
		System.out.println("# Example:");
		System.out.println("0 1");
		System.out.println("1 2");
		System.out.println("1 2");
		System.out.println("1 3");
		System.out.println("1 3");
		System.out.println("1 4");
		System.out.println("2 3");
		System.out.println("3 0");
		System.out.println("4 0");
		System.out.println("4 2");
		System.out.println("-1 -1");
		
		linkCounts = new int[n][n];
		int a, b;
		do {
			a = scanner.nextInt();
			b = scanner.nextInt();
			if (a != -1 && b != -1) {
				linkCounts[a][b]++;
			}
		} while(a != -1 && b != -1);
	}
	
	/**
	 * This method is used to create OutDegrees.
	 * outDegrees[i] is the number of webs which you can visit from web i.
	 * @param scanner .
	 */
	public static void createOutDegrees(Scanner scanner) {
		outDegrees = new int[n];
		for (int row = 0; row < n; row++) {
			for (int column = 0; column < n; column++) {
				outDegrees[row] += linkCounts[row][column];
			}
		}
	}
	
	/**
	 * This method is usedto get value of number m - the number of moves.
	 * @param scanner .
	 */
	public static void createM(Scanner scanner) {
		System.out.print("# Enter a positive number m - the number of moves: ");
		m = scanner.nextInt();
	}
	
	/**
	 * This method is used to create leapProbabilities.
	 * leapProbabilities[i][j] = 0.1*1.0/n
	 */
	public static void createLeapProbabilities() {
		leapProbabilities = new double[n][n];
		for (int row = 0; row < n; row++) {
			for (int column = 0; column < n; column++) {
				leapProbabilities[row][column] = 0.1*1.0/n;
			}
		}
	}
	
	/**
	 * This method is used to create linkProbabilities.
	 * linkProbabilities[i][j] = 0.9 * linkCount[i][j] / outDegrees[i]
	 */
	public static void createLinkProbabilities() {
		linkProbabilities = new double[n][n];
		for (int row = 0; row < n; row++) {
			for (int column = 0; column < n; column++) {
				linkProbabilities[row][column] = 0.9*1.0*linkCounts[row][column] / outDegrees[row];
			}
		}
	}
	
	/**
	 * This method is used to create transitionMaxtrix.
	 * transitionMatrix = leapProbabilities + linkProbabilities
	 */
	public static void createTransitionMatrix() {
		transitionMatrix = new double[n][n];
		for (int row = 0; row < n; row++) {
			for (int column = 0; column < n; column++) {
				transitionMatrix[row][column] = leapProbabilities[row][column] + linkProbabilities[row][column];
			}
		}
	}
	
	/**
	 * This method is used to create ranks.
	 * ranks[i] is the probabilities of web i.
	 */
	public static void createRanks() {
		ranks = new double[n];
		ranks[0] = 1.0;
		for (int i = 1; i < n; i++) {
			ranks[i] = 0.0;
		}
	}
	
	/**
	 * This method is used to get ranks after one move.
	 */
	public static void getOneMove() {
		double[] newRanks = new double[n];
		for (int web = 0; web < n; web++) {
			newRanks[web] = 0.0;
			for (int i = 0; i < n; i++) {
				newRanks[web] += ranks[i] * transitionMatrix[i][web];
			}
		}
		
		for (int web = 0; web < n; web++) {
			ranks[web] = newRanks[web];
		}
	}
	
	/**
	 * This method is used to get ranks after m moves.
	 */
	public static void getMMoves() {
		for (int turn = 1; turn <= m; turn++) {
			getOneMove();
		}
	}
	
	/**
	 * This method is used to print ranks.
	 */
	public static void printRanks() {
		System.out.printf("Probabilities of surfing from 0 to i (i in range [0, %d]) in %d moves (steady state): ", n-1, m);
		System.out.printf("\n%-16s", "Website:");
		for (int web = 0; web < n; web++) {
			System.out.printf("%7d", web);
		}
		System.out.printf("\n%-16s", "Probabilities:");
		for (int web = 0; web < n; web++) {
			System.out.printf("%7.2f", ranks[web]);
		}
	}
	
	/**
	 * 
	 * The main method - entry point of this program.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Create n - the number of webs
		createN(scanner);
		
		//Create linkCounts
		createLinkCounts(scanner);
		
		//Create outDegrees
		createOutDegrees(scanner);
		
		//create m - the number of moves.
		createM(scanner);
		
		scanner.close();
		
		//Create leapProbabilities
		createLeapProbabilities();
		
		//Create linkProbabilities
		createLinkProbabilities();
		
		//Create transition matrix
		createTransitionMatrix();
		
		//Create ranks
		createRanks();
		
		//Get ranks after m moves
		getMMoves();
		
		//Print ranks after m moves
		printRanks();
	}
}

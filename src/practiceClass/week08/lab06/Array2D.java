package practiceClass.week08.lab06;

import java.util.Random;

//Exercise 1.2

/**
 * ...
 * @author Bris
 * @version 1.0
 * @since 1:38:22 PM -  Apr 4, 2022
 */
public class Array2D {
	/**
	 * Create random input for matrix.
	 * @param matrix .
	 */
	public static void getRandomInput(int[][] matrix) {
		Random randomGenerator = new Random();
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				matrix[row][column] = randomGenerator.nextInt() % 100;
			}
		}
	}
	
	/**
	 * Read and print matrix.
	 * @param matrix .
	 */
	public static void printMatrix(int[][] matrix) {
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				System.out.printf("%7d", matrix[row][column]);
			}
			System.out.println();
		}
	}
	
	/**
	 * Add two matrix
	 * @param matrix1 .
	 * @param matrix2 .
	 * @return .
	 */
	public static int[][] addMatrix(int[][] matrix1, int[][] matrix2) {
		int[][] sumMatrix = new int[matrix1.length][matrix1[0].length];
		for (int row = 0; row < sumMatrix.length; row++) {
			for (int column = 0; column < sumMatrix[row].length; column++) {
				sumMatrix[row][column] = matrix1[row][column] + matrix2[row][column];
			}
		}
		return sumMatrix;
	}
	
	/**
	 * Subtract two matrix
	 * @param matrix1 .
	 * @param matrix2 .
	 * @return .
	 */
	public static int[][] subtractMatrix(int[][] matrix1, int[][] matrix2) {
		int[][] subtractMatrix = new int[matrix1.length][matrix1[0].length];
		for (int row = 0; row < subtractMatrix.length; row++) {
			for (int column = 0; column < subtractMatrix[row].length; column++) {
				subtractMatrix[row][column] = matrix1[row][column] - matrix2[row][column];
			}
		}
		return subtractMatrix;
	}
	
	/**
	 * Scalar matrix multiplication.
	 * @param matrix .
	 * @param a .
	 * @return .
	 */
	public static int[][] scalarMultiplicationMatrix(int[][] matrix, int a) {
		int[][] resultMatrix = new int[matrix.length][matrix[0].length];
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				resultMatrix[row][column] = a*matrix[row][column];
			}
		}
		return resultMatrix;
	}
	
	/**
	 * Multiply two matrix.
	 * @param matrix1 .
	 * @param matrix2 .
	 * @return .
	 */
	public static int[][] multiplyMatrix(int[][] matrix1, int[][] matrix2) {
		int[][] resultMatrix = new int[matrix1.length][matrix1[0].length];
		for (int row = 0; row < resultMatrix.length; row++) {
			for (int column = 0; column < resultMatrix[row].length; column++) {
				for (int i = 0; i < matrix1[row].length; i++) {
					resultMatrix[row][column] += matrix1[row][i] * matrix2[i][column];
				}
			}
		}
		return resultMatrix;
	}
	
	/**
	 * Check whether two matrices are equal or not.
	 * @param matrix1 .
	 * @param matrix2 .
	 * @return .
	 */
	public static boolean equalsMatrix(int[][] matrix1, int[][] matrix2) {
		if (matrix1.length != matrix2.length) {
			return false;
		}
		for (int row = 0; row < matrix1.length; row++) {
			if (matrix1[row].length != matrix2[row].length) {
				return false;
			}
			for (int column = 0; column < matrix1[row].length; column++) {
				if (matrix1[row][column] != matrix2[row][column]) {
					return false;
				}
			}
		}
		return true;
	}
	
	/**
	 * Sum of main diagonal elements of a matrix.
	 * @param matrix .
	 * @return .
	 */
	public static long sumMainDiagonalMatrix(int[][] matrix) {
		if (matrix.length != matrix[0].length) {
			return 0;
		}
		long sum = 0;
		for (int i = 0; i < matrix.length; i++) {
			sum += matrix[i][i];
		}
		return sum;
	}
	
	/**
	 * Sum of minor diagonal elements of a matrix.
	 * @param matrix .
	 * @return .
	 */
	public static long sumMinorDiagonalMatrix(int[][] matrix) {
		if (matrix.length != matrix[0].length) {
			return 0;
		}
		long sum = 0;
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				sum += matrix[row][column];
			}
		}
		sum -= sumMainDiagonalMatrix(matrix);
		return sum;
	}
	
	/**
	 * Print sum of each row.
	 * @param matrix .
	 */
	public static void printSumOfEachRow(int[][] matrix) {
		for (int row = 0; row < matrix.length; row++) {
			long sum = 0;
			for (int column = 0; column < matrix[row].length; column++) {
				sum += matrix[row][column];
			}
			System.out.printf("Sum of row %d is: %d\n", row+1, sum);
		}
	}
	
	/**
	 * Print sum of each column.
	 * @param matrix .
	 */
	public static void printSumOfEachColumn(int[][] matrix) {
		for (int column = 0; column < matrix[0].length; column++) {
			long sum = 0;
			for (int row = 0; row < matrix.length; row++) {
				sum += matrix[row][column];
			}
			System.out.printf("Sum of column %d is: %d\n", column+1, sum);
		}
	}
	
	/**
	 * find upper triangular matrix
	 * @param matrix .
	 */
	public static void printUpperTriangularMatrix(int[][] matrix) {
		if (matrix.length != matrix[0].length) {
			return;
		}
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				if (column >= row) {
					System.out.printf("%7d", matrix[row][column]);
				}else {
					System.out.printf("%7s", "");
				}
			}
			System.out.println();
		}
	}
	
	/**
	 * find lower triangular matrix
	 * @param matrix .
	 */
	public static void printLowerTriangularMatrix(int[][] matrix) {
		if (matrix.length != matrix[0].length) {
			return;
		}
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				if (column <= row) {
					System.out.printf("%7d", matrix[row][column]);
				}else {
					System.out.printf("%7s", "");
				}
			}
			System.out.println();
		}
	}
	
	/**
	 * calculate sum of upper triangular matrix
	 * @param matrix .
	 * @return .
	 */
	public static long sumOfUpperTriangularMatrix(int[][] matrix) {
		if (matrix.length != matrix[0].length) {
			return 0;
		}
		long sum = 0;
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				if (column >= row) {
					sum += matrix[row][column];
				}
			}
		}
		return sum;
	}
	
	/**
	 * calculate sum of lower triangular matrix
	 * @param matrix .
	 * @return .
	 */
	public static long sumOfLowerTriangularMatrix(int[][] matrix) {
		if (matrix.length != matrix[0].length) {
			return 0;
		}
		long sum = 0;
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				if (column <= row) {
					sum += matrix[row][column];
				}
			}
		}
		return sum;
	}
	
	/**
	 * get transpose matrix.
	 * @param matrix .
	 * @return .
	 */
	public static int[][] transposeOfMatrix(int[][] matrix) {
		int[][] transposeMatrix = new int[matrix.length][matrix.length];
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix.length; column++) {
				transposeMatrix[row][column] = matrix[column][row];
			}
		}
		return transposeMatrix;
	}
	
	/**
	 * Check symmectric matrix.
	 * @param matrix .
	 * @return .
	 */
	public static boolean checkSymmetricMatrix(int[][] matrix) {
		int[][] transposeMatrix = transposeOfMatrix(matrix);
		return equalsMatrix(matrix, transposeMatrix);
	}
	
	/**
	 * The main method.
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		//Create random matrix.
		int numberRows = 3;
		int numberColumns = 3;
		int[][] matrix = new int[numberRows][numberColumns];
		getRandomInput(matrix);
		
		//1.2.1
		System.out.println("Matrix: ");
		printMatrix(matrix);
		System.out.println();
		
		//
		int[][] firstMatrix = new int[numberRows][numberColumns];
		getRandomInput(firstMatrix);
		int[][] secondMatrix = new int[numberRows][numberColumns];
		getRandomInput(secondMatrix);
		
		//1.2.2
		System.out.println("The first matrix: ");
		printMatrix(firstMatrix);
		System.out.println("The second matrix: ");
		printMatrix(secondMatrix);
		System.out.println("Add two matrix:");
		printMatrix(addMatrix(firstMatrix, secondMatrix));
		System.out.println();
		
		//1.2.3
		System.out.println("The first matrix: ");
		printMatrix(firstMatrix);
		System.out.println("The second matrix: ");
		printMatrix(secondMatrix);
		System.out.println("Subtract two matrix:");
		printMatrix(subtractMatrix(firstMatrix, secondMatrix));
		System.out.println();
		
		//1.2.4
		int a = 4;
		System.out.println("a = " + a);
		System.out.println("Matrix: ");
		printMatrix(matrix);
		System.out.println("Scalar matrix multiplication:");
		printMatrix(scalarMultiplicationMatrix(matrix, a));
		System.out.println();
		
		//1.2.5
		System.out.println("The first matrix: ");
		printMatrix(firstMatrix);
		System.out.println("The second matrix: ");
		printMatrix(secondMatrix);
		if (firstMatrix[0].length == secondMatrix.length) {
			System.out.println("Multiply two matrix:");
			printMatrix(multiplyMatrix(firstMatrix, secondMatrix));
		}else {
			System.out.println("Can't multiply these matrix.");
		}
		System.out.println();
		
		//1.2.6
		System.out.println("The first matrix: ");
		printMatrix(firstMatrix);
		System.out.println("The second matrix: ");
		printMatrix(secondMatrix);
		if (equalsMatrix(firstMatrix, secondMatrix)) {
			System.out.println("Two matrices are equal.");
		}else {
			System.out.println("Two matrices aren't equal.");
		}
		System.out.println();
		
		//1.2.7
		System.out.println("Matrix:");
		printMatrix(matrix);
		System.out.println("Sum of main diagonal elements of matrix: " + sumMainDiagonalMatrix(matrix));
		System.out.println();
		
		//1.2.8
		System.out.println("Matrix:");
		printMatrix(matrix);
		System.out.println("Sum of minor diagonal elements of matrix: " + sumMinorDiagonalMatrix(matrix));
		System.out.println();
		
		//1.2.9
		System.out.println("Matrix:");
		printMatrix(matrix);
		System.out.println("Sum of each row and each column.");
		printSumOfEachRow(matrix);
		printSumOfEachColumn(matrix);
		System.out.println();
		
		//1.2.10
		System.out.println("Matrix:");
		printMatrix(matrix);
		System.out.println("Upper triangular matrix: ");
		printUpperTriangularMatrix(matrix);
		
		//1.2.11
		System.out.println("Lower triangular matrix:");
		printLowerTriangularMatrix(matrix);
		System.out.println();
		
		//1.2.12
		System.out.println("Matrix:");
		printMatrix(matrix);
		System.out.println("Sum of upper triangular matrix: " + sumOfUpperTriangularMatrix(matrix));
		
		//1.2.13
		System.out.println("Sum of lower triangular matrix: " + sumOfLowerTriangularMatrix(matrix));
		System.out.println();
		
		//1.2.14
		System.out.println("Matrix:");
		printMatrix(matrix);
		System.out.println("Transpose matrix: ");
		int[][] transposeMatrix = transposeOfMatrix(matrix);
		printMatrix(transposeMatrix);
		System.out.println();
		
		//1.2.15
		System.out.println("Matrix:");
		printMatrix(matrix);
		System.out.println("This matrix is a symmetric matrix? " + checkSymmetricMatrix(matrix));
	}
}

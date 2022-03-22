package theoryClass.week0506.homework;

import java.util.Scanner;

/**
 * 
 * This program is used to check a input matrix 9x9 is a sudoku or not.
 * 
 * @author Bris
 * @version 1.0
 * @since 1:07:29 AM -  Mar 23, 2022
 */
public class CheckSudoku {
	/**
	 * 
	 * This method is used to print a matrix.
	 * 
	 * @param matrix is the matrix which you want to print.
	 */
	public static void printMatrix(int[][] matrix) {
		System.out.println("Your matrix: ");
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				System.out.printf("%-3d", matrix[row][column]);
			}
			System.out.println();
		}
	}
	
	/**
	 * 
	 * This method is used to check a row of matrix.
	 * 
	 * @param matrix is the matrix which you want to check
	 * @param row is the row which you want to check.
	 * @return Return true if this row is satisfies condition of a sudoku.
	 */
	public static boolean checkRow(int[][] matrix, int row) {
		boolean[] isUsed = new boolean[10];
		for (int number : matrix[row]) {
			isUsed[number] = true;
		}
		for (int i = 1; i <= 9; i++) {
			if (!isUsed[i]) 
				return false;
		}
		return true;
	}
	
	/**
	 * 
	 * This method is used to check a column of matrix.
	 * 
	 * @param matrix is the matrix which you want to check
	 * @param column is the column which you want to check.
	 * @return Return true if this column is satisfies condition of a sudoku.
	 */
	public static boolean checkColumn(int[][] matrix, int column) {
		boolean[] isUsed = new boolean[10];
		for (int i = 0; i < 9; i++) {
			isUsed[matrix[i][column]] = true;
		}
		for (int i = 1; i <= 9; i++) {
			if (!isUsed[i]) 
				return false;
		}
		return true;
	}
	
	/**
	 * 
	 * This method is used to check a square 3x3 of matrix.
	 * 
	 * @param matrix is the matrix which we are checking.
	 * @param firstRow is the first row of square 3x3
	 * @param firstColumn is the first column of the square 3x3
	 * @return Return true if this square is satisfies condition of a sudoku.
	 */
	public static boolean checkSquare(int[][] matrix, int firstRow, int firstColumn) {
		boolean[] isUsed = new boolean[10];
		for (int row = firstRow; row < firstColumn + 3; row++) {
			for (int column = firstColumn; column < firstColumn + 3; column++) {
				isUsed[matrix[row][column]] = true;
			}
		}
		for (int i = 1; i <= 9; i++) {
			if (!isUsed[i]) 
				return false;
		}
		return true;
	}
	
	/**
	 * 
	 * This method is used to check all rows of matrix.
	 * 
	 * @param matrix is the matrix which you want to check.
	 * @return Return true if all rows are satisfies the condition of sudoku.
	 */
	public static boolean checkAllRow(int[][] matrix) {
		for (int row = 0; row < 9; row++) {
			if (!checkRow(matrix, row)) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * 
	 * This method is used to check all columns of matrix.
	 * 
	 * @param matrix is the matrix which you want to check.
	 * @return Return true if all columns are satisfies the condition of sudoku.
	 */
	public static boolean checkAllColumn(int[][] matrix) {
		for (int column = 0; column < 9; column++) {
			if (!checkColumn(matrix, column)) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * 
	 * This method is used to check all squares 3x3 of matrix.
	 * 
	 * @param matrix is the matrix which you want to check.
	 * @return Return true if all squares 3x3 are satisfies the condition of sudoku.
	 */
	public static boolean checkAllSquare(int[][] matrix) {
		for (int row = 0; row < 9; row += 3) {
			for (int column = 0; column < 9; column += 3) {
				if (!checkSquare(matrix, row, column)) {
					return false;
				}
			}
		}
		return true;
	}
	
	/**
	 * 
	 * This method is used to check a matrix if it is a sudoku or not.
	 * 
	 * @param matrix is the matrix which you want to check.
	 * @return Return true if it is a sudoku.
	 */
	public static boolean checkSudoku(int[][] matrix) {
		return checkAllRow(matrix) && checkAllColumn(matrix) && checkAllSquare(matrix);
 	}
	
	/**
	 * 
	 * The main method - entry point of this program.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] matrix = new int[9][9];
		for (int row = 0; row < 9; row++) {
			for (int column = 0; column < 9; column++) {
				System.out.printf("matrix[%d][%d] = ", row, column);
				matrix[row][column] = scanner.nextInt();
			}
		}
		scanner.close();
		
		printMatrix(matrix);
		System.out.println();
		
		if (checkSudoku(matrix)) {
			System.out.println("Your matrix is a sudoku matrix.");
		}else {
			System.out.println("Your matrix is not a sudoku matrix.");
		}
	}
}

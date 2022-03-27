package theoryClass.week0506.submit;

/**
 * 
 * This program is used to create a random sudoku data, and then, check it is it is a valid sudoku data or not.
 * 
 * @author Bris
 * @version 1.0
 * @since 11:50:41 AM -  Mar 27, 2022
 */
public class Example07 {
	/**
	 * 
	 * This method is used to get a random number in range [startingNumber, endingNumber].
	 * 
	 * @param startingNumber .
	 * @param endingNumber .
	 * @return Return a random number in that range.
	 */
	public static int randomNumber(int startingNumber, int endingNumber) {
		int randomNumber = startingNumber + (int)(Math.round(Math.random()*(endingNumber - startingNumber)));
		return randomNumber;
	}
 	
	/**
	 * 
	 * This method is used to create a random sudoku data.
	 * 
	 * @return Return a random sudoku data.
	 */
	public static int[][] randomSudokuData() {
		int[][] sudoku = new int[9][9];
		for (int row = 0; row < 9; row++) {
			boolean[] isUsed = new boolean[10];
			for (int column = 0; column < 9; column++) {
				while (sudoku[row][column] == 0) {
					int x = randomNumber(1, 9);
					if (!isUsed[x]) {
						sudoku[row][column] = x;
						isUsed[x] = true;
					}
				}
			}
		}
		return sudoku;
	}
	
	/**
	 * 
	 * This method is used to print a sudoku.
	 * 
	 * @param sudoku is the matrix which you want to print.
	 */
	public static void printSudoku(int[][] sudoku) {
		for (int row = 0; row < sudoku.length; row++) {
			for (int column = 0; column < sudoku[row].length; column++) {
				System.out.printf("%-3d", sudoku[row][column]);
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
	public static boolean isValidSudokuData(int[][] matrix) {
		return checkAllRow(matrix) && checkAllColumn(matrix) && checkAllSquare(matrix);
 	}
	
	/**
	 * 
	 * The min method - entry point of this program.
	 * 
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		//Create a sudoku data
		int[][] sudoku = new int[9][9];
		sudoku = randomSudokuData();
		
		System.out.println("Sudoku:");
		printSudoku(sudoku);
		System.out.println();
		
		if (isValidSudokuData(sudoku)) {
			System.out.println("This is a valid sudoku.");
		}else {
			System.out.println("This is not a valid sudoku.");
		}
	}
}

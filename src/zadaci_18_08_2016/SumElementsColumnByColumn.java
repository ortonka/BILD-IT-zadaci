package zadaci_18_08_2016;

import java.util.InputMismatchException;

/*
 * (Sum elements column by column) Write a method that returns the sum of all the 
 * elements in a specified column in a matrix using the following header: 
 * public static double sumColumn(double[][] m, int columnIndex)
 * Write a test program that reads a 3-by-4 matrix and displays the sum of each column.
 *  
 * @author ortonka
 */

public class SumElementsColumnByColumn {

	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {

		// create 3-by-4 matrix
		double[][] m = createMatrix(3, 4);
		
		// call method for each column and show output
		for (int i = 0; i < m[0].length; i++) {
			System.out.printf("Sum of the elements at column %d. is %f\n", i + 1, sumColumn(m, i));
		}

	}

	// method returns matrix with defined number of columns and rows
	// with user defined values
	public static double[][] createMatrix(int row, int column) {

		double[][] matrix = new double[row][column];
		// enter values for each element of matrix
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.printf("Enter matrix element at the index %d,%d: ", i, j);
				matrix[i][j] = checkInputD();
			}
		}
		return matrix;

	}

	// method returns sum for defined column in matrix m
	public static double sumColumn(double[][] m, int columnIndex) {
		// create variable sum
		double sum = 0;
		// add elements of each row for defined column
		for (int i = 0; i < m.length; i++) {
			sum += m[i][columnIndex];
		}
		return sum;
	}

	// check input, method returns double value
	public static double checkInputD() {

		double n = 0;
		boolean error = true;

		do {
			try {
				n = input.nextDouble();
				error = false;
			} catch (InputMismatchException e) {
				System.out.print("Invalid input, try again:  ");
				input.nextLine();
			}
		} while (error); // loop is executed while error=true

		return n;
	}

}

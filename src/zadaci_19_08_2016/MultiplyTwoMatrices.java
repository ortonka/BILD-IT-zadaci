package zadaci_19_08_2016;

import java.util.InputMismatchException;

/*
 * Write a method to multiply two matrices. The header of the method is: 
 * public static double[][] multiplyMatrix(double[][] a, double[][] b)
 * 
 * @author ortonka
 */

public class MultiplyTwoMatrices {

	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		//Write a test program that prompts the user to enter two 3 * 3 matrices and 
		//displays their sum
		System.out.println("Martix 1:");
		double[][] a = createMatrix(3, 3);
		
		System.out.println("Martix 2:");
		double[][] b = createMatrix(3, 3);
		
		if (a.length != b.length || a[0].length != b[0].length)
			System.out.println("Matrices must have the same dimensions !");
		else {
			double[][] result = multiplyMatrix(a, b);
			print(a, b, result);
		}

	}
//this method multiply two matrices
	public static double[][] multiplyMatrix(double[][] a, double[][] b) {

		double[][] result = new double[a.length][a[0].length];
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[0].length; j++)
				result[i][j] = a[i][j] * b[i][j];
		}
		return result;

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

	// this method displays all the elements in row 
	public static void printRow(double[][] m, int row) {
		System.out.print("|");
		for (int i = 0; i < m[row].length; i++) {
			System.out.printf("%7.1f ",m[row][i]);
		}
		System.out.print("|");
	}

	// this method displays results 
	public static void print(double[][] m1, double[][] m2, double[][] m3) {
		int middle=(m1.length-1)/2;
		System.out.println("\nThe matrices are multiplied as follows");

		for (int i = 0; i < m1.length; i++) {
			printRow(m1, i);
			System.out.print((i == middle ? "  *  " : "     "));
			printRow(m2, i);
			System.out.print((i == middle ? "  =  " : "     "));
			printRow(m3, i);
			System.out.println();
		}
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

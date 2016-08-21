package zadaci_20_08_2016;

import java.util.InputMismatchException;

/*
 * (Row sorting) Implement the following method to sort the rows in a twodimensional array. 
 * A new array is returned and the original array is intact. 
 * public static double[][] sortRows(double[][] m) 
 * Write a test program that prompts the user to enter a 3 * 3 matrix of double 
 * values and displays a new row-sorted matrix.
 * 
 * @author ortonka
 */

public class SortRows {

	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		//kreiranje matrice 3x3
		double[][] m = createMatrix(3, 3);
		System.out.println("\nMatrica prije sortiranja: ");
		//ispis matrice
		printMatrix(m);
		System.out.println("\nMatrica poslije sortiranja: ");
		//sortiranje
		double[][] matrix = sortRows(m);
		printMatrix(matrix);

	}

	// kreira matricu zeljenih dimenzija s korisnikovim unosom
	public static double[][] createMatrix(int n, int m) {
		double[][] matrix = new double[n][m];
		System.out.printf("Unesite %d elemenata za %d x %d matricu! \n", n * m, n, m);
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.printf("Unesite elemenat na indeksu %d,%d: ", i, j);
				matrix[i][j] = checkInput();
			}
		}
		return matrix;

	}

	// vraca kopiju matrice m
	public static double[][] copyMatrix(double[][] m) {
		double[][] matrix = new double[m.length][m[0].length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = m[i][j];
			}
		}
		return matrix;
	}

	// vraca novu sortiranu verziju matrice m
	public static double[][] sortRows(double[][] m) {
		// napravi kopiju matrice, zadatak zahtjeva da se orginalna matrica ne
		// mijenja
		double[][] matrix = copyMatrix(m);
		for (int k = 0; k < matrix.length; k++) {
			// sortiranje redova, O(n*log(n))
			java.util.Arrays.sort(matrix[k]);

		}
		return matrix;
	}

	// ispisuje matricu
	public static void printMatrix(double[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.printf("%7.1f ", matrix[i][j]);
			}
			System.out.println();
		}

	}

	// provjera unosa
	public static double checkInput() {
		double num = 0;
		boolean error = true;

		do {
			try {
				num = input.nextDouble();
				error = false;

			} catch (InputMismatchException e) {
				System.out.print("Pogresan unos, pokusajte ponovo: ");
				input.nextLine();
			}
			// petlja se izvrsava dok postoji greska
		} while (error);

		return num;
	}

}

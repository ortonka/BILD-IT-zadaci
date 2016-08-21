package zadaci_20_08_2016;

import java.util.InputMismatchException;

/*
 *  Write a test program that prompts the user to enter a two-dimensional array 
 *  and displays the location of the largest element in the array. 
 *  
 */

public class TestLocation {

	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		try {
			System.out.print("Unesite broj redova matrice: ");
			int row = input.nextInt(); // unos broja redova
			System.out.print("Unesite broj kolona matrice: ");
			int column = input.nextInt(); // unos broja kolona

			// kreiranje matrice
			double[][] m = createMatrix(row, column);
			// kreiranje instance klase Location
			Location l = Location.locateLargest(m);
			// ispis
			System.out.printf("Maksimalan elemenat je %3.2f, i nalazi se na lokaciji (%d,%d).", l.maxValue_, l.row_,
					l.column_);

		} catch (Exception e) {
			System.out.println("Pogresan unos, restart.");
		}

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

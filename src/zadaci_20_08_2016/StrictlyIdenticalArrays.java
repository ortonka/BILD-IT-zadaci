package zadaci_20_08_2016;

import java.util.InputMismatchException;

/*
 * (Strictly identical arrays) The two-dimensional arrays m1 and m2 are strictly 
 * identical if their corresponding elements are equal. Write a method that returns 
 * true if m1 and m2 are strictly identical, using the following header: 
 * public static boolean equals(int[][] m1, int[][] m2) 
 * Write a test program that prompts the user to enter two 3 * 3 arrays of 
 * integers and displays whether the two are strictly identical.
 * 
 * @author ortonka
 */

public class StrictlyIdenticalArrays {

	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Unesite 9 elemenata za matricu 1: ");
		// kreiranje matrice 3x3
		int[][] m1 = createMatrix(3, 3);
		System.out.print("Unesite 9 elemenata za matricu 2: ");
		// kreiranje matrice 3x3
		int[][] m2 = createMatrix(3, 3);
		// poziv metoda i ispis
		if (equals(m1, m2))
			System.out.println("Matrice su identicne !");
		else
			System.out.println("Matrice nisu identicne !");

	}

	// provjerava da li su dvije matrice striktno identicne
	public static boolean equals(int[][] m1, int[][] m2) {
		// ukoliko im se razlikuju dimenzije, vrati false
		if (m1.length != m2.length || m1[0].length != m2[0].length)
			return false;
		// ukoliko naidje na bilo koje elemente na istim pozicijama koji se
		// razlikuju, brati false
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < i; j++) {
				if (m1[i][j] != m2[i][j])
					return false;
			}
		}
		// ukoliko su svi jednaki, vrati true
		return true;
	}

	// kreira matricu zeljenih dimenzija s korisnikovim unosom
	public static int[][] createMatrix(int n, int m) {
		// kreiraj 2D niz zeljenih dimenzija
		int[][] matrix = new int[n][m];
		// varijabla za izvrsavanje petlje
		boolean error = true;
		// sve dok unos nije validan, ponovi unos
		do {
			try {
				for (int i = 0; i < matrix.length; i++) {
					for (int j = 0; j < matrix[0].length; j++) {
						matrix[i][j] = input.nextInt();
					}
				}
				// ako je unos uspjesno zavrsen, izadji iz petlje
				error = false;
			} catch (InputMismatchException e) {
				System.out.print("Pogresan unos, pokusajte ponovo: ");
				input.nextLine();
			}
			// petlja se izvrsava dok postoji greska
		} while (error);
		// vrati zeljenu matricu
		return matrix;

	}

}

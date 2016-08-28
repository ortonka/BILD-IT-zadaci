package zadaci_27_08_2016;

import java.util.ArrayList;
/*
 * Write a program that randomly fills in 0s and 1s 
 * into an n-by-n matrix, prints the matrix, and finds the rows and columns with the 
 * most 1s. (Hint: Use two ArrayLists to store the row and column indices with 
 * the most 1s.)
 */

public class LargestRowColumn {

	public static void main(String[] args) {
		//kreiranje matrice
		int[][] matrix = createMatrix(5);
		printMatrix(matrix);
		//poziv metoda za pronalazak indeksa redova i kolona sa max brojem jedinica
		ArrayList<Integer> row = findRow(matrix);
		ArrayList<Integer> column = findColumn(matrix);
		//ispis
		System.out.println("The largest row index: " + row.toString());
		System.out.println("The largest column index: " + column.toString());

	}

	// nalazi maksimalan elemenat u nizu
	public static int max(int[] array) {
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max)
				max = array[i];
		}
		return max;
	}

	// vraca indekse reda
	public static ArrayList<Integer> findRow(int[][] matrix) {
		// za spremanje indeksa redova sa max brojem jedinica
		ArrayList<Integer> row = new ArrayList<>();
		// za spremanje broja jedinica u svakom redu
		int[] niz = new int[matrix.length];
		// prebroji jedinice u svakom redu
		for (int i = 0; i < matrix.length; i++) {
			int counter = 0;
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 1)
					counter++;
			}
			niz[i] = counter;

		}
		// pronadji max broj jedinica
		int max = max(niz);
		// ako red ima max broj jedinica, dodaj indeks reda u ArrayList
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] == max) {
				row.add(i);
			}
		}
		// vrati ArrayList
		return row;

	}

	// vraca indekse kolona sa najvecim brojem jedinica
	public static ArrayList<Integer> findColumn(int[][] matrix) {
		int[] niz = new int[matrix.length];

		ArrayList<Integer> column = new ArrayList<>();

		for (int i = 0; i < matrix[0].length; i++) {
			int counter = 0;
			for (int j = 0; j < matrix.length; j++) {
				if (matrix[j][i] == 1)
					counter++;
			}
			niz[i] = counter;
		}

		int max = max(niz);

		for (int i = 0; i < niz.length; i++) {
			if (niz[i] == max) {
				column.add(i);
			}
		}
		return column;

	}

	// kreiraj matricu nxn i ispuni je sa nasumicnim 0 i 1
	public static int[][] createMatrix(int n) {

		int[][] matrix = new int[n][n];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int) (Math.random() * 2);
			}
		}
		return matrix;

	}

	// isprintaj matricu
	public static void printMatrix(int[][] matrix) {

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}

}

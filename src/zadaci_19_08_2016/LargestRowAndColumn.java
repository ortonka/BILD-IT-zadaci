package zadaci_19_08_2016;



/*
 * (Largest row and column) Write a program that randomly fills in 0s and 1s into 
 * a 4-by-4 matrix, prints the matrix, and finds the first row and column with the 
 * most 1s. 
 * 
 * @author ortonka
 */

public class LargestRowAndColumn {

	public static void main(String[] args) {
		int[][] matrica = createMatrix();
		printMatrix(matrica);
		System.out.println("The largest row index: " + findRow(matrica));
		System.out.println("The largest column index: " + findColumn(matrica));

	}

	// kreiraj matricu 4x4 i ispuni je sa nasumicnim 0 i 1
	public static int[][] createMatrix() {

		int[][] matrix = new int[4][4];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = (int) (Math.random() * 2);
			}
		}
		return matrix;

	}

	// nalazi maksimalan elemenat u nizu
	public static int max(int[] niz) {
		int max = niz[0];
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] > max)
				max = niz[i];
		}
		return max;
	}

	// vraca indeks prve kolone sa najvecim brojem jedinica
	public static int findColumn(int[][] matrix) {
		int[] niz = new int[matrix.length];
		for (int i = 0; i < matrix[0].length; i++) {
			int brojac = 0;
			for (int j = 0; j < matrix.length; j++) {
				if (matrix[j][i] == 1)
					brojac++;
			}
			niz[i] = brojac;
		}
		int max = max(niz);
		int column = 0;
		for (int i = niz.length - 1; i > 0; i--) {
			if (niz[i] == max) {
				column = i;
			}
		}
		return column;

	}

	// vraca indeks reda
	public static int findRow(int[][] matrix) {
		int[] niz = new int[matrix.length];
		for (int i = 0; i < matrix.length; i++) {
			int brojac = 0;
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 1)
					brojac++;
			}
			niz[i] = brojac;

		}
		int max = max(niz);
		int row = 0;
		for (int i = niz.length; i > 0; i--) {
			if (niz[i] == max) {
				row = i;
			}
		}
		return row;

	}

	// isprintaj matricu
	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}

}

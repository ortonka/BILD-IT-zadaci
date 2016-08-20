package zadaci_19_08_2016;
/*
 * (Even number of 1s) Write a program that generates a 6-by-6 two-dimensional 
 * matrix filled with 0s and 1s, displays the matrix, and checks if every row and 
 * every column have an even number of 1s.
 */

public class EvenNumbers {

	public static void main(String[] args) {
		//kreiranje matrice
		int[][] matrix=createMatrix();
		//ispis matrice
		printMatrix(matrix);
		//poziv metoda
		if(EvenNumRow(matrix))
			System.out.println("Matrica ima paran broj 1 u svakom redu.");
		else
			System.out.println("Matrica nema paran broj 1 u svakom redu.");
		
		if(EvenNumColumn(matrix))
			System.out.println("Matrica ima paran broj 1 u svakoj koloni.");
		else
			System.out.println("Matrica nema paran broj 1 u svakoj koloni.");


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
	
	
	// kreiraj matricu 4x4 i ispuni je sa nasumicnim 0 i 1
		public static int[][] createMatrix() {

			int[][] matrix = new int[6][6];

			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[0].length; j++) {
					matrix[i][j] = (int) (Math.random() * 2);
				}
			}
			return matrix;

		}
	//provjerava je li paran broj jedinica u svakom redu
	public static boolean EvenNumRow(int[][] m) {
		int count = 0;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j] == 1)
					count++;
			}
			if (count % 2 != 0)
				return false;
		}
		return true;
	}
	//provjerava je li paran broj jedinica u svakoj koloni
	public static boolean EvenNumColumn(int[][] m) {
		int count = 0;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (m[j][i] == 1)
					count++;
			}
			if (count % 2 != 0)
				return false;
		}
		return true;
	}

}

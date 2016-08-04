package zadaci_03_08_2016;

import java.util.InputMismatchException;

/*
 *  Implementirati sljedecu metodu da sortira redove u 2D nizu. 
 *  
 *  public static double[ ][ ] sortRows(double[ ][ ] array)
 *  
 *  Napisati testni program koji pita korisnika da unese 3x3 matricu (ili da pita korisnika koliku
 *  matricu zeli unijeti) te mu ispisuje na konzoli matricu sa sortiranim redovima -
 *  od najmanjeg broja do najveceg.
 *  
 *  @author ortonka
 */
public class SortRows {
	
	static java.util.Scanner input=new java.util.Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Unesite dimenzije matrice, unesite broj redova: ");
		int red=checkInput();
		System.out.print("Unesite broj kolona: ");
		int kolona=checkInput();
		double[][] m = createMatrix(red, kolona);
		printMatrix(m);
		System.out.println();
		sortRows(m);
		input.close();
	}
	
//kreiranje matrice sa zeljenim brojem redova i kolona
	public static double[][] createMatrix(int row, int column) {
		double[][] matrix = new double[row][column];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.printf("Unesite element matrice na indexu %d,%d: ", i, j);
				matrix[i][j] = checkInput();
			}
		}
		return matrix;

	}
//kopiranje matrice
	public static double[][] copyMatrix(double[][] m) {
		double[][] matrix = new double[m.length][m[0].length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = m[i][j];
			}
		}
		return matrix;
	}
//sortiranje redova
	public static double[][] sortRows(double[][] m) {
		double[][] matrix = copyMatrix(m);
		for (int k = 0; k < matrix.length; k++) {
			for (int j = 0; j < (matrix[0].length - 1); j++) {

				for (int i = 1; i < matrix[0].length; i++) {

					if (matrix[k][i - 1] > matrix[k][i]) {
						double pom = matrix[k][i];
						matrix[k][i] = matrix[k][i - 1];
						matrix[k][i - 1] = pom;

					}

				}

			}
		}
		printMatrix(matrix);
		return matrix;
	}
//printanje matrice
	public static void printMatrix(double[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}
	
	//provjera unosa
			public static int checkInput() {

				int n = 0;
				boolean error = true; // varijabla za provjeru
				// unos brojeva u nizu
				do {
					try {
						n = input.nextInt();
						if(n<0)
							throw new InputMismatchException("Negativan broj");
						error = false;
					} catch (InputMismatchException e) {
						System.out.print("Nevalidan unos, pokusajte ponovo:  ");
						input.nextLine();
					}
				} while (error);
				
				return n;
			}


}

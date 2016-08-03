package zadaci_02_08_2016;

import java.util.InputMismatchException;

/*Napisati metodu koja ispisuje n x n matricu korsiteci sljedeci header:
 *
 *	public static void printMatrix(int n)
 *
 * Svaki element u matrici je ili 0 ili 1, generisan nasumicno. 
 * Napisati test program koji pita korisnika da unese n te ispisuje n x n matricu.
 * 
 *@author ortonka
 * 
 */

public class Matrix {

	public static void main(String[] args) {
		
		java.util.Scanner input=new java.util.Scanner(System.in);
		int n=0; //broj kolona/redova
		
		System.out.print("Unesite broj kolona/redova za matricu: ");
		boolean error = true; // varijabla za provjeru
		// unos broja redova/kolona
		do {
			try {
				n = input.nextInt();
				if (n < 0) {
					System.out.print("Nevalidan unos, broj kolona/redova mora biti pozitivan, pokusajte ponovo: ");
					error = true;
				} else
					error = false;
			} catch (InputMismatchException e) {
				System.out.println("Nevalidan unos, pokusajte ponovo: \nUnesite broj redova/kolona: ");
				input.nextLine();
			}
		} while (error);
		
		input.close();
		
		int[][] matrix = new int[n][n]; //kreiranje matrice

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int) (Math.random() * 2);
			}
		}
		
		printMatrix(matrix);  //metoda za ispis matrice
	}
	
	//metod za ispis matrice
	public static void printMatrix(int[][] matrix){
		for(int i=0; i<matrix.length; i++){
			for(int j=0; j<matrix[0].length; j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	

}

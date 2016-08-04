package zadaci_03_08_2016;

import java.util.InputMismatchException;


/*
 * Napisati metodu koja vraca lokaciju najveceg elementa u 2D nizu. Metoda treba da koristi
 * sljedeci header:
 * 
 * public static int[ ] locateLargest(double[ ][ ] a)
 * 
 * Napisati test program koji pita korisnika da unese 2D niz te mu ispisuje lokaciju najveceg 
 * elementa u nizu.
 * 
 * @author ortonka
 */
public class LocateLargest {
	
	static java.util.Scanner input=new java.util.Scanner(System.in);
	
	public static void main(String[] args) {
		
				
		System.out.print("Unesite dimenzije matrice, unesite broj redova: ");
		int red=checkInput();
		System.out.print("Unesite broj kolona: ");
		int kolona=checkInput();
		double[][] matrica = createMatrix(red, kolona);
		input.close();
		int[] niz = locateLargest(matrica);
		System.out.println("Indexi najveceg elementa u matrici su: (" + niz[0]
				+ " , " + niz[1] + ")");

	}
	
	//kreiranje matrice sa zeljenim brojem redova i kolona
		public static double[][] createMatrix(int row, int column) {
			double[][] matrix = new double[row][column];
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[0].length; j++) {
					System.out.printf("Unesite element matrice na indexu %d,%d: ", i, j);
					matrix[i][j] = checkInputD();
				}
			}
			return matrix;

		}
		//vrati maximalni element
	public static double maxElement(double[][] a) {
		double max = a[0][0];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (a[i][j] > max)
					max = a[i][j];
			}
		}
		return max;
	}
	//lociraj najveci elemenat
	public static int[] locateLargest(double[][] a) {
		double elem = maxElement(a);
		int[] niz = new int[2];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (a[i][j] == elem) {
					niz[0] = i;
					niz[1] = j;
					break;
				}
			}
		}
		return niz;

	}
	
	//provjera unosa
	public static int checkInput() {

		int n = 0;
		boolean error = true; // varijabla za provjeru
		
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
	
	//provjera unosa za Double varijable
	public static double checkInputD() {

		double n = 0;
		boolean error = true; // varijabla za provjeru
		
		do {
			try {
				n = input.nextDouble();
				error = false;
			} catch (InputMismatchException e) {
				System.out.print("Nevalidan unos, pokusajte ponovo:  ");
				input.nextLine();
			}
		} while (error);
		
		return n;
	}


}

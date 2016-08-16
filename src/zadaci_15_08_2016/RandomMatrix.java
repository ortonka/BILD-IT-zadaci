package zadaci_15_08_2016;

import java.util.InputMismatchException;

/*
 * Napisati metodu koja ispisuje n x n matricu koristeci se sljedecim headerom: 
 * public static void printMatrix(int n). 
 * Svaki element u matrici je ili 0 ili 1, nasumicno generisana. Napisati test program koji pita 
 * korisnika da unese broj n te mu ispiše n x n matricu u konzoli.
 * 
 * @author ortonka
 */
public class RandomMatrix {
	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		// provjera unosa
		int n = checkInput();
		System.out.printf("Matrica dimenzija %dx%d:\n",n,n);
		// poziv metode
		printMatrix(n);
	}

	public static void printMatrix(int n) {
		// vanjska petlja za redove
		for (int i = 0; i < n; i++) {
			// unutrasnja za kolone
			for (int j = 0; j < n; j++) {
				System.out.print((int) (Math.random() * 2) + " ");
			}
			System.out.println();
		}
	}

	// provjera unosa
	public static int checkInput() {
		int num = 0;
		boolean error = true;

		do {
			try {
				System.out.print("Unesite dimenziju n kvadratne matrice nxn: ");
				// unos broja tipa int
				num = input.nextInt();
				error = false;

			} catch (InputMismatchException e) {
				System.out.print("Pogresan unos, pokusajte ponovo. \n");
				input.nextLine();
			}
			// petlja se izvrsava dok postoji greska
		} while (error);

		return num;
	}

}

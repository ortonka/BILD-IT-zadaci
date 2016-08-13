package zadaci_12_08_2016;

import java.util.Arrays;
import java.util.InputMismatchException;

/*
 * Napisati program koji pita korisnika da unese 3 cijela broja te mu ispiše ta ista tri broja u 
 * rastucem redosljedu. Bonus: Napisati metodu koja prima tri cijela broja kao argumente te vraca 
 * brojeve u rastucem redosljedu. 
 */

public class AscendingOrder {

	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Unesite tri cijela broja.");
		int num1 = checkInput(); // prvi broj
		int num2 = checkInput(); // drugi broj
		int num3 = checkInput(); // treci broj
		// poziv metoda
		int[] niz = ascendingOrder(num1, num2, num3);
		// ispis
		System.out.print("(Metoda) Brojevi u rastucem redoslijedu: ");
		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + "  ");
		}
		
/*		
		// rastuci redoslijed bez metoda
		boolean swapped = false;
		do {
			swapped = false; // ako ne udje ni u jednu petlju, redoslijed je vec
								// sortiran
			// Ako je num2 manji od num1, zamijeni redoslijed
			if (num2 < num1) {
				int tmp = num2;
				num2 = num1;
				num1 = tmp;
				swapped = true;
			}
			// Ako je num3 manji od num2, zamijeni redoslijed
			if (num3 < num2) {
				int tmp = num3;
				num3 = num2;
				num2 = tmp;
				swapped = true;
			}
		} while (swapped);
		// ispis
		System.out.printf("\nBrojevi u rastucem redoslijedu: %d, %d, %d.", num1, num2, num3);
*/
	}

	// metoda koja vraca brojeve u rastucem redoslijedu
	public static int[] ascendingOrder(int num1, int num2, int num3) {
		int[] niz = { num1, num2, num3 };
		Arrays.sort(niz);
		return niz;
	}

	// provjera unosa
	public static int checkInput() {
		int num = 0;
		boolean error = true;

		do {
			try {
				System.out.print("Unesite cijeli broj: ");
				num = input.nextInt();
				error = false;

			} catch (InputMismatchException e) {
				System.out.print("Pogresan unos, pokusajte ponovo. ");
				input.nextLine();
			}
			// petlja se izvrsava dok postoji greska
		} while (error);

		return num;
	}

}

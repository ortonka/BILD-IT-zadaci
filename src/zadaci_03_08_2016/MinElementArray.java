package zadaci_03_08_2016;

import java.util.InputMismatchException;

/*
 * Napisati metodu koja nalazi najmanji element u nizu decimalnih vrijednosti koristeci
 *  se sljedecim headerom:
 *
 *	public static double min(double[ ] array)
 *
 * Napisite potom test program koji pita korisnika da unese deset brojeva te poziva ovu
 * metodu da vrati najmanji element u nizu.
 */

public class MinElementArray {

	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {

		final int n = 10; // broje elemenata u nizu
		double[] array = new double[n]; // kreiraj niz sa n elemenata

		// Unos elemenata u niz
		for (int i = 0; i < n; i++) {
			System.out.printf("Unesite %d. broj u nizu: ", i + 1);
			// provjera elemenata te dojela elemenata u niz
			array[i] = checkInput();
		}
		// ispis minimalnog elementa
		System.out.printf("Minimalni element u nizu je %f.", min(array));
		input.close();
	}

	// metoda koja nalazi min elemenat u nizu
	public static double min(double[] array) {
		double min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (min > array[i])
				min = array[i];
		}
		return min;
	}

	// provjera unosa
	public static double checkInput() {

		double n = 0;
		boolean error = true; // varijabla za provjeru
		// unos broja redova/kolona
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

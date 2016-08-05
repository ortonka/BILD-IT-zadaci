package zadaci_04_08_2016;

import java.util.InputMismatchException;

public class FactoringANumber {

	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Unesite broj cije faktore zelite odrediti: ");
		int val = checkInput(); // varijabla za unos broja za provjeru

		int[] result = factorsOf(val); // niz faktora
		// ispis
		System.out.println("Faktori broja " + val + " je:");
		// for petlja za ispis faktora broja
		for (int i = 0; i < result.length && result[i] != 0; i++) {
			if (result[i] != 1)
				System.out.println(result[i] + " ");
		}
	}

	// metoda za racunanje faktora
	static int[] factorsOf(int val) {
		// granica unutar for petlje
		int limit = (int) Math.ceil(Math.sqrt(val));
		int[] numArray = new int[limit]; // niz faktora
		int index = 0;

		for (int i = 2; i <= limit; i++) {
			if (val % i == 0) {
				numArray[index++] = i;
				val /= i;
			}
			if (val % i == 0)
				i--;
		}
		// niz faktora
		numArray[index] = val;
		return numArray;
	}

	// provjera unosa
	public static int checkInput() {

		int n = 0;
		boolean error = true; // varijabla za provjeru

		do {
			try {
				n = input.nextInt();
				error = false;
			} catch (InputMismatchException e) {
				System.out.print("Nevalidan unos, pokusajte ponovo:  ");
				input.nextLine();
			}
		} while (error);

		return n;
	}

}

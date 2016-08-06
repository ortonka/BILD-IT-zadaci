package zadaci_05_08_2016;
/*
 * Napisati program koji prima 10 cijelih brojeva te ih ispisuje u obrnutom redoslijedu. 
 * 
 * @author ortonka
 */

import java.util.InputMismatchException;

public class Reverse {
	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {

		int[] niz1 = new int[10];
		// varijabla kojom se kontrolise unos
		
		//unos u niz
		for (int i = 0; i < niz1.length; i++) {
			System.out.printf("Unesite %2d. cijeli broj: ", i + 1);
			niz1[i] = checkInput();
		}
		
		int[] niz2 = reverse(niz1);
		//ispis
		System.out.println("Niz u obrnutom redoslijedu izgleda: ");
		for (int e : niz2) {
			System.out.print(e + " ");
		}

	}

	// metoda koja vraca niz sa obrnutim redoslijedom elemenata
	public static int[] reverse(int[] array) {
		int[] niz = new int[array.length];
		int counter = array.length - 1;
		for (int i = 0; i < array.length; i++) {
			niz[i] = array[counter];
			counter--;
		}
		return niz;
	}

	// provjera unosa
	public static int checkInput() {

		int n = 0;
		boolean error = true; // varijabla za provjeru
		// unos broja redova/kolona
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

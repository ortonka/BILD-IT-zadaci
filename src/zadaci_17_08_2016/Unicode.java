package zadaci_17_08_2016;

import java.util.InputMismatchException;

/*
 * Napisati program koji prima karakter te vraca njegov Unicode. 
 * Primjer: ukoliko korisnik unese karakter E program mu vraca 69 kao unicode za taj karakter.
 * 
 * @author ortonka
 */

public class Unicode {
	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {

		// unos karaktera
		char c = checkInput();
		// ispis Unicode
		System.out.println("Unicode za karakter \"" + c + "\" je " + (int) (c) + ".");

	}

	// provjera unosa
	public static char checkInput() {
		char c = 0;
		boolean error = true;

		do {
			try {
				System.out.print("Unesite jedan karakter: ");
				// uzimanje karaktera na prvom mjestu stringa
				c = (input.next()).charAt(0);
				error = false;

			} catch (InputMismatchException e) {
				System.out.print("Pogresan unos, pokusajte ponovo. \n");
				input.nextLine();
			}
			// petlja se izvrsava dok postoji greska
		} while (error);

		return c;
	}

}

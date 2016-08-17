package zadaci_16_08_2016;

import java.util.InputMismatchException;

/*
 * Napisati program koji pita korisnika da unese cijeli broj te ispisuje piramidu svih brojeva 
 * do tog broja. (Na primjer, ukoliko korisnik unese 7 vrh piramide je broj 1, red ispod vrha 
 * piramide je 2 1 2, red ispod je 3 2 1 2 3, red ispod 4 3 2 1 2 3 4 itd.)
 * 
 * @author ortonka
 */
public class Pyramide {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		boolean error = true;	//varijabla za provjeru
		int num = 0;			//broj redova
		//provjera unosa
		do {
			try {
				System.out.print("Unesite broj: ");

				num = input.nextInt();
				if (num < 0) {
					System.out.println("Broj mora biti pozitivan.");
					throw new InputMismatchException();
				}
				error = false;

			} catch (InputMismatchException e) {
				System.out.print("Pogresan unos, pokusajte ponovo. ");
				input.nextLine();
			}
			// petlja se izvrsava dok postoji greska
		} while (error);
		input.close();

		for (int i = 1; i <= num; i++) {
			// ispis praznih mjesta po svakom redu
			for (int k = num; k > i; k--) {
				System.out.print("   ");
			}
			// ispis brojeva na lijevoj strani trougla
			for (int j = i; j > 0; j--) {
				System.out.printf("%2d ", j);
			}
			// ispis brojeva na desnoj strani trougla
			for (int k = 2; k <= i; k++)
				System.out.printf("%2d ", k);
			// prelazak u novi red
			System.out.println();
		}

	}

}

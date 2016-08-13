package zadaci_12_08_2016;

import java.util.InputMismatchException;

/*
 * Napisati program koji ucitava cijele brojeve u rasponu od 1 do 100 te broji i ispisuje koliko 
 * je koji broj puta unijet. Pretpostavimo da nula prekida unos brojeva. Ukoliko unesemo sljedeci 
 * niz brojeva 2 5 6 23 42 58 2 6 0 program nam ispisuje da se broj 2 ponavlja 2 puta, broj 5 
 * jednom, broj 6 2 puta, broj 23 jednom, itd.
 * 
 * @author ortonka
 */

public class Count {

	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Unesite brojeve, 0 terminira unos: ");
		
		//kreiranje niza sa 100 elemenata
		int[] count = new int[100];
		
		int num = checkInput(); // broj
		
		//sve dok je unos razlicit od nula
		while (num != 0) {
			//count koliko se puta koji broj ponavlja
			for (int i = 0; i < count.length; i++) {
				if (num == (i + 1)) {
					count[i]++;
				}
			}

			// broj je jednak unosu
			num = checkInput();

		}
		//ispis
		for (int i = 0; i < count.length; i++) {
			if (count[i] != 0)
				System.out.printf("Broj %d se ponovio %d puta.\n", i + 1, count[i]);
		}

	}

	// provjera unosa
	public static int checkInput() {

		boolean error = true; // varijabla za provjeru
		int num = 0;
		do {
			try {
				num = input.nextInt();
				error = false;
				if (num < 0 || num > 100) {
					System.out.println("Broj mora biti u intervau 1-100, nula terminira unos.");
					error = true;
				}
			} catch (InputMismatchException e) {
				System.out.println("Nevalidan unos, pokusajte ponovo: ");
				input.nextLine();
			}
		} while (error);
		return num;
	}

}

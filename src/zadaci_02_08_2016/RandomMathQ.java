package zadaci_02_08_2016;

import java.util.InputMismatchException;

/*
 * Napisati metodu koja prima jedan argument, broj pitanja,
 * te generise toliko nasumicnih, jednostavnih pitanja oduzimanja tipa:
 * „Koliko je 5 - 2 ?“. Metoda treba da broji broj tacnih i netacnih odgovora
 * te ih ispise korisniku.
 * 
 * @author ortonka
 */

public class RandomMathQ {

	public static void main(String[] args) {
		//kreiranje skenera
		java.util.Scanner input = new java.util.Scanner(System.in);

		System.out.print("Unesite broj pitanja: ");
		//varijabla za provjeru
		boolean error = true;
		//varijabla u koju se sprema broj pitanja
		int numOfQ = 0;
		do {
			try {
				numOfQ = input.nextInt();
				error = false;
			} catch (InputMismatchException e) {
				System.out.println("Nevalidan unos, pokusajte ponovo: \nUnesite broj pitanja: ");
				input.nextLine();
			}
		} while (error);
		//varijabla za brojanje broja tacnih odgovora
		int correct = 0;
		for (int i = 0; i < numOfQ; i++) {
			//2 random broja koja ce se koristiti u pitanjima
			int num1 = (int) (Math.random() * 10);
			int num2 = (int) (Math.random() * 10);
			//tacan odgovor
			int suma = 0;
			//korisnikov odgovor
			int sumaUser = 0;

			boolean error2 = true;
			do {
				try {
					if (num1 < num2) {
						suma = num2 - num1;
						System.out.print("Koliko je " + num2 + " - " + num1 + "? ");

					} else {
						suma = num1 - num2;
						System.out.print("Koliko je " + num1 + " - " + num2 + "? ");
					}
					sumaUser = input.nextInt();
					error2 = false;
				} catch (InputMismatchException e) {
					System.out.println("Nevalidan unos, pokusajte ponovo: ");
					input.nextLine();
				}
			} while (error2);
			//provjera da li je odgovor tacan
			if (suma == sumaUser) {
				correct++;
				System.out.println("Cestitamo, odgovor je tacan.");
			} else {

				System.out.println("Odgovor nije tacan.");
			}

		}
		//krajnji ispis
		System.out.println("Od ukupnog broja od " + numOfQ + " pitanja, tacno je odgovorenih " + correct
				+ ", a netacno odgovorenih je " + (numOfQ - correct));
		input.close();

	}

}

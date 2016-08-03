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

		java.util.Scanner input = new java.util.Scanner(System.in); // kreiranje
																	// skenera
		int numOfQ = 0; // varijabla u koju se sprema broj pitanja
		int correct = 0; // varijabla u koju se sprema broj tacnih odgovora

		System.out.print("Unesite broj pitanja: ");
		boolean error = true; // varijabla za provjeru
		// unos broja pitanja
		do {
			try {
				numOfQ = input.nextInt();
				if (numOfQ < 0) {
					System.out.print("Nevalidan unos, broj pitanja mora biti pozitivan, pokusajte ponovo: ");
					error = true;
				} else
					error = false;
			} catch (InputMismatchException e) {
				System.out.println("Nevalidan unos, pokusajte ponovo: \nUnesite broj pitanja: ");
				input.nextLine();
			}
		} while (error);

		for (int i = 0; i < numOfQ; i++) {
			// 2 random broja koja ce se koristiti u pitanjima
			int num1 = (int) (Math.random() * 10);
			int num2 = (int) (Math.random() * 10);

			int sumaUser = 0; // korisnikov odgovor

			if (num1 > num2) {
				num1 = num1 + num2;
				num2 = num1 - num2;
				num1 = num1 - num2;

			}

			System.out.print("Koliko je " + num2 + " - " + num1 + "? ");

			boolean error2 = true;
			// korisnikov unos sa provjerom unosa
			do {
				try {
					sumaUser = input.nextInt();
					error2 = false;
				} catch (InputMismatchException e) {
					System.out.println("Nevalidan unos, pokusajte ponovo: ");
					input.nextLine();
				}
			} while (error2);

			// provjera da li je odgovor tacan
			if ((num2 - num1) == sumaUser)
				correct++;

		}
		// krajnji ispis
		System.out.println("Od ukupnog broja od " + numOfQ + " pitanja, tacno je odgovorenih " + correct
				+ ", a netacno odgovorenih je " + (numOfQ - correct));
		input.close();

	}

}

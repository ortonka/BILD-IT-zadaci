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

		java.util.Scanner input = new java.util.Scanner(System.in);

		System.out.print("Unesite broj pitanja: ");
		boolean error = true;
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
		int correct = 0;
		for (int i = 0; i < numOfQ; i++) {

			int num1 = (int) (Math.random() * 10);
			int num2 = (int) (Math.random() * 10);
			int suma = 0;
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

			if (suma == sumaUser) {
				correct++;
				System.out.println("Cestitamo, odgovor je tacan.");
			} else {

				System.out.println("Odgovor nije tacan.");
			}

		}

		System.out.println("Od ukupnog broja od " + numOfQ + " pitanja, tacno je odgovorenih " + correct
				+ ", a netacno odgovorenih je " + (numOfQ - correct));
		input.close();

	}

}

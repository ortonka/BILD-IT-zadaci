package zadaci_13_08_2016;
/*
 *  (Izracunavanje napojnice) Napisati program koji ucitava ukupan iznos racuna koji treba
 *  uplatiti kao i procenat tog racuna kojeg zelimo platiti kao napojnicu te izracunava ukupan 
 *  racun i napojnicu. Na primjer, ukoliko korisnik unese 10 kao racun i 15 % kao procenat za 
 *  napojnicu program treba da ispise da je ukupan racun za uplatiti 11.5 a napojnica 1.5.
 *  
 *  @author ortonka
 */

import java.util.InputMismatchException;

public class Tips {

	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		// korisnik unosi iznos racuna
		System.out.print("Unesite iznos Vašeg racuna: ");
		double amount = checkInput();
		// i postotak za napojnicu
		System.out.print("Unesite procenat za napojnicu: ");
		int tipPercent = checkInputI();
		input.close();
		// racunanje napojnice
		double tipAmount = amount * (tipPercent / 100.0);
		//ispis
		System.out.println("Ukupan racun za placanje je: " + (amount + tipAmount) + ", a napojnica je: " + tipAmount);

	}

	// provjera unosa
	public static double checkInput() {
		double num = 0;
		boolean error = true;

		do {
			try {
				num = input.nextDouble();
				if(num<0)
					throw new InputMismatchException();
				error = false;

			} catch (InputMismatchException e) {
				System.out.print("Pogresan unos, pokusajte ponovo: ");
				input.nextLine();
			}
			// petlja se izvrsava dok postoji greska
		} while (error);

		return num;
	}
	
	// provjera unosa
		public static int checkInputI() {
			int num = 0;
			boolean error = true;

			do {
				try {
					num = input.nextInt();
					if(num<0)
						throw new InputMismatchException();
					error = false;

				} catch (InputMismatchException e) {
					System.out.print("Pogresan unos, pokusajte ponovo: ");
					input.nextLine();
				}
				// petlja se izvrsava dok postoji greska
			} while (error);

			return num;
		}

}

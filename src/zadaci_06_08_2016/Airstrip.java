package zadaci_06_08_2016;

import java.util.InputMismatchException;

/*
 * Ako imamo ubrzanje aviona a te brzinu pri kojoj avion uzlijece v, mozemo izracunati 
 * minimalnu duzinu piste potrebne da avion uzleti koristeci se slijedecom formulom: 
 * duzina = v * v / 2a. Napisati program koji pita korisnika da unese v u m/s i a u m/s² 
 * te ispisuje korisniku minimalnu duzinu piste. (Primjer: ukoliko unesemo 60 za brzinu i 
 * 3.5 za ubrzanje duzina piste je 514.286)
 * 
 * @author ortonka
 */

public class Airstrip {

	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Unesite brzinu u m/s: ");
		double v = checkInput(); // brzina
		System.out.print("Unesite ubrzanje u m/s²: ");
		double a = checkInput(); // ubrzanje

		double length = (v * v) / (2 * a); // duzina koju vrati metod
												// lengthOfAirstrip(v,a)
		// ispis
		System.out.printf("Minimalna duzina piste za brzinu %.2f m/s i ubrzanje %.2f m/s² je: %.3f.", v, a, length);

	}

	// provjera unosa
	public static double checkInput() {

		double n = 0;
		boolean error = true; // varijabla za provjeru

		do {
			try {
				n = input.nextDouble();
				if (n < 0)
					throw new InputMismatchException("Nevalidan unos.");
				error = false;
			} catch (InputMismatchException e) {
				System.out.print("Nevalidan unos, pokusajte ponovo:  ");
				input.nextLine();
			}
		} while (error);
		return n;
	}

}

package zadaci_11_08_2016;
/*
 * Napisati program koji pita korisnika da unese broj minuta (npr. 1 milijardu) te ispiše 
 * korisniku koliko je to u godinama i danima. Zbog jednostavnosti, pretpostavimo da godina ima 
 * 365 dana
 * 
 * @author ortonka
 */

import java.util.InputMismatchException;

public class MinInYears {

	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		// pozivanje metoda, kao argument proslijedimo rezultat metode
		// checkInput
		minInYearsAndDays(checkInput());
	}

	// metoda koja ispisuje broj godina i dana za proslijedjeni broj minuta
	public static void minInYearsAndDays(long min) {

		long years = min / 60 / 24 / 365; // broj godina
		long days = min / 60 / 24 % 365; // broj dana

		System.out.printf("%d minuta je %d godina i %d dana. ", min, years, days);
	}

	// provjera unosa
	public static long checkInput() {

		long n = 0;
		boolean error = true; // varijabla za provjeru
		// unos broja minuta
		do {
			try {
				System.out.print("Unesite broj minuta: ");
				n = input.nextLong();
				error = false;
				if (n < 0) {
					System.out.print("Unos ne moze biti negativan. ");
					error = true;
				}
			} catch (InputMismatchException e) {
				System.out.print("Nevalidan unos, pokusajte ponovo. ");
				input.nextLine();
			}
		} while (error);
		return n;
	}

}
